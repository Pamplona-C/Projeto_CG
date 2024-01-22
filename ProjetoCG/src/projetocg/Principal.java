package projetocg;

public class Principal extends javax.swing.JFrame {
    
    int colorRed = 0, colorGreen = 0, colorBlue = 0;

    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrimitivas = new javax.swing.JMenu();
        jMenuLinhas = new javax.swing.JMenu();
        jMenuItemAnalitico = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemVarredura = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuCores = new javax.swing.JMenu();
        corVermelho = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Computação Gráfica");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        MenuPrimitivas.setText("Primitivas");

        jMenuLinhas.setText("linhas");

        jMenuItemAnalitico.setText("Analítico");
        jMenuItemAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnaliticoActionPerformed(evt);
            }
        });
        jMenuLinhas.add(jMenuItemAnalitico);

        jMenuItem3.setText("DDA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuLinhas.add(jMenuItem3);

        jMenuItem4.setText("Bresenhan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuLinhas.add(jMenuItem4);

        MenuPrimitivas.add(jMenuLinhas);

        jMenu1.setText("Polígonos");

        jMenuItemVarredura.setText("Varredura");
        jMenuItemVarredura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVarreduraActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVarredura);

        jMenuItem5.setText("BoundaryFill");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Análise Geométrica");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        MenuPrimitivas.add(jMenu1);

        jMenu5.setText("Ciírculos");

        jMenuItem7.setText("Paramétrica");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Incremental com Simetria");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Bresenhan");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        MenuPrimitivas.add(jMenu5);

        jMenuBar1.add(MenuPrimitivas);

        MenuCores.setText("Cores");

        corVermelho.setText("Vermelho");
        corVermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corVermelhoMouseClicked(evt);
            }
        });
        corVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corVermelhoActionPerformed(evt);
            }
        });
        MenuCores.add(corVermelho);

        jMenuItem11.setText("Verde");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        MenuCores.add(jMenuItem11);

        jMenuItem12.setText("Azul");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        MenuCores.add(jMenuItem12);

        jMenuBar1.add(MenuCores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnaliticoActionPerformed
  
        Analitico analitico = new Analitico();
        
        analitico.color = colorRed;
        
        analitico.setXi(10);
        analitico.setYi(100);
        analitico.setXf(100);
        analitico.setYf(100);
        
        analitico.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAnaliticoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new DDA().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Bresenhan().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void jMenuItemVarreduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVarreduraActionPerformed
        // TODO add your handling code here:
        Varredura varredura = new Varredura();
        
        varredura.setVisible(true);
    }//GEN-LAST:event_jMenuItemVarreduraActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
        BoundaryFill boundaryFill = new BoundaryFill();
        
        boundaryFill.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        AnaliseGeo analiseGeo = new AnaliseGeo();
        
        analiseGeo.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new CircParam().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new CircSim().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void corVermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corVermelhoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_corVermelhoMouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        CircBres circBres = new CircBres();
        
        circBres.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void corVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corVermelhoActionPerformed
        // TODO add your handling code here:
        colorRed = 1;
    }//GEN-LAST:event_corVermelhoActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        colorGreen = 2;
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        colorBlue = 3;
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCores;
    private javax.swing.JMenu MenuPrimitivas;
    private javax.swing.JMenuItem corVermelho;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAnalitico;
    private javax.swing.JMenuItem jMenuItemVarredura;
    private javax.swing.JMenu jMenuLinhas;
    // End of variables declaration//GEN-END:variables
}
