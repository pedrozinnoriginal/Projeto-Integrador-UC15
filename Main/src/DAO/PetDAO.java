package DAO;

import Model.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Pedro
 */
public class PetDAO {

    public int insert(Pet pet) {

        String sql = "INSERT INTO pet "
                + "(nome_pet, peso, raca, vacina, vencimento, "
                + "vermifugo, vencimento_vermifugo, controle_praga, observacao, tutor_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, pet.getNomePet());
            stmt.setString(2, pet.getPeso());
            stmt.setString(3, pet.getRaca());
            stmt.setString(4, pet.getVacina());
            stmt.setString(5, pet.getVencimento());
            stmt.setString(6, pet.getVermifugo());

            // --- CORREÇÃO DE DATA AQUI ---
            // O Banco espera DATE, mas a Model tem String - converter.
            if (pet.getVencimentoVermifugo() != null && !pet.getVencimentoVermifugo().trim().isEmpty()) {
                try {
                    // Define o formato que o usuário digita na tela (Dia/Mês/Ano)
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    // Converte para data do Java Util
                    java.util.Date date = sdf.parse(pet.getVencimentoVermifugo());
                    // Converte para data do SQL e define no statement
                    stmt.setDate(7, new java.sql.Date(date.getTime()));
                } catch (ParseException e) {
                    // Se a data estiver em formato errado, mostra o erro para o  usuário
                    throw new RuntimeException("A data do vermífugo deve ser no formato dd/MM/yyyy (ex: 01/01/2024).");
                }
            } else {
                // Se estiver vazio, manda NULL para o banco
                stmt.setNull(7, java.sql.Types.DATE);
            }
            // -----------------------------

            stmt.setString(8, pet.getControlePraga());
            stmt.setString(9, pet.getObservacao());
            stmt.setInt(10, pet.getTutorId());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro de Banco de Dados ao inserir Pet: " + e.getMessage(), e);
        }

        return -1;
    }

    public boolean existePetPorId(int petId) {
        String sql = "SELECT 1 FROM pet WHERE id = ?";
        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, petId);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao validar Pet", e);
        }
    }

    public Pet buscarPorNome(String nome) {
        String sql = "SELECT * FROM pet WHERE nome_pet = ?";
        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pet p = new Pet();
                p.setNomePet(rs.getString("nome_pet"));
                p.setPeso(String.valueOf(rs.getDouble("peso"))); // Converte decimal para String
                p.setRaca(rs.getString("raca"));
                p.setVacina(rs.getString("vacina"));
                p.setVencimento(rs.getString("vencimento"));
                p.setVermifugo(rs.getString("vermifugo"));
                p.setVencimentoVermifugo(rs.getString("vencimento_vermifugo"));
                p.setControlePraga(rs.getString("controle_praga"));
                p.setObservacao(rs.getString("observacao"));
                return p;
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar pet", e);
        }
        return null;
    }

    public int buscarIdPorNome(String nomePet) {
        String sql = "SELECT id FROM pet WHERE nome_pet = ?";
        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, nomePet);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

}
