package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pedro
 */
public class Conexao {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/patasvida",
                    "root",
                    "@Linux378"
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro de conexão com o banco de dados", e);
        }
    }
}
