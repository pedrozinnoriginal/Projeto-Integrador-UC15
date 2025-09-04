package DAO;

import Model.Pet;
import Seguranca.ControleLogin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO (Data Access Object) responsável por isolar o acesso ao banco de dados
 * para a entidade Pet. Aqui ficam os SQLs e o mapeamento ResultSet -> Objeto.
 *
 * Pré-requisitos no banco: - Tabela: cadastropet - Colunas: id (PK
 * auto_increment), nomepet, peso, raca, vacinas, vencimento, vermifugo,
 * vencvermifugo, controlepraga, observacao
 *
 * Observação: ControleLogin.getConnection() deve retornar uma Connection
 * válida.
 */
public class PetDAO {

    // ===========================
    // INSERT
    // ===========================
    /**
     * Insere um novo Pet na base e devolve o ID gerado.
     *
     * @param p Objeto Pet já preenchido nos campos obrigatórios.
     * @return id (>0) se sucesso; -1 se falha.
     */
    public int insert(Pet p) {

        // SQL com placeholders (?) para evitar SQL injection e facilitar o bind.
        final String sql
                = "INSERT INTO cadastropet "
                + "(nomepet, peso, raca, vacinas, vencimento, vermifugo, vencvermifugo, controlepraga,  observacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        // try-with-resources fecha automaticamente Connection e PreparedStatement
        try (Connection conn = ControleLogin.getConnection(); // RETURN_GENERATED_KEYS permite recuperar o id auto_increment
                 PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Preenche cada ? do SQL na mesma ordem
            st.setString(1, p.getNomePet());
            st.setString(2, p.getPeso());
            st.setString(3, p.getRaca());
            st.setString(4, p.getVacina());
            st.setString(5, p.getVencimento());
            st.setString(6, p.getVermifugo());
            st.setString(7, p.getVencimentoVermifugo());
            st.setString(8, p.getControlePraga());
            st.setString(9, p.getObservacao());

            // Executa o INSERT e verifica quantas linhas foram afetadas
            int affected = st.executeUpdate();
            if (affected == 0) {
                // Nenhuma linha inserida => algo falhou
                return -1;
            }

            // Recupera a chave gerada (id) e devolve ao chamador
            try (ResultSet keys = st.getGeneratedKeys()) {
                if (keys.next()) {
                    int id = keys.getInt(1); // 1ª coluna das chaves geradas
                    p.setId(id);             // atualiza o objeto em memória
                    return id;               // retorna o id para a camada de cima
                }
            }

        } catch (SQLException ex) {
            // Em produção, prefira usar um logger. Aqui deixamos o stack trace para depuração.
            ex.printStackTrace();
        }

        // Se chegou aqui, houve falha em algum ponto
        return -1;
    }

    // ===========================
    // LISTAR TODOS
    // ===========================
    /**
     * Lista todos os pets cadastrados, ordenados por nome.
     *
     * @return lista possivelmente vazia (nunca null).
     */
    public List<Pet> listAll() {
        List<Pet> list = new ArrayList<>();

        // SELECT simples com ordenação
        final String sql = "SELECT * FROM cadastropet ORDER BY nomepet";

        // try-with-resources também fecha ResultSet automaticamente
        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql); ResultSet rs = st.executeQuery()) {

            // Percorre cada linha do resultado
            while (rs.next()) {
                // Mapeia linha -> objeto Pet
                Pet p = new Pet();
                p.setId(rs.getInt("id"));
                p.setNomePet(rs.getString("nomepet"));
                p.setPeso(rs.getString("peso"));
                p.setRaca(rs.getString("raca"));
                p.setVacina(rs.getString("vacinas"));
                p.setVencimento(rs.getString("vencimento"));
                p.setVermifugo(rs.getString("vermifugo"));
                p.setVencimentoVermifugo(rs.getString("vencvermifugo"));
                p.setControlePraga(rs.getString("controlepraga"));
                p.setObservacao(rs.getString("observacao"));

                // Adiciona o objeto montado à lista final
                list.add(p);
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
     * Busca um pet específico pelo ID.
     *
     * @param id chave primária no banco.
     * @return Pet se encontrado; null caso não exista.
     */
    public Pet findById(int id) {
        final String sql = "SELECT * FROM cadastropet WHERE id = ?";

        try (Connection conn = ControleLogin.getConnection(); PreparedStatement st = conn.prepareStatement(sql)) {

            // Define o parâmetro do WHERE
            st.setInt(1, id);

            // Executa a consulta
            try (ResultSet rs = st.executeQuery()) {
                // Se existe linha, monta e retorna o objeto
                if (rs.next()) {
                    Pet p = new Pet();
                    p.setId(rs.getInt("id"));
                    p.setNomePet(rs.getString("nomepet"));
                    p.setPeso(rs.getString("peso"));
                    p.setRaca(rs.getString("raca"));
                    p.setVacina(rs.getString("vacinas"));
                    p.setVencimento(rs.getString("vencimento"));
                    p.setVermifugo(rs.getString("vermifugo"));
                    p.setVencimentoVermifugo(rs.getString("vencvermifugo"));
                    p.setControlePraga(rs.getString("controlepraga"));
                    p.setObservacao(rs.getString("observacao"));
                    return p;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Não encontrou registro com esse id
        return null;
    }

    // Fim da classe PetDAO
}
