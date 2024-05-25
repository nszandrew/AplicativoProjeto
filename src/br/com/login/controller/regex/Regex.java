package br.com.login.controller.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    
   
    public boolean validarEmail(String email){
        String regex = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean validarTelefone(String telefone){
        String regex = "^\\d{11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);
        return matcher.matches();
        
    }
}
