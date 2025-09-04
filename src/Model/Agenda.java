package Model;

/**
 *
 * @author Pedro
 */
public class Agenda {

    private int id;
    private String NomePet;
    private String HorarioConsulta;
    private String DiaConsulta;

    public Agenda() {
    }

    public Agenda(int id, String NomePet, String HorarioConsulta, String DiaConsulta) {
        this.id = id;
        this.NomePet = NomePet;
        this.HorarioConsulta = HorarioConsulta;
        this.DiaConsulta = DiaConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }

    public String getHorarioConsulta() {
        return HorarioConsulta;
    }

    public void setHorarioConsulta(String HorarioConsulta) {
        this.HorarioConsulta = HorarioConsulta;
    }

    public String getDiaConsulta() {
        return DiaConsulta;
    }

    public void setDiaConsulta(String DiaConsulta) {
        this.DiaConsulta = DiaConsulta;
    }

}
