package com.prueba.practica1lfp.tokenizador;

public class FuncionTransicion {
    static Character[] estados = {'A','B','C','D','E','F','G','H','X'};
    Character[] estadosAceptacion = {'B','C','E','F','G','H'};
    
    static Object[][] transiciones = {
        {'A',Alfabeto.LETRAS,'B'}, {'A',Alfabeto.DIGITOS,'C'}, {'A',Alfabeto.SIGNOS_PUNTUACION,'F'},{'A',Alfabeto.AGRUPADOR,'G'},{'A',Alfabeto.OPERADOR,'H'},{'A',Alfabeto.ESPECIAL,'A'},
        {'B',Alfabeto.LETRAS,'B'}, {'B',Alfabeto.DIGITOS,'B'}, {'B',Alfabeto.SIGNOS_PUNTUACION,'F'},{'B',Alfabeto.AGRUPADOR,'G'},{'B',Alfabeto.OPERADOR,'H'},{'B',Alfabeto.ESPECIAL,'A'},
        {'C',Alfabeto.LETRAS,'A'}, {'C',Alfabeto.DIGITOS,'C'}, {'C',Alfabeto.PUNTUACION_SIN_PUNTO,'F'},{'C',Alfabeto.AGRUPADOR,'G'},{'C',Alfabeto.OPERADOR,'G'},{'C',Alfabeto.ESPECIAL,'A'},{'C',Alfabeto.PUNTO,'D'},
        {'D',Alfabeto.LETRAS,'X'}, {'D',Alfabeto.DIGITOS,'E'}, {'D',Alfabeto.SIGNOS_PUNTUACION,'X'},{'D',Alfabeto.AGRUPADOR,'X'},{'D',Alfabeto.OPERADOR,'H'},{'D',Alfabeto.ESPECIAL,'A'},
        {'E',Alfabeto.LETRAS,'A'}, {'E',Alfabeto.DIGITOS,'E'}, {'E',Alfabeto.SIGNOS_PUNTUACION,'F'},{'E',Alfabeto.AGRUPADOR,'G'},{'E',Alfabeto.OPERADOR,'H'},{'E',Alfabeto.ESPECIAL,'A'},
        {'F',Alfabeto.LETRAS,'B'}, {'F',Alfabeto.DIGITOS,'C'}, {'F',Alfabeto.SIGNOS_PUNTUACION,'F'},{'F',Alfabeto.AGRUPADOR,'G'},{'F',Alfabeto.OPERADOR,'H'},{'F',Alfabeto.ESPECIAL,'A'},
        {'G',Alfabeto.LETRAS,'B'}, {'G',Alfabeto.DIGITOS,'C'}, {'G',Alfabeto.SIGNOS_PUNTUACION,'F'},{'G',Alfabeto.AGRUPADOR,'G'},{'G',Alfabeto.OPERADOR,'H'},{'G',Alfabeto.ESPECIAL,'A'},
        {'H',Alfabeto.LETRAS,'B'}, {'H',Alfabeto.DIGITOS,'C'}, {'H',Alfabeto.SIGNOS_PUNTUACION,'F'},{'H',Alfabeto.AGRUPADOR,'G'},{'H',Alfabeto.OPERADOR,'H'},{'H',Alfabeto.ESPECIAL,'A'},
        {'X',Alfabeto.LETRAS,'B'}, {'X',Alfabeto.DIGITOS,'C'}, {'X',Alfabeto.SIGNOS_PUNTUACION,'F'},{'X',Alfabeto.AGRUPADOR,'G'},{'X',Alfabeto.OPERADOR,'H'},{'X',Alfabeto.ESPECIAL,'A'},
    };
    
    static Character estadoInicial = 'A';
    
    public static boolean esParteDeConjunto(Character caracter, Alfabeto conjunto){
        if (conjunto == Alfabeto.LETRAS) {
            if (Character.isLetter(caracter)) {
                return true;
            }
            return false;
        }
        if (conjunto == Alfabeto.DIGITOS) {
            if (Character.isDigit(caracter)) {
                return true;
            }
            return false;
        }
        for (Character simbolo : conjunto.getCaracteres()) {
            if (caracter.equals(simbolo)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean esAceptacion(Character estadoActual){
        for (Character estado : estados) {
            if (estado.equals(estadoActual)) {
                return true;
            }
        }
        return false;
    }
    
    public static String tipoToken(Character estado){
        switch (estado) {
            case 'B':
                return "IDENTIFICADOR";
            case 'C':
                return "ENTERO";
            case 'E':
                return "DECIMAL";
            case 'F':
                return "PUNTUACION";
            case 'G':
                return "AGRUPACION";
            case 'H':
                return "OPERADOR";
            default:
                return "ERROR";
        }
    }
}



