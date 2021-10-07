package com.prueba.practica1lfp.busqueda;

import java.awt.Color;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

public class BuscadorPatron {
    public static void buscarPatron(javax.swing.JTextArea textArea, String patron){
        patron = patron.trim();
        char[] texto = textArea.getText().toCharArray();
        if (texto.length < patron.length()) {
            
        } else {
            Highlighter highlighter = textArea.getHighlighter();
            HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
            for (int i = 0; i < texto.length; i++) {
                boolean patronMatch = true;       
                for (int j = 0; j < patron.length(); j++) {
                    try {
                        if (texto[i+j] != patron.charAt(j)) {
                            patronMatch = false;
                        }
                    } catch (StringIndexOutOfBoundsException|ArrayIndexOutOfBoundsException e) {
                        break;
                    }
                }
                if (patronMatch) {
                    try {
                        highlighter.addHighlight(i, i+patron.length(), painter);
                    } catch (BadLocationException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        }
    }
    
    public static void removerResaltado(javax.swing.JTextArea textArea){
        Highlighter highlighter = textArea.getHighlighter();
        Highlighter.Highlight[] highlights = highlighter.getHighlights();

            for (int i = 0; i < highlights.length; i++) {
                highlighter.removeHighlight(highlights[i]);
            }
        }
    }
