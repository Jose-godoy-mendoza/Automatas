/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgrafico;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
/**
 *
 * @author joseg
 */
public class Vistaa extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();
    
    
    public Vistaa()
    {
        initComponents();
        this.inicializar(false);
        
    }
    
    private void inicializar(boolean enable)
    {
        this.recIzq.setEnabled(enable);
        this.recDerecha.setEnabled(enable);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        gramaticaT = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        recDerecha = new javax.swing.JButton();
        recIzq = new javax.swing.JButton();
        txtdato = new javax.swing.JTextField();
        jScrollPanel = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jDesktopPanel = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setOpaque(false);

        gramaticaT.setText("Terminal");
        gramaticaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gramaticaTActionPerformed(evt);
            }
        });

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        recDerecha.setText("Derecha");
        recDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recDerechaActionPerformed(evt);
            }
        });

        recIzq.setText("Izquierda");
        recIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recIzqActionPerformed(evt);
            }
        });

        impresion.setColumns(20);
        impresion.setRows(5);
        jScrollPanel.setViewportView(impresion);

        jDesktopPanel.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jDesktopPanel.add(jInternalFrame2);
        jInternalFrame2.setBounds(20, 0, 600, 290);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(recIzq)
                        .addGap(33, 33, 33)
                        .addComponent(recDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdato, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gramaticaT)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recIzq)
                            .addComponent(recDerecha)
                            .addComponent(gramaticaT))
                        .addGap(15, 15, 15)))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recIzqActionPerformed
        String recorrido = null;
        recorrido = this.simulador.reclzq();

        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_recIzqActionPerformed

    private void recDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recDerechaActionPerformed
        String recorrido = null;
        recorrido = this.simulador.recDerecha();

        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_recDerechaActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        // TODO add your handling code here:
        try {
            int dato = Integer.parseInt(txtdato.getText());
            if (this.simulador.insertar(dato)){
                JOptionPane.showMessageDialog(null, "El dato fue ingresado correctamente", "...", 1);
                this.inicializar(true);
                complementos();
            }
            }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el dato", "intente de nuevo... ", 0);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void gramaticaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gramaticaTActionPerformed
        // TODO add your handling code here:
        String salida = this.simulador.darHojas();
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_gramaticaTActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    public void complementos()
    {
        this.repintarArbol();
    }
    
    
   private void repintarArbol() {
        this.jDesktopPanel.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPanel.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistaa().setVisible(true);
            }
        });
    }
                  

//Estos son los componentes del Jframe, hay que agregarle los nombres a cada uno y posicionarlos 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton gramaticaT;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JButton recDerecha;
    private javax.swing.JButton recIzq;
    private javax.swing.JTextField txtdato;
    // End of variables declaration//GEN-END:variables
}
