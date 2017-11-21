/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal;

/**
 *
 * @author JoseCarlos
 */
public class Cesar {
    static String alfabetoMin = "abcdefghijklmnñopqrstuvwxyz"; 
    static String alfabetoMay = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"; 
    
   /**
    * Método para cifrar
    * @param frase frase a cifrar
    * @param distancia distancia que se quiere cifrar
    * @return 
    */
    String cifrarCesar(String frase, int distancia){
        String textoCifrado = "";
        for(int i = 0;i<frase.length();i++){ 
            
            if((alfabetoMin.indexOf(frase.charAt(i)) != -1) || (alfabetoMay.indexOf(frase.charAt(i)) != -1)){ 
                //Operadores 
                if(alfabetoMin.indexOf(frase.charAt(i)) != -1){
                    textoCifrado+= alfabetoMin.charAt( ( (alfabetoMin.indexOf(frase.charAt(i)) )+distancia)%alfabetoMin.length() );
                }
                else{
                    textoCifrado+= alfabetoMay.charAt(( alfabetoMay.indexOf(frase.charAt(i)) +distancia)%alfabetoMay.length());
                }
                
            }else {
                textoCifrado += frase.charAt(i); }
        } 
        return textoCifrado; 
    }
    String cifrarCesar(String frase, String alfabeto, int distancia){
        String textoCifrado = "";
        for(int i = 0;i<frase.length();i++){ 
            
            if((alfabeto.indexOf(frase.charAt(i)) != -1) || (alfabeto.indexOf(frase.charAt(i)) != -1)){ 
                //Operadores 
                if(alfabeto.indexOf(frase.charAt(i)) != -1){
                    textoCifrado+= alfabeto.charAt( ( (alfabeto.indexOf(frase.charAt(i)) )+distancia)%alfabeto.length() );
                }
                else{
                    textoCifrado+= alfabeto.charAt(( alfabeto.indexOf(frase.charAt(i)) +distancia)%alfabeto.length());
                }
                
            }else {
                textoCifrado += frase.charAt(i); }
        } 
        return textoCifrado; 
    }
}
