package Model;

/**
 *
 * @author Pedro
 */
public class Tutor {

    private int id;
    private String NomeTutor;
    private String CPF;
    private String Estado;
    private String NomePet;
    private String Endereco;
    private String Cidade;
    private String CEP;
    private String Bairro;
    private String Telefone;
    private String Email;
    private String Observacao;

    public Tutor() {
    }

    public Tutor(int id, String NomeTutor, String CPF, String Estado, String NomePet, String Endereco, String Cidade, String CEP, String Bairro, String Telefone, String Email, String Observacao) {
        this.id = id;
        this.NomeTutor = NomeTutor;
        this.CPF = CPF;
        this.Estado = Estado;
        this.NomePet = NomePet;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Observacao = Observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTutor() {
        return NomeTutor;
    }

    public void setNomeTutor(String NomeTutor) {
        this.NomeTutor = NomeTutor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

}
