package DAO;

import Model.Tutor;
import Seguranca.ControleLogin; // Classe que centraliza getConnection()
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para Tutor: - inserir tutor - listar todos - buscar por id
 *
 * Observação: este DAO pressupõe que existe uma tabela chamada "cadastrotutor"
 * com colunas correspondentes aos campos usados abaixo.
 */
public class TutorDAO {

    // =========================
    // Inserir novo tutor (CREATE)
    // =========================
    /**
     * Insere um Tutor no banco.
     *
     * @param t objeto Tutor preenchido com os dados a inserir
     * @return id gerado (>0) em caso de sucesso, ou -1 em caso de erro
     */
    public int insert(Tutor t) {
        // SQL parametrizado: cada ? será substituído por um valor via PreparedStatement.
        // IMPORTANTE: a ordem dos placeholders (?) deve corresponder exatamente
        // à ordem dos st.setString(...) abaixo.
        final String sql = "INSERT INTO cadastrotutor "
                + "(nometutor, cpf, nomepet, endereco, bairro, cidade, estado, cep, telefone, email, observacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        /*
         * try-with-resources: abre Connection e PreparedStatement e garante que serão fechados
         * automaticamente ao final do bloco (mesmo em caso de exceção).
         * Statement.RETURN_GENERATED_KEYS permite recuperar o id (auto_increment) gerado.
         */
        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // ----- Bind (vincular) dos parâmetros -----
            // A posição (1..11) corresponde à ordem dos ? no SQL acima.
            st.setString(1, t.getNomeTutor());   // nometutor
            st.setString(2, t.getCPF());         // cpf
            st.setString(3, t.getNomePet());    // nomepet  <-- CORREÇÃO: não "estado" aqui
            st.setString(4, t.getEndereco());   // endereco
            st.setString(5, t.getBairro());     // bairro
            st.setString(6, t.getCidade());     // cidade
            st.setString(7, t.getEstado());     // estado
            st.setString(8, t.getCEP());        // cep
            st.setString(9, t.getTelefone());   // telefone
            st.setString(10, t.getEmail());     // email
            st.setString(11, t.getObservacao()); // observacao

            // Executa o INSERT no banco
            int affected = st.executeUpdate();

            // Se nenhuma linha foi afetada, o INSERT falhou
            if (affected == 0) {
                return -1;
            }

            // Recupera o id gerado pelo banco (auto_increment)
            try (ResultSet keys = st.getGeneratedKeys()) {
                if (keys.next()) {
                    int id = keys.getInt(1); // primeira coluna do ResultSet de chaves
                    t.setId(id);            // atualiza o objeto em memória, útil depois do insert
                    return id;
                } else {
                    // Inserção ocorreu mas não conseguimos recuperar a chave
                    return -1;
                }
            }

        } catch (SQLException ex) {
            // Para desenvolvimento: ex.printStackTrace(); em produção: use um logger.
            ex.printStackTrace();
            return -1;
        }
    }

    // =========================
    // Listar todos (READ)
    // =========================
    /**
     * Retorna todos os tutores cadastrados.
     *
     * @return lista (pode ser vazia se não houver registros)
     */
    public List<Tutor> listAll() {
        List<Tutor> lista = new ArrayList<>();

        // Use o mesmo nome de tabela ("cadastrotutor") que usamos no insert
        final String sql = "SELECT * FROM cadastrotutor ORDER BY nometutor";

        // Abre conexão e executa a query
        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

            // percorre cada linha do ResultSet e mapeia para um objeto Tutor
            while (rs.next()) {
                Tutor t = new Tutor();
                t.setId(rs.getInt("id"));              // coluna id (INT)
                t.setNomeTutor(rs.getString("nometutor"));
                t.setCPF(rs.getString("cpf"));
                t.setNomePet(rs.getString("nomepet"));
                t.setEndereco(rs.getString("endereco"));
                t.setBairro(rs.getString("bairro"));
                t.setCidade(rs.getString("cidade"));
                t.setEstado(rs.getString("estado"));
                t.setCEP(rs.getString("cep"));
                t.setTelefone(rs.getString("telefone"));
                t.setEmail(rs.getString("email"));
                t.setObservacao(rs.getString("observacao"));

                lista.add(t);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    // =========================
    // Buscar por ID (READ)
    // =========================
    /**
     * Busca tutor pelo id.
     *
     * @param id identificador do tutor
     * @return Tutor (preenchido) ou null se não encontrado
     */
    public Tutor findById(int id) {
        final String sql = "SELECT * FROM cadastrotutor WHERE id = ?";

        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

            // Substitui o primeiro placeholder (?) pelo id informado
            st.setInt(1, id);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    Tutor t = new Tutor();
                    t.setId(rs.getInt("id"));
                    t.setNomeTutor(rs.getString("nometutor"));
                    t.setCPF(rs.getString("cpf"));
                    t.setNomePet(rs.getString("nomepet"));
                    t.setEndereco(rs.getString("endereco"));
                    t.setBairro(rs.getString("bairro"));
                    t.setCidade(rs.getString("cidade"));
                    t.setEstado(rs.getString("estado"));
                    t.setCEP(rs.getString("cep"));
                    t.setTelefone(rs.getString("telefone"));
                    t.setEmail(rs.getString("email"));
                    t.setObservacao(rs.getString("observacao"));
                    return t;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Retorna null quando não encontrado ou em caso de erro
        return null;
    }

    //Fim
}
