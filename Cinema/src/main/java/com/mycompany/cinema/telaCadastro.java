/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cinema;

import java.awt.Color;
import java.awt.event.ItemEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Gabriel
 */
public class telaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
    public telaCadastro() {
        initComponents();
        jTextField1.setBackground(new Color (0,0,0,50));
        jTextField2.setBackground(new Color (0,0,0,50));
        jTextField3.setBackground(new Color (0,0,0,50));
        jTextField4.setBackground(new Color (0,0,0,50));
        jTextField5.setBackground(new Color (0,0,0,50));
        jTextField6.setBackground(new Color (0,0,0,50));
        jTextField7.setBackground(new Color (0,0,0,50));
        jRadioButton1.setBackground(new Color (0,0,0,50));
        jRadioButton2.setBackground(new Color (0,0,0,50));
        jPasswordField2.setBackground(new Color (0,0,0,50));
        jPasswordField3.setBackground(new Color (0,0,0,50));
        jCheckBox1.setBackground(new Color (0,0,0,50));
        jLabel3.setBackground(new Color(0,0,0,200));
        jTextField1.setVisible(false);
        
        buttonGroup2.add(jRadioButton1);
        buttonGroup2.add(jRadioButton2);

        setDefaultCloseOperation(telaCadastro.DISPOSE_ON_CLOSE);
    }
    
    
    
    public JTextField Mascara(int tamanho, String caracteres){
        try {
            String quant="";
            for (int i = 0; i < tamanho; i++) {
                quant=quant+"*";
            }
            javax.swing.text.MaskFormatter cpf=new javax.swing.text.MaskFormatter("###.###.###-##");
            cpf.setValidCharacters(caracteres);
            return new javax.swing.JFormattedTextField(cpf);
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");          
        }
          return new JTextField();
    };
    

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastre-se");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 620, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Chave Funcionário");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 180, 40));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Digite seu RG");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, 40));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Digite seu E-Mail");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, 40));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Digite seu CEP");
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, 40));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Digite seu Telefone");
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 180, 40));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Digite seu nome");
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 40));

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Feminino");
        jRadioButton1.setBorder(null);
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setPreferredSize(new java.awt.Dimension(149, 22));
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 180, 40));

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Masculino");
        jRadioButton2.setBorder(null);
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setPreferredSize(new java.awt.Dimension(149, 22));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 180, 40));

        jPasswordField3.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField3.setText("jPasswordField1");
        jPasswordField3.setBorder(null);
        jPanel1.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, 40));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Funcionário");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 180, 40));

        jPasswordField2.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setBorder(null);
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 40));


        jTextField7.setText("Digite seu CPF");
        jTextField7.getText();
        jTextField7=Mascara(11,"1,2,3,4,5,6,7,8,9");

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Digite seu CPF");
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastrar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         if(jCheckBox1.isSelected()){
         jTextField1.setVisible(true);
         } else{
             jTextField1.setVisible(false);
         }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
       jTextField7.setText("Digite seu CPF");
       jTextField7.getText();
    }//GEN-LAST:event_jTextField7ActionPerformed


    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
