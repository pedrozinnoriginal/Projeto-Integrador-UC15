package Model;

/**
 *
 * @author Pedro
 */
public class Pet {

    private int id;
    private String nomePet;
    private String peso;
    private String raca;
    private String vacina;
    private String vencimento;
    private String vermifugo;
    private String vencimentoVermifugo;
    private String controlePraga;
    private String observacao;
    private int tutorId;

    // GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVermifugo() {
        return vermifugo;
    }

    public void setVermifugo(String vermifugo) {
        this.vermifugo = vermifugo;
    }

    public String getVencimentoVermifugo() {
        return vencimentoVermifugo;
    }

    public void setVencimentoVermifugo(String vencimentoVermifugo) {
        this.vencimentoVermifugo = vencimentoVermifugo;
    }

    public String getControlePraga() {
        return controlePraga;
    }

    public void setControlePraga(String controlePraga) {
        this.controlePraga = controlePraga;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

}
