package com.prueba.practica1lfp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;

public class ManejadorArchivos {

    public static void leer(JTextArea textArea, File archivo){
        File file = archivo;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            textArea.setText("");
            String st = br.readLine();
            while (st != null){
                textArea.append(st+"\n");
                st = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void guardar(JTextArea textArea, File archivo) throws IOException{
        File file = archivo;

        if (file.createNewFile()) {
        } else {
            file.delete();
            file.createNewFile();
        }
        String source = textArea.getText();
        FileWriter fileWriter = new FileWriter(file, false);
        fileWriter.write(source);
        fileWriter.close();
    }
}
