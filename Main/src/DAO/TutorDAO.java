package DAO;

import Model.Tutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class TutorDAO {

    public int insert(Tutor t) {

        String sql = """
        INSERT INTO tutor
        (nome_tutor, cpf, telefone, endereco, bairro, cidade, estado, cep, email, observacao)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    """;

        try (Connection c = Conexao.getConnection(); PreparedStatement ps
                = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, t.getNomeTutor());
            ps.setString(2, t.getCpf());
            ps.setString(3, t.getTelefone());
            ps.setString(4, t.getEndereco());
            ps.setString(5, t.getBairro());
            ps.setString(6, t.getCidade());
            ps.setString(7, t.getEstado());
            ps.setString(8, t.getCep());
            ps.setString(9, t.getEmail());
            ps.setString(10, t.getObservacao());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

            return -1;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir Tutor", e);
        }
    }

    // Método para buscar um tutor pelo nome (ou parte do nome)
    public Tutor buscarPorNome(String nomeBusca) {

        // O SQL usa 'LIKE' para permitir buscar por partes do nome
        String sql = "SELECT * FROM tutor WHERE nome_tutor LIKE ?";

        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            // O sinal % serve para buscar qualquer coisa antes ou depois do texto digitado
            ps.setString(1, "%" + nomeBusca + "%");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Tutor t = new Tutor();
                t.setId(rs.getInt("id"));
                t.setNomeTutor(rs.getString("nome_tutor"));
                t.setCpf(rs.getString("cpf"));
                t.setTelefone(rs.getString("telefone"));
                t.setEndereco(rs.getString("endereco"));
                t.setBairro(rs.getString("bairro"));
                t.setCidade(rs.getString("cidade"));
                t.setEstado(rs.getString("estado"));
                t.setCep(rs.getString("cep"));
                t.setEmail(rs.getString("email"));
                t.setObservacao(rs.getString("observacao"));

                // Obs: O nome do Pet não vem dessa tabela, então deixamos vazio ou null aqui
                return t;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar Tutor", e);
        }

        return null; // Retorna nulo se não achar ninguem
    }

}
