package Seguranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Pedro
 */
public class ControleLogin {

    //Inicio
    /**
     * Centraliza a criação de conexões com o MySQL. Evita duplicação de código
     * e facilita manutenção.
     */
    // ✅ URL de conexão com os parâmetros para corrigir o erro
    // - allowPublicKeyRetrieval=true → permite que o JDBC busque a chave pública no servidor MySQL
    // - useSSL=false → desativa SSL para conexões locais, deixando mais rápido
    // - serverTimezone=UTC → evita warnings de fuso horário
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/pet"
            + "?allowPublicKeyRetrieval=true"
            + "&useSSL=false"
            + "&serverTimezone=UTC";

    // Usuário e senha do banco
    private static final String USER = "root";
    private static final String PASS = "";

    /**
     * Retorna uma conexão ativa com o banco de dados.
     *
     * @return Connection objeto que representa a conexão ativa com o banco
     * @throws SQLException se ocorrer um erro na conexão
     */
    public static Connection getConnection() throws SQLException {
        // No MySQL Connector/J 8+, o driver é carregado automaticamente,
        // então não precisamos usar Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    //Fim
}
