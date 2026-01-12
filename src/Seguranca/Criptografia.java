package Seguranca;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Pedro
 */
/**
 * Utilitário de criptografia: SHA-256.
 */
public class Criptografia {

    //Inicio
    /**
     * Gera o hash SHA-256 de um texto.
     *
     * @param texto Texto que será convertido em hash
     * @return Hash em formato hexadecimal
     */
    public static String getSHA256(String texto) {
        try {
            // Cria instância para SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Calcula o hash (retorna bytes)
            byte[] messageDigest = md.digest(texto.getBytes());

            // Converte para número positivo (BigInteger)
            BigInteger no = new BigInteger(1, messageDigest);

            // Converte para string hexadecimal
            String hashtext = no.toString(16);

            // Preenche com zeros à esquerda até ter 64 caracteres (256 bits)
            while (hashtext.length() < 64) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    //Fim
}
