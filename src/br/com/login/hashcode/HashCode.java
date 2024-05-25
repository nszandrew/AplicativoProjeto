package br.com.login.hashcode;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class HashCode {
public String hashPassword(String password) {
        try {
            // Cria uma instância do algoritmo de hash SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Aplica o algoritmo de hash na senha
            byte[] hashedBytes = digest.digest(password.getBytes());
            
            // Converte os bytes em representação hexadecimal
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }    
    }
}



 

