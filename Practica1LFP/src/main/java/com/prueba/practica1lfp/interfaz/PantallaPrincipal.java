/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.practica1lfp.interfaz;

import com.prueba.practica1lfp.ManejadorArchivos;
import com.prueba.practica1lfp.busqueda.BuscadorPatron;
import com.prueba.practica1lfp.tokenizador.Token;
import com.prueba.practica1lfp.tokenizador.Tokenizador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

/**
 *
 * @author fernanrod
 */
public class PantallaPrincipal extends javax.swing.JFrame {

	/**
	 * Creates new form PantallaPrincipal
	 */
	public PantallaPrincipal() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                editorTextArea = new javax.swing.JTextArea();
                reporteTokensPanel = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tokensTextArea = new javax.swing.JTextArea();
                jLabel1 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                recuentoTokensTextArea = new javax.swing.JTextArea();
                reporteErroresPanel = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jScrollPane5 = new javax.swing.JScrollPane();
                erroresTextArea = new javax.swing.JTextArea();
                analizarButton = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                patronTextField = new javax.swing.JTextField();
                buscarButton = new javax.swing.JButton();
                limpiarButton = new javax.swing.JButton();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                cargarButtonMenu = new javax.swing.JMenuItem();
                guardarButtonMenu = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(470, 370));
                setPreferredSize(new java.awt.Dimension(470, 500));
                getContentPane().setLayout(new java.awt.GridBagLayout());

                editorTextArea.setColumns(20);
                editorTextArea.setRows(5);
                editorTextArea.setTabSize(3);
                jScrollPane1.setViewportView(editorTextArea);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 470, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 414, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                getContentPane().add(jPanel2, gridBagConstraints);

                reporteTokensPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                reporteTokensPanel.setVisible(false);
                reporteTokensPanel.setLayout(new java.awt.GridBagLayout());

                tokensTextArea.setEditable(false);
                tokensTextArea.setColumns(20);
                tokensTextArea.setRows(5);
                jScrollPane2.setViewportView(tokensTextArea);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
                gridBagConstraints.ipadx = 438;
                gridBagConstraints.ipady = 93;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                reporteTokensPanel.add(jScrollPane2, gridBagConstraints);

                jLabel1.setText("Reporte Tokens");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipady = 30;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                reporteTokensPanel.add(jLabel1, gridBagConstraints);

                jButton2.setText("Cerrar");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                reporteTokensPanel.add(jButton2, gridBagConstraints);

                jLabel3.setText("Recuento de Tokens");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.ipady = 30;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                reporteTokensPanel.add(jLabel3, gridBagConstraints);

                recuentoTokensTextArea.setEditable(false);
                recuentoTokensTextArea.setColumns(20);
                recuentoTokensTextArea.setRows(5);
                jScrollPane4.setViewportView(recuentoTokensTextArea);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
                gridBagConstraints.ipadx = 438;
                gridBagConstraints.ipady = 93;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                reporteTokensPanel.add(jScrollPane4, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                getContentPane().add(reporteTokensPanel, gridBagConstraints);

                reporteErroresPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                reporteErroresPanel.setPreferredSize(new java.awt.Dimension(278, 158));
                reporteErroresPanel.setVisible(false);
                reporteErroresPanel.setLayout(new java.awt.GridBagLayout());

                jLabel2.setText("Reporte Errores");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipady = 30;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                reporteErroresPanel.add(jLabel2, gridBagConstraints);

                jButton3.setText("Cerrar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                reporteErroresPanel.add(jButton3, gridBagConstraints);

                erroresTextArea.setEditable(false);
                erroresTextArea.setColumns(20);
                erroresTextArea.setRows(5);
                jScrollPane5.setViewportView(erroresTextArea);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
                gridBagConstraints.ipadx = 442;
                gridBagConstraints.ipady = 93;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                reporteErroresPanel.add(jScrollPane5, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.ipadx = 8;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                getContentPane().add(reporteErroresPanel, gridBagConstraints);

                analizarButton.setText("Analizar");
                analizarButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                analizarButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                getContentPane().add(analizarButton, gridBagConstraints);

                jPanel3.setLayout(new java.awt.GridBagLayout());

                patronTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                patronTextFieldActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.ipadx = 256;
                jPanel3.add(patronTextField, gridBagConstraints);

                buscarButton.setText("Buscar");
                buscarButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buscarButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                jPanel3.add(buscarButton, gridBagConstraints);

                limpiarButton.setText("Limpiar");
                limpiarButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                limpiarButtonActionPerformed(evt);
                        }
                });
                jPanel3.add(limpiarButton, new java.awt.GridBagConstraints());

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                getContentPane().add(jPanel3, gridBagConstraints);

                jMenu1.setText("Archivo");

                cargarButtonMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
                cargarButtonMenu.setText("Cargar Archivo");
                cargarButtonMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cargarButtonMenuActionPerformed(evt);
                        }
                });
                jMenu1.add(cargarButtonMenu);

                guardarButtonMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                guardarButtonMenu.setText("Guardar Archivo");
                guardarButtonMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                guardarButtonMenuActionPerformed(evt);
                        }
                });
                jMenu1.add(guardarButtonMenu);

                jMenuBar1.add(jMenu1);

                setJMenuBar(jMenuBar1);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void analizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarButtonActionPerformed
                ArrayList<Token> tokens = new ArrayList<>();
                Tokenizador.setSizeTab(editorTextArea.getTabSize());
                tokensTextArea.setText("");
                recuentoTokensTextArea.setText("");
                erroresTextArea.setText("");
                if (editorTextArea.getText().trim().length()>0) {
                        tokens = Tokenizador.tokenizar(editorTextArea.getText());
                        for (int i=0; i<tokens.size(); i++) {
                                if (tokens.get(i).tipoToken().equals("ERROR")) {
                                        erroresTextArea.append(tokens.get(i).tipoToken()+" | ");
                                        erroresTextArea.append(tokens.get(i).lexema()+" | ");
                                        erroresTextArea.append(tokens.get(i).posicion()[0]+":"+tokens.get(i).posicion()[1]);
                                        if (tokens.get(i+1)!=null && !tokens.get(i+1).tipoToken().equals("ERROR")) {
                                                erroresTextArea.append(" | Recuperado |");
                                                erroresTextArea.append(tokens.get(i+1).tipoToken()+" | ");
                                                erroresTextArea.append(tokens.get(i+1).lexema()+" | ");
                                        }
                                        erroresTextArea.append("\n");
                                        
                                }else{
                                        tokensTextArea.append(tokens.get(i).tipoToken()+" | ");
                                        tokensTextArea.append(tokens.get(i).lexema()+" | ");
                                        tokensTextArea.append(tokens.get(i).posicion()[0]+":"+tokens.get(i).posicion()[1]);
                                        tokensTextArea.append("\n");
                                }
                        }
                }
                if(erroresTextArea.getText().length()>0){
                        reporteTokensPanel.setVisible(false);
                        reporteErroresPanel.setVisible(true);
                        this.setSize(470, 630);
                } else {
                        reporteTokensPanel.setVisible(true);
                        reporteErroresPanel.setVisible(false);
                        this.setSize(470, 780);
                        
                        HashMap<String, Integer> recuentoTokens = Tokenizador.recuentoTokens(tokens);

                        recuentoTokensTextArea.append("Lexema | Ocurrencias\n");
                        for (Map.Entry<String, Integer> entrada : recuentoTokens.entrySet()) {
                            String lexema = entrada.getKey();
                            Integer ocurrencias = entrada.getValue();
                            
                            recuentoTokensTextArea.append(lexema+" | "+ocurrencias+"\n");
                        }
                }
        }//GEN-LAST:event_analizarButtonActionPerformed

        private void cargarButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarButtonMenuActionPerformed
                javax.swing.JFileChooser archivo = new javax.swing.JFileChooser(); 
                archivo.setDialogTitle("Elige un archivo a cargar");   
                int seleccion = archivo.showOpenDialog(this);
                if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
                        ManejadorArchivos.leer(editorTextArea, archivo.getSelectedFile());
                }
        }//GEN-LAST:event_cargarButtonMenuActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                reporteTokensPanel.setVisible(false);
                this.setSize(470, 470);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                reporteErroresPanel.setVisible(false);
                this.setSize(470, 470);
        }//GEN-LAST:event_jButton3ActionPerformed

        private void guardarButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonMenuActionPerformed
                javax.swing.JFileChooser archivo = new javax.swing.JFileChooser();
                archivo.setDialogTitle("Especifica el archivo para guardar");   
                int seleccion = archivo.showSaveDialog(this);
                 
                if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
                        try {
                                ManejadorArchivos.guardar(editorTextArea, archivo.getSelectedFile());
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }//GEN-LAST:event_guardarButtonMenuActionPerformed

        private void patronTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patronTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_patronTextFieldActionPerformed

        private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
                BuscadorPatron.removerResaltado(editorTextArea);
                BuscadorPatron.buscarPatron(editorTextArea, patronTextField.getText());
        }//GEN-LAST:event_buscarButtonActionPerformed

        private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
                BuscadorPatron.removerResaltado(editorTextArea);
        }//GEN-LAST:event_limpiarButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton analizarButton;
        private javax.swing.JButton buscarButton;
        private javax.swing.JMenuItem cargarButtonMenu;
        public javax.swing.JTextArea editorTextArea;
        private javax.swing.JTextArea erroresTextArea;
        private javax.swing.JMenuItem guardarButtonMenu;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JButton limpiarButton;
        private javax.swing.JTextField patronTextField;
        private javax.swing.JTextArea recuentoTokensTextArea;
        private javax.swing.JPanel reporteErroresPanel;
        private javax.swing.JPanel reporteTokensPanel;
        private javax.swing.JTextArea tokensTextArea;
        // End of variables declaration//GEN-END:variables
}
