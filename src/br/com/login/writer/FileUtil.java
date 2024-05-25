package br.com.login.writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    
    private static final String FILE_PATH = "email.txt";
    
    public static void salvarEmail(String email) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static String lerEmail() {
        StringBuilder email = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                email.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }     
        return email.toString();
    }    
    
    public static void deletarArquivo() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            if (file.delete()) {

            } else {
                System.err.println("Falha ao deletar o arquivo.");
            }
        }
    }
}
