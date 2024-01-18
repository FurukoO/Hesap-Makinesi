/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HesapMakinesi;

/**
 *
 * @author Faruk Musab
 */
public class HesapMakinesi extends javax.swing.JFrame {

    /**
     * Creates new form HesapMakinesi
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String Op;
    public HesapMakinesi() {
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

        jTxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnİmpact = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnBlm = new javax.swing.JButton();
        jbtnPoint = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtResult.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jTxtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 50));

        jbtnCE.setBackground(new java.awt.Color(102, 0, 0));
        jbtnCE.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 70));

        jbtnBS.setBackground(new java.awt.Color(0, 0, 51));
        jbtnBS.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBS.setText("←");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 70));

        jbtnPM.setBackground(new java.awt.Color(51, 51, 51));
        jbtnPM.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 0, 0));
        jbtnPM.setText("+/-");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, 70));

        jbtnC.setBackground(new java.awt.Color(102, 0, 0));
        jbtnC.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 255, 255));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 70));

        jbtnDigit9.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 70));

        jbtnPlus.setBackground(new java.awt.Color(51, 51, 51));
        jbtnPlus.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(255, 51, 51));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 70));

        jbtnDigit8.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 70));

        jbtnDigit7.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 70));

        jbtnDigit4.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 70));

        jbtnDigit1.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit1.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 70));

        jbtnDigit2.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit2.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 70, 70));

        jbtnDigit5.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 70, 70));

        jbtnDigit6.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 70, 70));

        jbtnDigit3.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 70, 70));

        jbtnİmpact.setBackground(new java.awt.Color(51, 51, 51));
        jbtnİmpact.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnİmpact.setForeground(new java.awt.Color(255, 51, 51));
        jbtnİmpact.setText("*");
        jbtnİmpact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnİmpactActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnİmpact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 70, 70));

        jbtnMinus.setBackground(new java.awt.Color(51, 51, 51));
        jbtnMinus.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(255, 51, 51));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 70, 70));

        jbtnDigit0.setBackground(new java.awt.Color(153, 153, 153));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 70));

        jbtnBlm.setBackground(new java.awt.Color(51, 51, 51));
        jbtnBlm.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnBlm.setForeground(new java.awt.Color(255, 0, 0));
        jbtnBlm.setText("/");
        jbtnBlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBlmActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 70));

        jbtnPoint.setBackground(new java.awt.Color(51, 51, 51));
        jbtnPoint.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnPoint.setForeground(new java.awt.Color(255, 0, 51));
        jbtnPoint.setText(".");
        jbtnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPointActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 70));

        jbtnEquals.setBackground(new java.awt.Color(51, 51, 51));
        jbtnEquals.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jbtnEquals.setForeground(new java.awt.Color(255, 0, 51));
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void EnterNumbers(String q){
         String Nums = jTxtResult.getText() + q;
         jTxtResult.setText(Nums);
    }
            
    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        String bk = null;
        if (jTxtResult.getText().length() > 0){
            StringBuilder sb = new StringBuilder(jTxtResult.getText());
            sb.deleteCharAt(jTxtResult.getText().length() -1);
            bk = sb.toString();
            jTxtResult.setText(bk);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
         EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
       EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
       EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnBlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBlmActionPerformed
       NumEnter1 = Double.parseDouble(jTxtResult.getText());
       jTxtResult.setText("");
       Op = "/";
    }//GEN-LAST:event_jbtnBlmActionPerformed

    private void jbtnİmpactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnİmpactActionPerformed
        NumEnter1 = Double.parseDouble(jTxtResult.getText());
       jTxtResult.setText("");
       Op = "*";
    }//GEN-LAST:event_jbtnİmpactActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        NumEnter1 = Double.parseDouble(jTxtResult.getText());
       jTxtResult.setText("");
       Op = "-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        NumEnter1 = Double.parseDouble(jTxtResult.getText());
       jTxtResult.setText("");
       Op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
        
      NumEnter2 = Double.parseDouble((jTxtResult.getText()));
      if(Op == "+"){
          Result = NumEnter1 + NumEnter2;
          jTxtResult.setText(String.valueOf(Result));
      }
      
      else if (Op == "-"){
          Result = NumEnter1 - NumEnter2;
          jTxtResult.setText(String.valueOf(Result));
      }
      else if (Op == "*"){
          Result = NumEnter1 * NumEnter2;
          jTxtResult.setText(String.valueOf(Result));
      }
      else if (Op == "/"){
          Result = NumEnter1 / NumEnter2;
          jTxtResult.setText(String.valueOf(Result));
      }
    }//GEN-LAST:event_jbtnEqualsActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jTxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
       jTxtResult.setText("");
       
       String Fn, Sn;
       Fn = String.valueOf(NumEnter1);
       Sn = String.valueOf(NumEnter2);
       
       Fn = "";
       Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(jTxtResult.getText()));
        nums = nums * (-1);
        jTxtResult.setText(String.valueOf (nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPointActionPerformed
        if (!jTxtResult.getText().contains(".") ){
            jTxtResult.setText(jTxtResult.getText() + jbtnPoint.getText());
        }
    }//GEN-LAST:event_jbtnPointActionPerformed

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
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTxtResult;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnBlm;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPoint;
    private javax.swing.JButton jbtnİmpact;
    // End of variables declaration//GEN-END:variables
}