/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufps.negocio.Imagen;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Form3 extends javax.swing.JFrame {

  
    private Imagen imagen;
    private JTextField mYText[][];
    
    /**
     * Creates new form Form3
     */
    public Form3(int filas , int columnas) {
           initComponents();
        imagen =new Imagen (filas , columnas);
        mYText= new JTextField[filas][columnas];
       
        pintar();
        this.setBounds(0, 0, 900, 600);
        this.setLocationRelativeTo(null);
       
        
     
    }

      private void pintar() {
        this.setBounds(0,0,567,408);  
       
        this.repaint();
        int x = 16;
        int y =20;
        
        for (int i =0 ; i<this.imagen.getFilaColores1().length();i++){
        
            for (int j = 0; j < this.imagen.getFilaColores1().get(i).getPixeles().length(); j++) {
                
                this.mYText[i][j]= new JTextField();
                this.mYText[i][j].setBackground(this.imagen.getFilaColores1().get(i).getPixeles().get(j).getRgb());
                this.mYText[i][j].setBounds(x+(i*10), y+(j*10), 10, 10);
                this.jPanel2.add(this.mYText[i][j]);
                
            }
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCrearMarco = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonDetectarPatron = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonInvertirGamma = new javax.swing.JButton();
        jButtonFlipHorizontal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCrearMarco.setText("CREAR MARCO");
        jButtonCrearMarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearMarcoActionPerformed(evt);
            }
        });

        jButton2.setText("RECORTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonDetectarPatron.setText("DETECTAR PATRON");
        jButtonDetectarPatron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetectarPatronActionPerformed(evt);
            }
        });

        jButtonInvertirGamma.setText("INVERTIR GAMMA");

        jButtonFlipHorizontal.setText("FLIP HORIZONTAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCrearMarco, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addComponent(jButtonFlipHorizontal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonInvertirGamma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDetectarPatron)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonCrearMarco)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonDetectarPatron)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonInvertirGamma)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonFlipHorizontal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearMarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearMarcoActionPerformed
        
        this.imagen.crearMarco();
        repintar();
    }//GEN-LAST:event_jButtonCrearMarcoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.imagen.cortar(2, 2, 4, 4);
        repintar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonDetectarPatronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetectarPatronActionPerformed
        this.imagen.flipHorizontal();
        repintar();
    }//GEN-LAST:event_jButtonDetectarPatronActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCrearMarco;
    private javax.swing.JButton jButtonDetectarPatron;
    private javax.swing.JButton jButtonFlipHorizontal;
    private javax.swing.JButton jButtonInvertirGamma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void repintar() {
      this.jPanel2.removeAll();
        this.repaint();
       for (int i =0 ; i<this.imagen.getFilaColores1().length();i++){
        
            for (int j = 0; j < this.imagen.getFilaColores1().get(i).getPixeles().length(); j++) {
                
                this.mYText[i][j]= new JTextField();
                this.mYText[i][j].setBackground(this.imagen.getFilaColores1().get(i).getPixeles().get(j).getRgb());
                this.mYText[i][j].setBounds(16+(i*10), 20+(j*10), 10, 10);
                this.jPanel2.add(this.mYText[i][j]);
                
            }
        
       }
       this.repaint();
       
       
    }

  
  
}