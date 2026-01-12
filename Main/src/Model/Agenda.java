package Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Pedro
 */
public class Agenda {

    private int id;
    private int petId;
    private LocalDate diaConsulta;
    private LocalTime horarioConsulta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDiaConsulta() {
        return diaConsulta;
    }

    public void setDiaConsulta(LocalDate diaConsulta) {
        this.diaConsulta = diaConsulta;
    }

    public LocalTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
}
