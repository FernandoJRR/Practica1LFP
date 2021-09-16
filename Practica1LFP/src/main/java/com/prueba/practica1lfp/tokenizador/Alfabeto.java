package com.prueba.practica1lfp.tokenizador;

public enum Alfabeto {
    LETRAS,
    DIGITOS,
    SIGNOS_PUNTUACION(new Character[]{'.',',',';',':'}),
    PUNTUACION_SIN_PUNTO(new Character[]{',',';',':'}),
    PUNTO(new Character[]{'.'}),
    OPERADOR(new Character[]{'+','-','*','/','%'}),
    AGRUPADOR(new Character[]{'(',')','[',']','{','}'}),
    ESPECIAL(new Character[]{'\n','\s','\t'});
        
    private final Character[] caracteres;
    
    private Alfabeto(){
        this.caracteres = new Character[]{'\s'};
    }
    private Alfabeto(Character[] caracteres){
        this.caracteres = caracteres;
    }
    
    public Character[] getCaracteres() {
        return caracteres;
    }
}
