/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cinema;

/**
 *
 * @author Gabriel
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
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
        jlPagamento = new javax.swing.JLabel();
        jlIngressos = new javax.swing.JLabel();
        jlSair = new javax.swing.JLabel();
        jlCartaz = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlEmailCliente = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlCPFCliente = new javax.swing.JLabel();
        jlTelefoneCliente = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bem Vindo");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 240, -1));

        jlPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bills.png"))); // NOI18N
        jlPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jlIngressos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-bag.png"))); // NOI18N
        jlIngressos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlIngressos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jlSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jlSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jlCartaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/video-camera (2).png"))); // NOI18N
        jlCartaz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlCartaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pagamento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 110, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sair");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 60, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("Em Cartaz");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jlEmailCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jlEmailCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlEmailCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmailCliente.setText("E-Mail do Usuário");
        jPanel1.add(jlEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingressos");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 110, -1));

        jlCPFCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jlCPFCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlCPFCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCPFCliente.setText("CPF do Usuário");
        jPanel1.add(jlCPFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, -1));

        jlTelefoneCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jlTelefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefoneCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTelefoneCliente.setText("Telefone do Usuário");
        jPanel1.add(jlTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, -1));

        jlNomeCliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jlNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeCliente.setText("Nome Completo");
        jPanel1.add(jlNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, -1));

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlCPFCliente;
    private javax.swing.JLabel jlCartaz;
    private javax.swing.JLabel jlEmailCliente;
    private javax.swing.JLabel jlIngressos;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlPagamento;
    private javax.swing.JLabel jlSair;
    private javax.swing.JLabel jlTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}