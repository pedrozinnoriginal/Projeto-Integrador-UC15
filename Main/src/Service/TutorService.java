package Service;

import DAO.TutorDAO;
import Model.Tutor;

/**
 *
 * @author Pedro
 */
public class TutorService {

    private final TutorDAO tutorDAO;

    /**
     * Injeção simples do DAO. Facilita testes e manutenção futura.
     */
    public TutorService() {
        this.tutorDAO = new TutorDAO();
    }

    /**
     * Cadastra um novo Tutor no sistema.
     *
     * @param tutor objeto Tutor preenchido pela camada de apresentação
     * @return id gerado no banco (>0) ou -1 em erro
     */
    public int cadastrarTutor(Tutor tutor) {

        // ---------- Validações de negócio
        if (tutor == null) {
            throw new IllegalArgumentException("Tutor não pode ser nulo.");
        }

        if (tutor.getNomeTutor() == null || tutor.getNomeTutor().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do tutor é obrigatório.");
        }
        if (tutor.getCpf() == null || tutor.getCpf().trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do tutor é obrigatório.");
        }

        // ---------- Persistência delegada ao DAO
        return tutorDAO.insert(tutor);
    }

    public Tutor buscarTutorPorNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Digite um nome para pesquisar.");
        }
        return tutorDAO.buscarPorNome(nome);
    }

}
