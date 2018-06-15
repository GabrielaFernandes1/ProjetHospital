/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.formulario;

import br.com.gabriela.objeto.Atestado;
import br.com.gabriela.singleton.SAtestado;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SATC
 */
public class JFAtestado extends javax.swing.JFrame {

    /**
     * Creates new form Atestado
     */
    public JFAtestado() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLInicioAtestado = new javax.swing.JLabel();
        jLFimAtestado = new javax.swing.JLabel();
        jLConsulta = new javax.swing.JLabel();
        jLDIas = new javax.swing.JLabel();
        jTInicioAtestado = new javax.swing.JTextField();
        jTFimAtestado = new javax.swing.JTextField();
        jTConsulta = new javax.swing.JTextField();
        jTDias = new javax.swing.JTextField();
        jBSalvarAtestado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Atestado");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLInicioAtestado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLInicioAtestado.setText("Data de Inicio do Atestado:");

        jLFimAtestado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLFimAtestado.setText("Data do Fim do Atestado:");

        jLConsulta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLConsulta.setText("Consulta:");

        jLDIas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLDIas.setText("Quantidade de Dias:");

        jTInicioAtestado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTFimAtestado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTConsulta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTDias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jBSalvarAtestado.setText("Salvar");
        jBSalvarAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAtestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLInicioAtestado)
                            .addComponent(jLFimAtestado)
                            .addComponent(jLConsulta)
                            .addComponent(jLDIas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFimAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTInicioAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalvarAtestado)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLInicioAtestado)
                    .addComponent(jTInicioAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFimAtestado)
                            .addComponent(jTFimAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLConsulta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDIas)
                    .addComponent(jTDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jBSalvarAtestado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAtestadoActionPerformed
        Atestado atesta= null ;
         SimpleDateFormat adf = new SimpleDateFormat("dd/MM/yyyy");
         String dataInicioAtestado = jTInicioAtestado.getText();
         String dataFimAtestado = jTFimAtestado.getText();
         String consulta = jTConsulta.getText();
         String quantidadDias = jTDias.getText();
         
         SAtestado.getInstance().getAtestados().add(atesta);
        
    }//GEN-LAST:event_jBSalvarAtestadoActionPerformed

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
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAtestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvarAtestado;
    private javax.swing.JLabel jLConsulta;
    private javax.swing.JLabel jLDIas;
    private javax.swing.JLabel jLFimAtestado;
    private javax.swing.JLabel jLInicioAtestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTConsulta;
    private javax.swing.JTextField jTDias;
    private javax.swing.JTextField jTFimAtestado;
    private javax.swing.JTextField jTInicioAtestado;
    // End of variables declaration//GEN-END:variables
}