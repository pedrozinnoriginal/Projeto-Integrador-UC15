package DAO;

import Model.Agenda;
import Seguranca.ControleLogin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO (Data Access Object) responsável por ler/gravar dados de Agenda na base
 * de dados. Centraliza o acesso ao banco e isola SQL da camada de tela.
 *
 * Pré-requisitos: - A classe ControleLogin.getConnection() deve devolver uma
 * Connection válida. - Tabela 'cadastroagenda' deve existir com as colunas: id
 * (PK auto_increment), nomepet, horarioconsulta, diaconsulta.
 */
public class AgendaDAO {

    // ===========================
    // INSERT
    // ===========================
    /**
     * Insere uma Agenda no banco e retorna o ID gerado (auto_increment).
     *
     * @param a Objeto Agenda já preenchido (nome, horário e dia).
     * @return id gerado (>0) se sucesso; -1 em caso de falha.
     */
    public int insert(Agenda a) {

        // SQL com placeholders (?) para evitar SQL injection
        final String sql
                = "INSERT INTO cadastroagenda (nomepet, horarioconsulta, diaconsulta) VALUES (?, ?, ?)";

        // try-with-resources garante fechamento automático de Connection/PreparedStatement
        try (Connection conn = ControleLogin.getConnection(); // RETURN_GENERATED_KEYS permite recuperar o ID criado no INSERT
                 PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // 1) Seta os parâmetros do SQL, na mesma ordem dos ? acima
            st.setString(1, a.getNomePet());
            st.setString(2, a.getHorarioConsulta());
            st.setString(3, a.getDiaConsulta());

            // 2) Executa o INSERT. Retorna quantas linhas foram afetadas
            int affected = st.executeUpdate();

            // 3) Se nenhuma linha foi inserida, algo deu errado
            if (affected == 0) {
                return -1;
            }

            // 4) Busca a chave gerada (id auto_increment) e devolve ao chamador
            try (ResultSet keys = st.getGeneratedKeys()) {
                if (keys.next()) {
                    int id = keys.getInt(1); // primeiro campo das chaves geradas
                    a.setId(id);             // atualiza o objeto em memória
                    return id;               // devolve para a camada de cima (tela/serviço)
                }
            }

        } catch (SQLException ex) {
            // Em produção, prefira logar com um logger (ex.: SLF4J) ao invés de printStackTrace
            ex.printStackTrace();
        }

        // 5) Se chegou aqui, houve erro em algum ponto
        return -1;
    }

    // ===========================
    // LISTAR TODOS
    // ===========================
    /**
     * Retorna todas as agendas ordenadas por dia e horário.
     *
     * @return Lista possivelmente vazia (nunca null).
     */
    public List<Agenda> listAll() {
        // Lista que será preenchida com os resultados do SELECT
        List<Agenda> list = new ArrayList<>();

        // Ordena primeiro por dia e depois por horário
        final String sql
                = "SELECT * FROM cadastroagenda ORDER BY diaconsulta, horarioconsulta";

        // try-with-resources para Connection, PreparedStatement e ResultSet
        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

            // Percorre cada linha retornada pelo banco
            while (rs.next()) {
                Agenda a = new Agenda();
                // Mapeia coluna -> atributo do objeto (mesmos nomes das colunas da tabela)
                a.setId(rs.getInt("id"));
                a.setNomePet(rs.getString("nomepet"));
                a.setHorarioConsulta(rs.getString("horarioconsulta"));
                a.setDiaConsulta(rs.getString("diaconsulta"));
                // Adiciona o objeto montado na lista final
                list.add(a);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Retorna a lista (vazia se não houver registros ou ocorreu erro)
        return list;
    }

    // ===========================
    // BUSCAR POR ID
    // ===========================
    /**
     * Busca uma agenda específica pela chave primária (id).
     *
     * @param id Identificador da agenda no banco.
     * @return Objeto Agenda se encontrado; null se não existir.
     */
    public Agenda findById(int id) {
        final String sql = "SELECT * FROM cadastroagenda WHERE id = ?";

        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

            // Define o valor do parâmetro do WHERE (posição 1)
            st.setInt(1, id);

            // Executa a consulta e tenta posicionar no primeiro registro
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    // Monta o objeto Agenda com os dados retornados
                    Agenda a = new Agenda();
                    a.setId(rs.getInt("id"));
                    a.setNomePet(rs.getString("nomepet"));
                    a.setHorarioConsulta(rs.getString("horarioconsulta"));
                    a.setDiaConsulta(rs.getString("diaconsulta"));
                    return a; // retorna ao chamador
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Não encontrou registro com esse id
        return null;
    }
}
