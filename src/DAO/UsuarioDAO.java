package DAO;

import Model.Usuario;
import Seguranca.ControleLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * DAO responsável por operações de autenticação do usuário. (Só contém aqui o
 * método autenticar; outras operações CRUD podem ser adicionadas)
 */
public class UsuarioDAO {

    /**
     * Autentica o usuário pesquisando por nome e senha (a senha já deve vir em
     * SHA-256).
     *
     * @param nome Nome digitado (login)
     * @param senhaCriptografada Hash SHA-256 da senha digitada
     * @return Usuario preenchido se encontrar; null caso contrário
     */
    public Usuario autenticar(String nome, String senhaCriptografada) {
        // SQL parametrizado (use sempre PreparedStatement para evitar SQL injection)
        // ATENÇÃO: verifique aqui o nome real da tabela no seu banco (usuario / usuarios / users)
        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        // try-with-resources para garantir fechamento automático de Connection/PreparedStatement/ResultSet
        try (Connection conn = ControleLogin.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // 1) Vincula os parâmetros (?) do SQL com os valores fornecidos
            //    o primeiro ? recebe 'nome', o segundo recebe 'senhaCriptografada'
            stmt.setString(1, nome);
            stmt.setString(2, senhaCriptografada);

            // 2) Executa a consulta
            try (ResultSet rs = stmt.executeQuery()) {

                // 3) Se houver um registro (rs.next() == true), o login é válido
                if (rs.next()) {
                    Usuario usuario = new Usuario();

                    // 4) Mapeia colunas do ResultSet para o objeto Usuario
                    //    Ajuste os nomes das colunas se no banco estiverem diferentes (ex.: nome / nome_usuario)
                    usuario.setNome(rs.getString("nome"));

                    // OBS: aqui estamos colocando a senha (hash) no objeto — em muitos sistemas
                    //      não é necessário nem recomendado manter isso em memória.
                    usuario.setSenha(rs.getString("senha"));

                    // atributo cargo/perfil — útil para controle de permissões
                    usuario.setCargo(rs.getString("cargo"));

                    // Se sua tabela tiver um id (recomendado), capture-o também:
                    // usuario.setId(rs.getInt("id"));
                    // 5) Retorna o usuário populado (autenticado)
                    return usuario;
                }
            }

        } catch (Exception e) {
            // Em desenvolvimento imprime a pilha de erro; em produção use logger apropriado
            e.printStackTrace();
        }

        // Se não encontrou usuário ou ocorreu erro, retorna null
        return null;
    }
}
