/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cinema;

import java.awt.Color;

/**
 *
 * @author Gabriel
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        
        jtfEmailLogin.setBackground(new Color (0,0,0,50));
        jpSenhaLogin.setBackground(new Color (0,0,0,50));
        jlEntrarLogin.setBackground(new Color (0,0,0,50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfEmailLogin = new javax.swing.JTextField();
        jpSenhaLogin = new javax.swing.JPasswordField();
        jlEntrarLogin = new javax.swing.JLabel();
        jlCadastrarMenu = new javax.swing.JLabel();
        jlPagamentoMenu = new javax.swing.JLabel();
        jlCartazMenu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jtfEmailLogin.setBackground(new java.awt.Color(0, 0, 0));
        jtfEmailLogin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jtfEmailLogin.setForeground(new java.awt.Color(255, 255, 255));
        jtfEmailLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfEmailLogin.setText("Insira seu e-mail");
        jtfEmailLogin.setToolTipText("");
        jtfEmailLogin.setBorder(null);
        jtfEmailLogin.setName(""); // NOI18N
        jtfEmailLogin.setOpaque(false);
        jtfEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jtfEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 40));

        jpSenhaLogin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jpSenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        jpSenhaLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpSenhaLogin.setText("Digite sua senha");
        jpSenhaLogin.setToolTipText("Digite sua senha");
        jpSenhaLogin.setBorder(null);
        jpSenhaLogin.setPreferredSize(new java.awt.Dimension(129, 22));
        jPanel1.add(jpSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 40));

        jlEntrarLogin.setBackground(new java.awt.Color(0, 0, 0));
        jlEntrarLogin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jlEntrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlEntrarLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEntrarLogin.setText("Entrar");
        jlEntrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlEntrarLogin.setOpaque(true);
        jPanel1.add(jlEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 40));

        jlCadastrarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key (2).png"))); // NOI18N
        jlCadastrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlCadastrarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jlPagamentoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-cart (2).png"))); // NOI18N
        jlPagamentoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlPagamentoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jlCartazMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/video-camera (2).png"))); // NOI18N
        jlCartazMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlCartazMenu.setDoubleBuffered(true);
        jPanel1.add(jlCartazMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Em Cartaz");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("Cadastrar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("Pagamento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telainicial.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailLoginActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlCadastrarMenu;
    private javax.swing.JLabel jlCartazMenu;
    private javax.swing.JLabel jlEntrarLogin;
    private javax.swing.JLabel jlPagamentoMenu;
    private javax.swing.JPasswordField jpSenhaLogin;
    private javax.swing.JTextField jtfEmailLogin;
    // End of variables declaration//GEN-END:variables
}
