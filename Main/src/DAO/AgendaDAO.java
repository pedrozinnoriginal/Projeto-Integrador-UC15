package DAO;

import Model.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Pedro
 */
public class AgendaDAO {

    public int insert(Agenda agenda) {

        String sql = """
            INSERT INTO agenda (pet_id, dia_consulta, horario_consulta)
            VALUES (?, ?, ?)
        """;

        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, agenda.getPetId());
            ps.setDate(2, Date.valueOf(agenda.getDiaConsulta()));
            ps.setTime(3, Time.valueOf(agenda.getHorarioConsulta()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            return rs.next() ? rs.getInt(1) : -1;

        } catch (Exception e) {

            throw new RuntimeException("Erro ao inserir Agenda no banco de dados.", e);
        }
    }

    public java.util.List<Agenda> buscarPorNomePet(String nome) {
        String sql = """
        SELECT a.* FROM agenda a
        INNER JOIN pet p ON a.pet_id = p.id
        WHERE p.nome_pet LIKE ?
    """;

        java.util.List<Agenda> lista = new java.util.ArrayList<>();

        try (Connection c = Conexao.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.setId(rs.getInt("id"));
                agenda.setPetId(rs.getInt("pet_id"));
                agenda.setDiaConsulta(rs.getDate("dia_consulta").toLocalDate());
                agenda.setHorarioConsulta(rs.getTime("horario_consulta").toLocalTime());
                lista.add(agenda);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar agenda pelo nome do pet: " + e.getMessage(), e);
        }
        return lista;
    }

}
