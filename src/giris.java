
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talha
 */
public class giris extends javax.swing.JFrame {

giris g=null;    
    /**
     * Creates new form giris
     */
    public giris() {
        this.getContentPane().setBackground(Color.blue);
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
        Kolay = new javax.swing.JButton();
        Orta = new javax.swing.JButton();
        Zor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText(" Oyunu Hangi Seviye Oynamak İstersiniz :");

        Kolay.setBackground(new java.awt.Color(204, 0, 0));
        Kolay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kolay.setForeground(new java.awt.Color(51, 255, 255));
        Kolay.setText("Kolay");
        Kolay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolayActionPerformed(evt);
            }
        });

        Orta.setBackground(new java.awt.Color(204, 0, 0));
        Orta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Orta.setForeground(new java.awt.Color(51, 255, 255));
        Orta.setText("Orta");
        Orta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrtaActionPerformed(evt);
            }
        });

        Zor.setBackground(new java.awt.Color(204, 0, 0));
        Zor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Zor.setForeground(new java.awt.Color(102, 255, 255));
        Zor.setText("Zor");
        Zor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Zor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Orta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kolay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Kolay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Orta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Zor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZorActionPerformed
       
         giris g =new giris();
         g.setVisible(false);
          AnaEkran ekran =new AnaEkran("Araba Oyunu");
        ekran.setSize(400,700);
        ekran.setLocation(700,15);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setResizable(false);
        
       ekran_3 e = new ekran_3();
        e.requestFocus();//klavyeden işlemleri anlaması için direk odagı veriyoruz böyle bir anlamı var.
        e.addKeyListener(e);//direk fareden işlemleri almaya yarıyor. 
        //oyun içine KeyListenere implements edince hata gidiyor. hata sebebi KeyListenere baglı olmasını istiyor.
        //oyunu bunun içine verince KeyListener sadece JPanel içinde çalışacak
        e.setFocusable(true);//odagı oyuna verdik
        e.setFocusTraversalKeysEnabled(false);//klavye işlemlerinin gerçekleşmesi için
        ekran.add(e);
        ekran.setVisible(true);
    }//GEN-LAST:event_ZorActionPerformed

    private void KolayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolayActionPerformed

       g=new giris();
       
       
       
         AnaEkran ekran =new AnaEkran("Araba Oyunu");
        ekran.setSize(400,700);
        ekran.setLocation(700,15);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setResizable(false);
        
       ekran_1 e = new ekran_1();
        e.requestFocus();//klavyeden işlemleri anlaması için direk odagı veriyoruz böyle bir anlamı var.
        e.addKeyListener(e);//direk fareden işlemleri almaya yarıyor. 
        //oyun içine KeyListenere implements edince hata gidiyor. hata sebebi KeyListenere baglı olmasını istiyor.
        //oyunu bunun içine verince KeyListener sadece JPanel içinde çalışacak
        e.setFocusable(true);//odagı oyuna verdik
        e.setFocusTraversalKeysEnabled(false);//klavye işlemlerinin gerçekleşmesi için
        ekran.add(e);
        ekran.setVisible(true);
        g.setVisible(false);
        
        
    }//GEN-LAST:event_KolayActionPerformed

    private void OrtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrtaActionPerformed
        // TODO add your handling code here:
        
          
        
          AnaEkran ekran =new AnaEkran("Araba Oyunu");
              
          
        ekran.setSize(400,700);
        ekran.setLocation(700,15);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekran.setResizable(false);
        
       ekran_2 e = new ekran_2();
        e.requestFocus();//klavyeden işlemleri anlaması için direk odagı veriyoruz böyle bir anlamı var.
        e.addKeyListener(e);//direk fareden işlemleri almaya yarıyor. 
        //oyun içine KeyListenere implements edince hata gidiyor. hata sebebi KeyListenere baglı olmasını istiyor.
        //oyunu bunun içine verince KeyListener sadece JPanel içinde çalışacak
        e.setFocusable(true);//odagı oyuna verdik
        e.setFocusTraversalKeysEnabled(false);//klavye işlemlerinin gerçekleşmesi için
        ekran.add(e);
        ekran.setVisible(true);
        
    }//GEN-LAST:event_OrtaActionPerformed

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
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kolay;
    private javax.swing.JButton Orta;
    private javax.swing.JButton Zor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
