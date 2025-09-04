package Model;

/**
 * @author Pedro
 */
/**
 * Representa um usuário do sistema.
 */
public class Usuario {

    private int id;
    private String nome;
    private String senha;
    private String cargo;

    public Usuario() {
    }

    public Usuario(int id, String nome, String senha, String cargo) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
