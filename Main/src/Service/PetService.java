package Service;

import DAO.PetDAO;
import Model.Pet;

/**
 *
 * @author Pedro
 */
public class PetService {

    private final PetDAO petDAO = new PetDAO();

    public int cadastrarPet(Pet pet) {

        if (pet == null) {
            throw new IllegalArgumentException("Pet não pode ser nulo.");
        }

        if (pet.getNomePet() == null || pet.getNomePet().isBlank()) {
            throw new IllegalArgumentException("Nome do pet é obrigatório.");
        }

        if (pet.getTutorId() <= 0) {
            throw new IllegalArgumentException("Tutor inválido.");
        }

        return petDAO.insert(pet);
    }
}
