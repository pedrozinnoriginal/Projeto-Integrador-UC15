package Model;

/**
 *
 * @author Pedro
 */
public class Pet {

    private int id;
    private String NomePet;
    private String Peso;
    private String Raca;
    private String Vacina;
    private String Vencimento;
    private String Vermifugo;
    private String VencimentoVermifugo;
    private String ControlePraga;
    private String Observacao;

    public Pet() {
    }

    public Pet(int id, String NomePet, String Peso, String Raca, String Vacina, String Vencimento, String Vermifugo, String VencimentoVermifugo, String ControlePraga, String Observacao) {
        this.id = id;
        this.NomePet = NomePet;
        this.Peso = Peso;
        this.Raca = Raca;
        this.Vacina = Vacina;
        this.Vencimento = Vencimento;
        this.Vermifugo = Vermifugo;
        this.VencimentoVermifugo = VencimentoVermifugo;
        this.ControlePraga = ControlePraga;
        this.Observacao = Observacao;
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

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getVacina() {
        return Vacina;
    }

    public void setVacina(String Vacina) {
        this.Vacina = Vacina;
    }

    public String getVencimento() {
        return Vencimento;
    }

    public void setVencimento(String Vencimento) {
        this.Vencimento = Vencimento;
    }

    public String getVermifugo() {
        return Vermifugo;
    }

    public void setVermifugo(String Vermifugo) {
        this.Vermifugo = Vermifugo;
    }

    public String getVencimentoVermifugo() {
        return VencimentoVermifugo;
    }

    public void setVencimentoVermifugo(String VencimentoVermifugo) {
        this.VencimentoVermifugo = VencimentoVermifugo;
    }

    public String getControlePraga() {
        return ControlePraga;
    }

    public void setControlePraga(String ControlePraga) {
        this.ControlePraga = ControlePraga;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

}
