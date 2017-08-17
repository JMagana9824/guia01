package com.mycompany.guia01;
public class Utilities {
    
    public String getResume(String texto){
        String txt= "";
        if(txt.length()>30){
            for(int i=0; i<30; i++){
                txt=txt+String.valueOf(i);
            }
        }
        else {
            txt=texto;
        }
        return texto;
    }
    
    public String capitalizar (String texto){
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
