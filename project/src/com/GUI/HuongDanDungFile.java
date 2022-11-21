/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GUI;

import com.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author  Tran Huu Dang
 */
public final class HuongDanDungFile extends javax.swing.JDialog {

    /**
     * Creates new form HuongDanDungFile
     */
    char flag;
    int len;
    String path = "";
    int start = 0, end = 0;

    public void getBeginEnd() {
        switch (len) {
            case 3:
                this.start = 4;
                this.end = 6;
                break;
            case 4:
                this.start = 4;
                this.end = 7;
                break;
            case 5:
                this.start = 3;

                this.end = 7;
                break;
            case 6:
                this.start = 3;
                this.end = 8;
                break;
            case 7:
                this.start = 2;
                this.end = 8;
                break;
            case 8:
                this.start = 2;
                this.end = 9;
                break;
            case 9:
                this.start = 1;
                this.end = 9;
                break;
            case 10:

                this.start = 1;
                this.end = 10;
                break;
        }
    }

    void addValueToArr() {

    }

    public HuongDanDungFile(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        write();

    }

    public HuongDanDungFile() throws IOException {

    }

    public String chooserFile() throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser("src\\com\\file"); //System.out.println(nameImage);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text", "txt");
        chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(false);
        int x = chooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            return f.getAbsolutePath();
        }
        return "";
    }

    void write() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("src\\com\\file\\help.txt");
        int i;
        while ((i = fr.read()) != -1) {
            //System.out.print((char) i);
            this.flag = (char) i;
        }
        fr.close();
        //System.out.println(this.flag);
        if (this.flag == '0') {
            //khi không có lưu ý
            //chooserFile();
            chkResult.setSelected(true);

        }

    }

    public int readLength(String path)  {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int i = 0;
            if (scanner.hasNextLine()) {
                int num = scanner.nextInt();
                this.len = num;
            }
        } catch (Exception e) {
        }
        return this.len;
    }
    
    public boolean validate(String path, int length){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int count = 0;
            //
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                count++;
            }
            if (count!=length){
                JOptionPane.showMessageDialog(this, "Số lượng phần tử không tương thích\nVui lòng xem lại các lưu ý!");
                return false;
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "File dữ liệu không hợp lệ, Vui lòng xem lại các lưu ý!");
        }
        return true;
    }

    public List<Integer> readArr(String path) throws FileNotFoundException {
        
        //tạo danh sách các phần tử tương ứng với mảng được ô tả
        List<Integer> arr = new ArrayList<>();
        readLength(path);
        getBeginEnd();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int i = start - 1;
            int count = 0;
            //
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (i == end) {
                    break;
                }

                arr.set(i, num);
                count++;
                //System.out.println(num);
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "File dữ liệu không hợp lệ, Vui lòng xem lại các lưu ý!");
        }
        return arr;
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
        jLabel1 = new javax.swing.JLabel();
        btnSort = new com.swing.Button();
        chkResult = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lưu ý khi thao tác với file inp");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lưu ý");

        btnSort.setBackground(new java.awt.Color(204, 204, 255));
        btnSort.setText("Đã hiểu");
        btnSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        chkResult.setBackground(new java.awt.Color(255, 255, 255));
        chkResult.setText("Không nhắc lại");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n1.  File phải ở định dạng text (.txt)\n\n2.  File chứa hai dòng duy nhất\n    - Dòng 1: Số nguyên N là Số lượng phần tử của mảng (2<N<16)\n    - Dòng 2: Các dòng giá trị của mảng\n\n3.  Giá trị N phải nằm trong miền giá trị hơp lệ, tổng số lượng phần tử phải bằng N\n\n\n4.  Các lỗi dễ gặp\n    - Tên file không đúng định dạng: arr.docx, arr.png, arr.jpg => arr.txt\n    - Dòng dữ liệu đầu lớn 15 hoặc nhỏ hơn 3\n    - Dòng dữ liệu thứ 2 có tổng số phần tử lớn hoặc nhỏ hơn giá trị dòng 1\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 15));
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkResult, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkResult)
                .addGap(7, 7, 7)
                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        try {
            FileWriter fw = new FileWriter("src\\com\\file\\help.txt");
            String s = "1";
            if (chkResult.isSelected()) {
                s = "0";
            }
            fw.write(s);
            fw.close();
            this.dispose();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSortActionPerformed

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
            java.util.logging.Logger.getLogger(HuongDanDungFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuongDanDungFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuongDanDungFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuongDanDungFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HuongDanDungFile dialog = null;
                try {
                    dialog = new HuongDanDungFile(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(HuongDanDungFile.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private com.swing.Button btnSort;
    private javax.swing.JCheckBox chkResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
