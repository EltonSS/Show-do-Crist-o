package Telas;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Object panelPrincipal;
//    ConectaBanco con = new ConectaBanco();
    public Principal() {

        initComponents();
        txtDigitarNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHead = new javax.swing.JPanel();
        btSair = new rojeru_san.RSButton();
        btPlacar = new rojeru_san.RSButton();
        btIniciar = new rojeru_san.RSButton();
        txtDigitarNome = new rojerusan.RSMetroTextPlaceHolder();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHead.setBackground(new java.awt.Color(204, 0, 0));
        pnlHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSair.setBackground(new java.awt.Color(111, 2, 7));
        btSair.setBorder(null);
        btSair.setText("SAIR");
        btSair.setColorHover(new java.awt.Color(191, 38, 58));
        btSair.setColorTextHover(new java.awt.Color(255, 255, 51));
        btSair.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        pnlHead.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 260, 60));

        btPlacar.setBackground(new java.awt.Color(251, 197, 13));
        btPlacar.setBorder(null);
        btPlacar.setText("PLACAR");
        btPlacar.setColorHover(new java.awt.Color(191, 38, 58));
        btPlacar.setColorText(new java.awt.Color(111, 2, 7));
        btPlacar.setColorTextHover(new java.awt.Color(255, 255, 51));
        btPlacar.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        pnlHead.add(btPlacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 260, 60));

        btIniciar.setBackground(new java.awt.Color(111, 2, 7));
        btIniciar.setBorder(null);
        btIniciar.setText("INICIAR");
        btIniciar.setColorHover(new java.awt.Color(191, 38, 58));
        btIniciar.setColorTextHover(new java.awt.Color(255, 255, 51));
        btIniciar.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        pnlHead.add(btIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 260, 60));

        txtDigitarNome.setForeground(new java.awt.Color(111, 2, 7));
        txtDigitarNome.setBorderColor(new java.awt.Color(111, 2, 7));
        txtDigitarNome.setBotonColor(new java.awt.Color(111, 2, 7));
        txtDigitarNome.setPhColor(new java.awt.Color(111, 2, 7));
        txtDigitarNome.setPlaceholder("DIGITE O SEU NOME");
        txtDigitarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitarNomeActionPerformed(evt);
            }
        });
        pnlHead.add(txtDigitarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 260, 70));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonRectangle1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rSMaterialButtonRectangle1.setAutoscrolls(true);
        pnlHead.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 300, 220));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ShowCristao.jpg"))); // NOI18N
        pnlHead.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        getContentPane().add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void chamarTelaPerguntas() {

        if (txtDigitarNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o seu nome para participar do jogo!!");
        } else {
            Perguntas frmPerguntas = new Perguntas(txtDigitarNome.getText());
            frmPerguntas.setVisible(true);
            dispose();
        }
    }

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed

        chamarTelaPerguntas();
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        int perguntaPular = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair do jogo?",
                "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (perguntaPular == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void txtDigitarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigitarNomeActionPerformed

        chamarTelaPerguntas();
    }//GEN-LAST:event_txtDigitarNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btIniciar;
    private rojeru_san.RSButton btPlacar;
    private rojeru_san.RSButton btSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlHead;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMetroTextPlaceHolder txtDigitarNome;
    // End of variables declaration//GEN-END:variables
}
