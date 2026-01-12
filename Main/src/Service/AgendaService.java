package Service;

import DAO.AgendaDAO;
import DAO.PetDAO;
import Model.Agenda;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class AgendaService {

    private final AgendaDAO agendaDAO = new AgendaDAO();

    // Método que a tela CadastroAgenda chama agora
    public int cadastrarAgendaPorNome(String nomePet, Agenda agenda) {
        if (nomePet == null || nomePet.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do pet deve ser informado para o agendamento.");
        }
        
        PetDAO petDAO = new PetDAO();
        // Busca o ID do pet usando o nome
        int idEncontrado = petDAO.buscarIdPorNome(nomePet);

        if (idEncontrado == -1) {
            throw new IllegalArgumentException("Pet '" + nomePet + "' não encontrado no banco de dados.");
        }

        agenda.setPetId(idEncontrado);
        
        // Validações de data e hora
        if (agenda.getDiaConsulta() == null) {
            throw new IllegalArgumentException("Data da consulta é obrigatória.");
        }
        if (agenda.getHorarioConsulta() == null) {
            throw new IllegalArgumentException("Horário da consulta é obrigatório.");
        }

        return agendaDAO.insert(agenda);
    }

    public List<Agenda> listarAgendasPorNomePet(String nomePet) {
        if (nomePet == null || nomePet.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do pet deve ser informado para a pesquisa.");
        }
        return agendaDAO.buscarPorNomePet(nomePet);
    }

}
