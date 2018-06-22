/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.formulario;

import br.com.gabriela.objeto.Paciente;
import br.com.gabriela.singleton.SPaciente;
import java.text.SimpleDateFormat;

/**
 *
 * @author SATC
 */
public class JFPaciente extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public JFPaciente() {
        initComponents();
        jTIdPac.setText(Integer.toString(SPaciente.getInstance().getPacientes().size()));
        jTIdPac.setEnabled(false);
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
        jLNomePac = new javax.swing.JLabel();
        jLDataNascPac = new javax.swing.JLabel();
        jLCpfPac = new javax.swing.JLabel();
        jLRGPac = new javax.swing.JLabel();
        jLSexoPac = new javax.swing.JLabel();
        jLestadoCivilPac = new javax.swing.JLabel();
        jLEnderecoPac = new javax.swing.JLabel();
        jLTelefonePac = new javax.swing.JLabel();
        jLidPac = new javax.swing.JLabel();
        jLNSUS = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jTNomePac = new javax.swing.JTextField();
        jTRGPac = new javax.swing.JTextField();
        jTSexoPac = new javax.swing.JTextField();
        jTEnderecoPac = new javax.swing.JTextField();
        jTIdPac = new javax.swing.JTextField();
        jTResponsavel = new javax.swing.JTextField();
        jTDataNascPac = new javax.swing.JTextField();
        jTCpfPac = new javax.swing.JTextField();
        jTEstadoCivilPac = new javax.swing.JTextField();
        jTTelefonePac = new javax.swing.JTextField();
        jTNSUS = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Paciente");

        jLNomePac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLNomePac.setText("Nome:");

        jLDataNascPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLDataNascPac.setText("Data Nascimento:");

        jLCpfPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLCpfPac.setText("CPF:");

        jLRGPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLRGPac.setText("RG:");

        jLSexoPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLSexoPac.setText("Sexo:");

        jLestadoCivilPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLestadoCivilPac.setText("Estado Civil:");

        jLEnderecoPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLEnderecoPac.setText("Endereço:");

        jLTelefonePac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTelefonePac.setText("Telefone:");

        jLidPac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLidPac.setText("ID:");

        jLNSUS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLNSUS.setText("Nº SUS:");

        jLResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLResponsavel.setText("Responsavel:");

        jTNomePac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTRGPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTSexoPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTEnderecoPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTIdPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTIdPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdPacActionPerformed(evt);
            }
        });

        jTResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTDataNascPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTCpfPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTEstadoCivilPac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTTelefonePac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTNSUS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEnderecoPac)
                            .addComponent(jLidPac))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEnderecoPac)
                            .addComponent(jTIdPac))
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLSexoPac)
                            .addComponent(jLRGPac)
                            .addComponent(jLNomePac))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTNomePac)
                            .addComponent(jTRGPac, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTSexoPac, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLTelefonePac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTTelefonePac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLestadoCivilPac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTEstadoCivilPac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNSUS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTNSUS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCpfPac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTCpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLDataNascPac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTDataNascPac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLResponsavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomePac)
                    .addComponent(jLDataNascPac)
                    .addComponent(jTNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDataNascPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCpfPac)
                    .addComponent(jLRGPac)
                    .addComponent(jTRGPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCpfPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexoPac)
                    .addComponent(jLestadoCivilPac)
                    .addComponent(jTSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEstadoCivilPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEnderecoPac)
                    .addComponent(jLTelefonePac)
                    .addComponent(jTEnderecoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefonePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLidPac)
                    .addComponent(jTIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNSUS)
                    .addComponent(jTNSUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLResponsavel)
                    .addComponent(jTResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Paciente pac = null ;
        SimpleDateFormat adf = new SimpleDateFormat("dd/MM/yyyy");
        String nome = jTNomePac.getText();
        String cpf = jTCpfPac.getText();
        String rg = jTRGPac.getText();
        String endereco = jTEnderecoPac.getText();
        String telefone = jTTelefonePac.getText();
        char sexo = jTSexoPac.getText().toUpperCase().charAt(0);
        String EstadoCivil = jTEstadoCivilPac.getText();
        int id= Integer.parseInt(jTIdPac.getText());
        int numeroSus = Integer.parseInt(jTNSUS.getText());       
        
        SPaciente.getInstance().getPacientes().add(pac);

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTIdPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdPacActionPerformed
       
    }//GEN-LAST:event_jTIdPacActionPerformed

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
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLCpfPac;
    private javax.swing.JLabel jLDataNascPac;
    private javax.swing.JLabel jLEnderecoPac;
    private javax.swing.JLabel jLNSUS;
    private javax.swing.JLabel jLNomePac;
    private javax.swing.JLabel jLRGPac;
    private javax.swing.JLabel jLResponsavel;
    private javax.swing.JLabel jLSexoPac;
    private javax.swing.JLabel jLTelefonePac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLestadoCivilPac;
    private javax.swing.JLabel jLidPac;
    private javax.swing.JTextField jTCpfPac;
    private javax.swing.JTextField jTDataNascPac;
    private javax.swing.JTextField jTEnderecoPac;
    private javax.swing.JTextField jTEstadoCivilPac;
    private javax.swing.JTextField jTIdPac;
    private javax.swing.JTextField jTNSUS;
    private javax.swing.JTextField jTNomePac;
    private javax.swing.JTextField jTRGPac;
    private javax.swing.JTextField jTResponsavel;
    private javax.swing.JTextField jTSexoPac;
    private javax.swing.JTextField jTTelefonePac;
    // End of variables declaration//GEN-END:variables
}
