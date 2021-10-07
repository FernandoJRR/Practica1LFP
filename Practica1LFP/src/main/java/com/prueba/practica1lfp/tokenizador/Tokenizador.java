package com.prueba.practica1lfp.tokenizador;

import java.util.ArrayList;
import java.util.HashMap;

public class Tokenizador {
    private static ArrayList<Token> tokens = new ArrayList<>();
    private static String bufferTokenActual = "";
    private static int[] posicion = new int[2];
    private static int sizeTab = 0;

    public static ArrayList<Token> tokenizar(String statement){
        statement = statement.trim();
        tokens = new ArrayList<>();
        bufferTokenActual = "";
        Object[][] transiciones = FuncionTransicion.transiciones;
        Character estadoActual = FuncionTransicion.estadoInicial;
        Object[] funcionTransicion = null;
        posicion[0] = 0;
        posicion[1] = 1;
        for (int i = 0; i < statement.length(); i++) {
            for (Object[] funcion : transiciones) {
                funcionTransicion = null;
                if (((Character)funcion[0]).equals(estadoActual) && FuncionTransicion.esParteDeConjunto(statement.charAt(i), (Alfabeto)funcion[1])) {
                    funcionTransicion = funcion;
                    break;
                }
            }
            //Obtenemos el estado al que nos moveremos
            Character estadoSiguiente = null;
            if(funcionTransicion==null){
                estadoSiguiente = 'X';
            } else {
                estadoSiguiente = (Character)funcionTransicion[2];
            }
            
            //Maquina de Mealy
            if (estadoActual.equals('A')&&estadoSiguiente.equals('A')) {
            } else if(estadoActual.equals('A')&& (estadoSiguiente.equals('B')||estadoSiguiente.equals('C'))){
                bufferTokenActual += statement.charAt(i);
            } else if(estadoActual.equals('A')&& (estadoSiguiente.equals('F')||estadoSiguiente.equals('G')||estadoSiguiente.equals('H')||estadoSiguiente.equals('X'))){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if((estadoActual.equals('B')||estadoActual.equals('C')) &&estadoSiguiente.equals('A')){
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
            } else if(estadoActual.equals('B')&&estadoSiguiente.equals('B')){
                bufferTokenActual += statement.charAt(i);
            } else if((estadoActual.equals('B')||estadoActual.equals('C')) && (estadoSiguiente.equals('F')||estadoSiguiente.equals('G')||estadoSiguiente.equals('H'))){
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if(estadoActual.equals('B')&&estadoSiguiente.equals('X')){
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if(estadoActual.equals('C')&& (estadoSiguiente.equals('C')||estadoSiguiente.equals('D'))){
                bufferTokenActual += statement.charAt(i);
            } else if(estadoActual.equals('C')&&estadoSiguiente.equals('X')){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if(estadoActual.equals('D')&&estadoSiguiente.equals('A')){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
            } else if(estadoActual.equals('D')&&estadoSiguiente.equals('E')){
                bufferTokenActual += statement.charAt(i);
            } else if(estadoActual.equals('D')&&estadoSiguiente.equals('X')){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
            } else if(estadoActual.equals('E')&&estadoSiguiente.equals('A')){
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
            } else if(estadoActual.equals('E')&&estadoSiguiente.equals('E')){
                bufferTokenActual += statement.charAt(i);
            } else if(estadoActual.equals('E')&& (estadoSiguiente.equals('F')||estadoSiguiente.equals('G')||estadoSiguiente.equals('H'))){
                agregarToken(FuncionTransicion.tipoToken(estadoActual),bufferTokenActual);
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if(estadoActual.equals('E')&&estadoSiguiente.equals('X')){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if((estadoActual.equals('F')||estadoActual.equals('G')||estadoSiguiente.equals('H')) &&estadoSiguiente.equals('A')){
            } else if((estadoActual.equals('F')||estadoActual.equals('G')||estadoSiguiente.equals('H')) && (estadoSiguiente.equals('B')||estadoSiguiente.equals('C'))){
                bufferTokenActual += statement.charAt(i);
            } else if((estadoActual.equals('F')||estadoActual.equals('G')||estadoSiguiente.equals('H')) && (estadoSiguiente.equals('F')||estadoSiguiente.equals('G')||estadoSiguiente.equals('H')||estadoSiguiente.equals('X'))){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else if(estadoActual.equals('X')&&estadoSiguiente.equals('A')){
            } else if(estadoActual.equals('X')&& (estadoSiguiente.equals('B')||estadoSiguiente.equals('C'))){
                bufferTokenActual += statement.charAt(i);
            } else if(estadoActual.equals('X')&&((estadoSiguiente.equals('F')||estadoSiguiente.equals('G')||estadoSiguiente.equals('H')||estadoSiguiente.equals('X')))){
                bufferTokenActual += statement.charAt(i);
                agregarToken(FuncionTransicion.tipoToken(estadoSiguiente),bufferTokenActual);
            } else {
                bufferTokenActual += statement.charAt(i);
            }

            //Nos movemos de estado
            estadoActual = estadoSiguiente;
            
            posicion[0]++;
            if (FuncionTransicion.esParteDeConjunto(statement.charAt(i), Alfabeto.ESPECIAL)) {
                switch (statement.charAt(i)) {
                    case '\n':
                        posicion[1]++;
                        posicion[0] = 0;
                        break;
                    case '\t':
                        posicion[0] += sizeTab;
                        break;
                }
            }
        }
        
        //Si quedan caracteres en el buffer este se vacia
        if (bufferTokenActual.length()>0) {
            agregarToken(FuncionTransicion.tipoToken(estadoActual), bufferTokenActual);
        }
        return tokens;
    }
    
    public static void setSizeTab(int sizeTab) {
        Tokenizador.sizeTab = sizeTab;
    }

    private static void agregarToken(String tipoToken, String lexema){
        int[] posicionToken = {posicion[0]-lexema.length()+1,posicion[1]};
        tokens.add(new Token(tipoToken, lexema, posicionToken));
        bufferTokenActual = "";
    }

    public static HashMap<String, Integer> recuentoTokens(ArrayList<Token> tokens){
        HashMap<String, Integer> recuento = new HashMap<>();
        
        for (Token token : tokens) {
            
            //Si el lexema ya existe se aumentara en uno la cantidad de dicho lexema caso contrario se agregara con valor 1
            if (recuento.containsKey(token.lexema())) {
                recuento.put(token.lexema(), recuento.get(token.lexema())+1);
            } else {
                recuento.put(token.lexema(), 1);
            }
        }
        
        return recuento;
    }
}
