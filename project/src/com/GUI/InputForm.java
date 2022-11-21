/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GUI;

import com.swing.TextField;
import com.swing.Button;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;

/**
 *
 * @author  Tran Huu Dang
 */
public class InputForm extends javax.swing.JDialog {

    /**
     * Creates new form InputForm
     */
    //tạo mảng chứa các phần tử mô phỏng
    TextField[] arrTxt;
    private MainForm main;
    int length = 0;

    int[] arrInt;

    //hàm chuyển textField
    public void keyCarret() {

    }

    public InputForm(java.awt.Frame parent, boolean modal, int length) {
        super(parent, modal);
        initComponents();
        main = (MainForm) parent;
        this.length = length;
        showIndex();
    }

    private InputForm(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setVisibleF() {
        this.arrTxt = new TextField[]{this.txtIndex1, this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9, this.txtIndex10};
        for (TextField txt : arrTxt) {
            txt.setVisible(false);
        }
    }

    public void showIndex() {
        int count = 0;
        setVisibleF();
        this.arrTxt = new TextField[]{this.txtIndex1, this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9, this.txtIndex10};
        for (TextField txt : arrTxt) {
            if (count < length) {
                txt.setVisible(true);
            } else {
                txt.setText("0");
            }
            count++;
        }
    }

    public boolean valid() {
        this.arrTxt = new TextField[]{this.txtIndex1, this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9, this.txtIndex10};
        for (TextField txt : arrTxt) {
            if (txt.getText().length() > 4) {
                JOptionPane.showMessageDialog(this, "Các phần tử của mảng chỉ nhận giá trị từ -9999 đến 9999");
                return false;
            }
        }
        return true;
    }

    public void addArr() {
        try {
            if (!valid()) {
                return;
            }
            main.addArr(Integer.valueOf(this.txtIndex1.getText()), Integer.valueOf(this.txtIndex2.getText()),
                    Integer.valueOf(this.txtIndex3.getText()), Integer.valueOf(this.txtIndex4.getText()),
                    Integer.valueOf(this.txtIndex5.getText()), Integer.valueOf(this.txtIndex6.getText()),
                    Integer.valueOf(this.txtIndex7.getText()), Integer.valueOf(this.txtIndex8.getText()),
                    Integer.valueOf(this.txtIndex9.getText()), Integer.valueOf(this.txtIndex10.getText()));
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số!");
        }
    }

    public void hideIndex(TextField txtIndex1, TextField txtIndex2, TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7, TextField txtIndex8, TextField txtIndex9, TextField txtIndex10) {
        this.arrTxt = new TextField[]{this.txtIndex1, this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9, this.txtIndex10};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex1, TextField txtIndex2, TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7, TextField txtIndex8, TextField txtIndex9) {
        this.arrTxt = new TextField[]{this.txtIndex1, this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex2, TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7, TextField txtIndex8, TextField txtIndex9) {
        this.arrTxt = new TextField[]{this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8, this.txtIndex9};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex2, TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7, TextField txtIndex8) {
        this.arrTxt = new TextField[]{this.txtIndex2, this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7, TextField txtIndex8) {
        this.arrTxt = new TextField[]{this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7, this.txtIndex8};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex3, TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7) {
        this.arrTxt = new TextField[]{this.txtIndex3, this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex4, TextField txtIndex5, TextField txtIndex6, TextField txtIndex7) {
        this.arrTxt = new TextField[]{this.txtIndex4, this.txtIndex5, this.txtIndex6, this.txtIndex7};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void hideIndex(TextField txtIndex4, TextField txtIndex5, TextField txtIndex6) {
        this.arrTxt = new TextField[]{this.txtIndex4, this.txtIndex5, this.txtIndex6};
        for (TextField txt : arrTxt) {
            txt.setEditable(true);
        }
    }

    public void showEditIndex() {
        switch (length) {
            case 3:
                hideIndex(txtIndex4, txtIndex5, txtIndex6);
                break;
            case 4:
                hideIndex(txtIndex4, txtIndex5, txtIndex6, txtIndex7);
                break;
            case 5:
                hideIndex(txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7);
                break;
            case 6:
                hideIndex(txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7, txtIndex8);
                break;
            case 7:
                hideIndex(txtIndex2, txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7, txtIndex8);
                break;
            case 8:
                hideIndex(txtIndex2, txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7, txtIndex8, txtIndex9);
                break;
            case 9:
                hideIndex(txtIndex1, txtIndex2, txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7, txtIndex8, txtIndex9);
                break;
            case 10:
                hideIndex(txtIndex1, txtIndex2, txtIndex3, txtIndex4, txtIndex5, txtIndex6, txtIndex7, txtIndex8, txtIndex9, txtIndex10);
                break;
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

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        button1 = new com.swing.Button();
        txtIndex1 = new com.swing.TextField();
        txtIndex2 = new com.swing.TextField();
        txtIndex3 = new com.swing.TextField();
        txtIndex4 = new com.swing.TextField();
        txtIndex5 = new com.swing.TextField();
        txtIndex6 = new com.swing.TextField();
        txtIndex7 = new com.swing.TextField();
        txtIndex8 = new com.swing.TextField();
        txtIndex9 = new com.swing.TextField();
        txtIndex10 = new com.swing.TextField();

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Index");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập liệu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/bar-code.png"))); // NOI18N
        jLabel14.setText("  Nhập dữ liệu cho mảng");

        button1.setBackground(new java.awt.Color(102, 102, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("OK");
        button1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        txtIndex1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex1.setLabelText("Index 0");
        txtIndex1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIndex1CaretUpdate(evt);
            }
        });
        txtIndex1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex1KeyPressed(evt);
            }
        });

        txtIndex2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex2.setLabelText("Index 1");
        txtIndex2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex2KeyPressed(evt);
            }
        });

        txtIndex3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex3.setLabelText("Index 2");
        txtIndex3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex3KeyPressed(evt);
            }
        });

        txtIndex4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex4.setLabelText("Index 3");
        txtIndex4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex4KeyPressed(evt);
            }
        });

        txtIndex5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex5.setLabelText("Index 4");
        txtIndex5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex5KeyPressed(evt);
            }
        });

        txtIndex6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex6.setLabelText("Index 5");
        txtIndex6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex6KeyPressed(evt);
            }
        });

        txtIndex7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex7.setLabelText("Index 6");
        txtIndex7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex7KeyPressed(evt);
            }
        });

        txtIndex8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex8.setLabelText("Index 7");
        txtIndex8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex8KeyPressed(evt);
            }
        });

        txtIndex9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex9.setLabelText("Index 8");
        txtIndex9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex9KeyPressed(evt);
            }
        });

        txtIndex10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIndex10.setLabelText("Index 9");
        txtIndex10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndex10KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIndex1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIndex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIndex6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndex10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        addArr();
    }//GEN-LAST:event_button1ActionPerformed

    private void txtIndex1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIndex1CaretUpdate

    }//GEN-LAST:event_txtIndex1CaretUpdate

    private void txtIndex1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex2.requestFocus();
    }//GEN-LAST:event_txtIndex1KeyPressed

    private void txtIndex2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex3.requestFocus();
    }//GEN-LAST:event_txtIndex2KeyPressed

    private void txtIndex3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex4.requestFocus();
    }//GEN-LAST:event_txtIndex3KeyPressed

    private void txtIndex4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex5.requestFocus();
    }//GEN-LAST:event_txtIndex4KeyPressed

    private void txtIndex5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex6.requestFocus();
    }//GEN-LAST:event_txtIndex5KeyPressed

    private void txtIndex6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex7.requestFocus();
    }//GEN-LAST:event_txtIndex6KeyPressed

    private void txtIndex7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex8.requestFocus();
    }//GEN-LAST:event_txtIndex7KeyPressed

    private void txtIndex8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex9.requestFocus();
    }//GEN-LAST:event_txtIndex8KeyPressed

    private void txtIndex9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex10.requestFocus();
    }//GEN-LAST:event_txtIndex9KeyPressed

    private void txtIndex10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndex10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB)
            txtIndex1.requestFocus();
    }//GEN-LAST:event_txtIndex10KeyPressed

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
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InputForm dialog = new InputForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button button1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private com.swing.TextField txtIndex1;
    private com.swing.TextField txtIndex10;
    private com.swing.TextField txtIndex2;
    private com.swing.TextField txtIndex3;
    private com.swing.TextField txtIndex4;
    private com.swing.TextField txtIndex5;
    private com.swing.TextField txtIndex6;
    private com.swing.TextField txtIndex7;
    private com.swing.TextField txtIndex8;
    private com.swing.TextField txtIndex9;
    // End of variables declaration//GEN-END:variables
}
