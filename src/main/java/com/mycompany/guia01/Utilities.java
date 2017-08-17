package com.mycompany.guia01;
public class Utilities {
            
    /**
     * Este método hace un resumen de un texto , devolviendo los primeros 30 caracteres
     * @param texto Esta es la variable que recibirá un texto 
     * @return Acá devolvera los primeros 30 caracteres de un texto
     */
    public String getResume(String texto){
         String txt= "";
        if(texto.length()>30){
            for(int letra=0; letra<30; letra++){
                txt=txt+String.valueOf(texto.charAt(letra));
            }
        }
        else {
            txt=texto;
        }
        return txt;
    }
    
    
    /**
     * ESte método Capitaliza la primera letra de las palabras de una frase
     * @param texto 
     * @return 
     */
    public String capitalizar (String texto){
        
        texto=texto.replaceAll("  ", " ");
        char [] caracter= texto.toCharArray();
        for(int i=0; i<texto.length(); i++){
            if(caracter[i]==' ' || caracter[i]=='.' || caracter[i]==','){
                caracter[i+1]=Character.toUpperCase(caracter[i+1]);
            }
            else{
                caracter[0]=Character.toUpperCase(caracter[0]);
            }
        }
        return new String (caracter);
    }
    
    
    
}
