/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 14h 12/3/2023
package com.GUI;

import com.algorithm.QuickSort.Quick;
import com.sun.tools.javac.Main;
import com.swing.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.DefaultListModel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author Trần Hữu Đang
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    //tạo danh sách các phần tử tương ứng với mảng được ô tả
    List<Integer> arr = new ArrayList<>();
    List<Integer> listTempQuick = new ArrayList<>();

    //kiểm tra kết quả
    boolean result = false;

    //tạo mảng chứa các phần tử mô phỏng
    Button[] arrBtn;

    //tạo mảng chứa rdoSort
    JRadioButton[] arrRdo;

    Frame frame;

    //số lượng phần tử mô phỏng
    int length = 0;

    //lấy tốc độ được chọn
    int flash = 20;

    //model chứa đoạn code sắp xếp
    private DefaultListModel listModel;

    //tinh trang thuc thi
    boolean flag = true;

    public MainForm() {
        initComponents();
        visibleFalseMid();
        //runTittle();Cascadia Code
        
        linkeListModel.setFont(new Font("Fira Code", Font.PLAIN, 18));// set the font

        btnSort.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCreateRand.setEnabled(false);
        btnCreateFromKey.setEnabled(false);

        //runTittle();
        addInterchange();

        //Set Icon => JFrame
        URL urlIconMain = MainForm.class.getResource("/com/library/icon/increase.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconMain);
        this.setIconImage(img);

        //tạo description cho từng componnets
        /*
        PopupMenuListener pml = new PopupMenuListener();
        lblInfor.addMouseListener(pml);
        btnCreateFromKey.addMouseListener(pml);
        btnCreateFromFile.addMouseListener(pml);
        sdFlash.addMouseListener(pml);
        pnCode.addMouseListener(pml);
        pnManHinhMoPhong.addMouseListener(pml);
        rdoInterchangeSort.addMouseListener(pml);
        rdoBubbleSort.addMouseListener(pml);
        rdoInsertionSort.addMouseListener(pml);
        rdoMergeSort.addMouseListener(pml);
        rdoQuickSort.addMouseListener(pml);
        rdoSelectionSort.addMouseListener(pml);
        rdoShellSort.addMouseListener(pml);
         */
    }

    // Cac thanh phan cua PopUp
    JPopupMenu popUp;
    JMenuItem line;

    // Ham khoi tao
    /*
    public void initPopUp(String text) {
        // Tao popup menu
        popUp = new JPopupMenu("My PopUp Menu");

        // Tao cac thanh phan cho PopUp Menu
        line = new JMenuItem(text);
        popUp.add(line);

    }

    class PopupMenuListener extends MouseAdapter {

        // Thuc hien khi hover chuot
        public void mouseEntered(MouseEvent e) {
            // Hien thi popup
            showPopup(e);
        }

        private void showPopup(MouseEvent e) {
            popUp.show(e.getComponent(), e.getX(), e.getY());
            popUp.setVisible(true);
        }

        // Thuc thi khi nha chuot
        public void mouseExited(MouseEvent e) {
            popUp.setVisible(false);
        }
    }
     */
    public void addArr(Button btn) {
        btn.setText("0");
    }

    public void addArr(int btn1, int btn2, int btn3, int btn4, int btn5, int btn6, int btn7, int btn8, int btn9, int btn10) {
        randArray();
        switch (this.length) {
            case 3:
                index4.setText(btn1 + "");
                arr.set(3, btn1);
                index5.setText(btn2 + "");
                arr.set(4, btn2);
                index6.setText(btn3 + "");
                arr.set(5, btn3);
                break;
            case 4:
                index4.setText(btn1 + "");
                arr.set(3, btn1);
                index5.setText(btn2 + "");
                arr.set(4, btn2);
                index6.setText(btn3 + "");
                arr.set(5, btn3);
                index7.setText(btn4 + "");
                arr.set(6, btn4);
                break;
            case 5:
                index3.setText(btn1 + "");
                arr.set(2, btn1);
                index4.setText(btn2 + "");
                arr.set(3, btn2);
                index5.setText(btn3 + "");
                arr.set(4, btn3);
                index6.setText(btn4 + "");
                arr.set(5, btn4);
                index7.setText(btn5 + "");
                arr.set(6, btn5);
                break;
            case 6:
                index3.setText(btn1 + "");
                arr.set(2, btn1);
                index4.setText(btn2 + "");
                arr.set(3, btn2);
                index5.setText(btn3 + "");
                arr.set(4, btn3);
                index6.setText(btn4 + "");
                arr.set(5, btn4);
                index7.setText(btn5 + "");
                arr.set(6, btn5);
                index8.setText(btn6 + "");
                arr.set(7, btn6);
                break;
            case 7:
                index2.setText(btn1 + "");
                arr.set(1, btn1);
                index3.setText(btn2 + "");
                arr.set(2, btn2);
                index4.setText(btn3 + "");
                arr.set(3, btn3);
                index5.setText(btn4 + "");
                arr.set(4, btn4);
                index6.setText(btn5 + "");
                arr.set(5, btn5);
                index7.setText(btn6 + "");
                arr.set(6, btn6);
                index8.setText(btn7 + "");
                arr.set(7, btn7);
                break;
            case 8:
                index2.setText(btn1 + "");
                arr.set(1, btn1);
                index3.setText(btn2 + "");
                arr.set(2, btn2);
                index4.setText(btn3 + "");
                arr.set(3, btn3);
                index5.setText(btn4 + "");
                arr.set(4, btn4);
                index6.setText(btn5 + "");
                arr.set(5, btn5);
                index7.setText(btn6 + "");
                arr.set(6, btn6);
                index8.setText(btn7 + "");
                arr.set(7, btn7);
                index9.setText(btn8 + "");
                arr.set(8, btn8);
                break;
            case 9:
                index1.setText(btn1 + "");
                arr.set(0, btn1);
                index2.setText(btn2 + "");
                arr.set(1, btn2);
                index3.setText(btn3 + "");
                arr.set(2, btn3);
                index4.setText(btn4 + "");
                arr.set(3, btn4);
                index5.setText(btn5 + "");
                arr.set(4, btn5);
                index6.setText(btn6 + "");
                arr.set(5, btn6);
                index7.setText(btn7 + "");
                arr.set(6, btn7);
                index8.setText(btn8 + "");
                arr.set(7, btn8);
                index9.setText(btn9 + "");
                arr.set(8, btn9);
                break;
            case 10:
                index1.setText(btn1 + "");
                arr.set(0, btn1);
                index2.setText(btn2 + "");
                arr.set(1, btn2);
                index3.setText(btn3 + "");
                arr.set(2, btn3);
                index4.setText(btn4 + "");
                arr.set(3, btn4);
                index5.setText(btn5 + "");
                arr.set(4, btn5);
                index6.setText(btn6 + "");
                arr.set(5, btn6);
                index7.setText(btn7 + "");
                arr.set(6, btn7);
                index8.setText(btn8 + "");
                arr.set(7, btn8);
                index9.setText(btn9 + "");
                arr.set(8, btn9);
                index10.setText(btn10 + "");
                arr.set(9, btn10);
                break;
        }
        this.arrBtn = new Button[]{this.index1, this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8, this.index9, this.index10};
        for (Button btn : this.arrBtn) {
            if (btn.getText().equals("")) {
                btn.setText("0");
            }
        }

    }

    public synchronized void runTittle() {
        Thread threadl = new Thread() {
            @Override
            public synchronized void run() {
                String txt = " " + lblTittle.getText() + " ";
                while (true) {
                    txt = txt.substring(1, txt.length()) + txt.charAt(0);
                    try {
                        sleep(500);
                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    lblTittle.setText(txt);
                }
            }

        };
        threadl.start();
    }

    public int getAlignmentXTop(Button btn) {
        if (btn == index1) {
            return 140;
        }
        if (btn == index2) {
            return 240;
        }
        if (btn == index3) {
            return 340;
        }
        if (btn == index4) {
            return 440;
        }
        if (btn == index5) {
            return 540;
        }
        if (btn == index6) {
            return 640;
        }
        if (btn == index7) {
            return 740;
        }
        if (btn == index8) {
            return 840;
        }
        if (btn == index9) {
            return 940;
        }
        if (btn == index10) {
            return 1040;
        }
        return 0;
    }

    public synchronized void hoanVi(Button btn1, Button btn2) {
        String msgBtn1 = btn1.getText();
                String msgBtn2 = btn2.getText();
                
                //thay đổi nội dung
                btn1.setText(msgBtn2);
                btn2.setText(msgBtn1);
                
//        new Thread(new Runnable() {
//            @Override
//            public synchronized void run() {
//                String msgBtn1 = btn1.getText();
//                String msgBtn2 = btn2.getText();
//                
//                //thay đổi nội dung
//                btn1.setText(msgBtn2);
//                btn2.setText(msgBtn1);
//                if (btn1.getX() < btn2.getX()) {
//
//                    int x1 = btn1.getX();
//                    int x2 = btn2.getX();
//                    int x1To = getAlignmentXTop(btn2);
//                    int x2To = getAlignmentXTop(btn1);
//
//                    while (btn1.getY() > 42 && btn2.getY() < 198) {
//                        //cho btn1 đi lên
//                        btn1.setLocation(x1, btn1.getY() - 1);
//                        //cho btn2 đi xuống
//                        btn2.setLocation(x2, btn2.getY() + 1);
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//
//                    while (btn1.getX() < x1To && btn2.getX() > x2To) {
//                        //cho btn1 qua phải
//                        btn1.setLocation(btn1.getX() + 1, btn1.getY());
//                        //cho btn2 qua trái
//                        btn2.setLocation(btn2.getX() - 1, btn2.getY());
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//
//                    while (btn1.getY() < 120 && btn2.getY() > 120) {
//                        //cho btn1 đi xuống
//                        btn1.setLocation(btn1.getX(), btn1.getY() + 1);
//                        //cho btn2 đi lên
//                        btn2.setLocation(btn2.getX(), btn2.getY() - 1);
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                } else {
//                    int x1 = btn1.getX();
//                    int x2 = btn2.getX();
//                    int x1To = getAlignmentXTop(btn2);
//                    int x2To = getAlignmentXTop(btn1);
//
//                    while (btn2.getY() > 42 && btn1.getY() < 198) {
//                        //cho btn2 đi lên
//                        btn2.setLocation(x2, btn2.getY() - 1);
//                        //cho btn1 đi xuống
//                        btn1.setLocation(x1, btn1.getY() + 1);
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    x1To = btn2.getX();
//                    x2To = btn1.getX();
//                    while (btn2.getX() < x2To && btn1.getX() > x1To) {
//                        //cho btn2 qua phải
//                        btn2.setLocation(btn2.getX() + 1, btn2.getY());
//                        //cho btn1 qua trái
//                        btn1.setLocation(btn1.getX() - 1, btn1.getY());
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//
//                    while (btn2.getY() < 120 && btn1.getY() > 120) {
//                        //cho btn1 đi lên
//                        btn2.setLocation(btn2.getX(), btn2.getY() + 1);
//                        //cho btn2 đi xuống
//                        btn1.setLocation(btn1.getX(), btn1.getY() - 1);
//                        try {
//                            Thread.sleep((long) (flash * 0.001));
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }
//                //trả lại vik trí cũ
//                btn1.setLocation(btn2.getX(), btn2.getY());
//                btn2.setLocation(btn1.getX(), btn1.getY());
//
//                
//            }
//        }).start();
    }

    public synchronized void shift(Button btn1, Button btn2) {
        if(btn1.getX() == btn2.getX() && btn1.getY() == btn2.getY()){
            System.out.println("Y: BTN1 ||| BTN2");
            return;
        }
        getFlash();
        String msgBtn1 = btn1.getText();
        String msgBtn2 = btn2.getText();
        if (btn1.getX() < btn2.getX()) {

            int x1 = btn1.getX();
            int x2 = btn2.getX();
            int x1To = getAlignmentXTop(btn2);
            int x2To = getAlignmentXTop(btn1);

            while (btn1.getY() > 42 && btn2.getY() < 198) {
                //cho btn1 đi lên
                btn1.setLocation(x1, btn1.getY() - 1);
                //cho btn2 đi xuống
                btn2.setLocation(x2, btn2.getY() + 1);
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            while (btn1.getX() < x1To && btn2.getX() > x2To) {
                //cho btn1 qua phải
                btn1.setLocation(btn1.getX() + 1, btn1.getY());
                //cho btn2 qua trái
                btn2.setLocation(btn2.getX() - 1, btn2.getY());
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            while (btn1.getY() < 120 && btn2.getY() > 120) {
                //cho btn1 đi xuống
                btn1.setLocation(btn1.getX(), btn1.getY() + 1);
                //cho btn2 đi lên
                btn2.setLocation(btn2.getX(), btn2.getY() - 1);
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            int x1 = btn1.getX();
            int x2 = btn2.getX();
            int x1To = getAlignmentXTop(btn2);
            int x2To = getAlignmentXTop(btn1);

            while (btn2.getY() > 42 && btn1.getY() < 198) {
                //cho btn2 đi lên
                btn2.setLocation(x2, btn2.getY() - 1);
                //cho btn1 đi xuống
                btn1.setLocation(x1, btn1.getY() + 1);
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            x1To = btn2.getX();
            x2To = btn1.getX();
            while (btn2.getX() < x2To && btn1.getX() > x1To) {
                //cho btn2 qua phải
                btn2.setLocation(btn2.getX() + 1, btn2.getY());
                //cho btn1 qua trái
                btn1.setLocation(btn1.getX() - 1, btn1.getY());
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            while (btn2.getY() < 120 && btn1.getY() > 120) {
                //cho btn1 đi lên
                btn2.setLocation(btn2.getX(), btn2.getY() + 1);
                //cho btn2 đi xuống
                btn1.setLocation(btn1.getX(), btn1.getY() - 1);
                try {
                    Thread.sleep((long) (flash * 0.001));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //trả lại vik trí cũ
        btn1.setLocation(btn2.getX(), btn2.getY());
        btn2.setLocation(btn1.getX(), btn1.getY());

        //thay đổi nội dung
        btn1.setText(msgBtn2);
        btn2.setText(msgBtn1);

    }
    

    public synchronized void goUp(Button btn1) {
        getFlash();
        String msgBtn1 = btn1.getText();
        int x1 = btn1.getX();
        while (btn1.getY() > 42) {
            //cho btn1 đi lên
            btn1.setLocation(x1, btn1.getY() - 1);
            try {
                Thread.sleep((long) (flash * 0.001));
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void setVisibleF(Button but) {
        but.setVisible(false);
    }

    public void visibleTrueButton(Button index1, Button index2, Button index3, Button index4, Button index5, Button index6, Button index7, Button index8, Button index9, Button index10) {
        this.arrBtn = new Button[]{this.index1, this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8, this.index9, this.index10};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index1, Button index2, Button index3, Button index4, Button index5, Button index6, Button index7, Button index8, Button index9) {
        this.arrBtn = new Button[]{this.index1, this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8, this.index9};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index2, Button index3, Button index4, Button index5, Button index6, Button index7, Button index8, Button index9) {
        this.arrBtn = new Button[]{this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8, this.index9};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index2, Button index3, Button index4, Button index5, Button index6, Button index7, Button index8) {
        this.arrBtn = new Button[]{this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index3, Button index4, Button index5, Button index6, Button index7, Button index8) {
        this.arrBtn = new Button[]{this.index3, this.index4, this.index5, this.index6, this.index7, this.index8};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index3, Button index4, Button index5, Button index6, Button index7) {
        this.arrBtn = new Button[]{this.index3, this.index4, this.index5, this.index6, this.index7};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index4, Button index5, Button index6, Button index7) {
        this.arrBtn = new Button[]{this.index4, this.index5, this.index6, this.index7};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleTrueButton(Button index4, Button index5, Button index6) {
        this.arrBtn = new Button[]{this.index4, this.index5, this.index6};
        for (Button btn : this.arrBtn) {
            btn.setVisible(true);
        }
    }

    public void visibleFalseMid() {
        this.arrBtn = new Button[]{index1, index2, index3, index4, index5, index6, index7, index8, index9, index10};
        for (Button btn : this.arrBtn) {
            btn.setVisible(false);
            btn.setText("");
            btn.setForeground(Color.black);
        }
    }

    public void doneSort() {
        this.arrBtn = new Button[]{index1, index2, index3, index4, index5, index6, index7, index8, index9, index10};
        for (Button btn : this.arrBtn) {
            //btn.setForeground(new Color(102,102,255));
            btn.setBackground(new Color(255, 255, 204));
        }
        if (btnSort.getText().equals("Dừng!")) {
            btnSort.setText("Sắp xếp");
        }
        this.arrRdo = new JRadioButton[]{
            rdoInterchangeSort, rdoSelectionSort, rdoBubbleSort, rdoMergeSort, rdoShellSort, rdoQuickSort, rdoInsertionSort, rdoSortAZ, rdoSortZA
        };
        for (JRadioButton rdo : this.arrRdo) {
            rdo.setEnabled(true);
        }
        btnCreate.setEnabled(true);
        btnCreateFromFile.setEnabled(true);
        btnCreateFromKey.setEnabled(true);
        btnCreateRand.setEnabled(true);
        btnDelete.setEnabled(true);
        snTheNum.setEnabled(true);
        sdFlash.setEnabled(true);
    }

    public void sorting() {
        this.arrBtn = new Button[]{index1, index2, index3, index4, index5, index6, index7, index8, index9, index10};
        for (Button btn : this.arrBtn) {
            btn.setBackground(new Color(204, 204, 255));
        }
    }

    public void startSort() {
        this.arrRdo = new JRadioButton[]{
            rdoInterchangeSort, rdoSelectionSort, rdoBubbleSort, rdoMergeSort, rdoShellSort, rdoQuickSort, rdoInsertionSort, rdoSortAZ, rdoSortZA
        };
        for (JRadioButton rdo : this.arrRdo) {
            rdo.setEnabled(false);
        }
        btnCreate.setEnabled(false);
        btnCreateFromFile.setEnabled(false);
        btnCreateFromKey.setEnabled(false);
        btnCreateRand.setEnabled(false);
        btnDelete.setEnabled(false);
        snTheNum.setEnabled(false);
        sdFlash.setEnabled(false);
    }

    public void randArray() {
        //xóa dữ liệu trong mảng
        arr.clear();

        //quay về trạng thái chưa sắp xếp mảng
        result = false;

        //random số từ 0 đến 99
        int randomNumber = 0;
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 10; iCount++) {
            randomNumber = objGenerator.nextInt(100);
            arr.add(randomNumber);
        }
    }

    public void addValueArr() {
        this.arrBtn = new Button[]{index1, index2, index3, index4, index5, index6, index7, index8, index9, index10};
        int i = 0;
        for (Button btn : this.arrBtn) {
            btn.setText(this.arr.get(i) + "");
            i++;
        }
    }

    public Button sortButton(int index) {
        switch (index) {
            case 0:
                return index1;
            case 1:
                return index2;
            case 2:
                return index3;
            case 3:
                return index4;
            case 4:
                return index5;
            case 5:
                return index6;
            case 6:
                return index7;
            case 7:
                return index8;
            case 8:
                return index9;
            case 9:
                return index10;
        }
        return index1;
    }

    public synchronized void getFlash() {
        switch (sdFlash.getValue()) {
            case 10:
                this.flash = 6000;
                break;
            case 20:
                this.flash = 4000;
                break;
            case 30:
                this.flash = 2000;
                break;
            case 40:
                this.flash = 1000;
                break;
            case 50:
                this.flash = 200;
                break;
            default:
                this.flash = 1000;
                break;
        }
    }

    public void addInterchange() {
        //[để tạm]: thay đổi giá trị ô màu tím (để phù hợp hơn cho QuickSort)
        if (rdoQuickSort.isSelected()) {
            jLabel5.setText("Pivot");
        } else {
            jLabel5.setText("Min/Max");
        }
        /*
        void interchangeSort(int arr[], int n) {
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {      
                    if (arr[j] < arr[i]) 
                        swaps(arr[j], arr[i]);
                }
            }
        }
         */
        linkeListModel.getDropMode();
        listModel = new DefaultListModel();
        listModel.addElement("    void interchangeSort(int arr[], int n) {");
        listModel.addElement("         for (int i=0; i<n-1; i++) {");
        listModel.addElement("              for (int j=i+1; j<n; j++) {");
        if (rdoSortAZ.isSelected()) {
            listModel.addElement("                   if (arr[j] < arr[i])");
        } else {
            listModel.addElement("                   if (arr[j] > arr[i])");
        }
        listModel.addElement("                       swaps(arr[j], arr[i]);");
        listModel.addElement("            }");
        listModel.addElement("        }");
        listModel.addElement("    }");
        linkeListModel.setModel(listModel);
    }

    public void checkFlag(Thread t) {
        if (flag) {
            flag = !flag;
            t.stop();
        }
    }

    public synchronized void interchangeSort(int begin, int end) {
        flag = true;
        new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    getFlash();

                    linkeListModel.setSelectedIndex(0);
                    if (rdoSortAZ.isSelected()) {
                        for (int i = begin - 1; i < end - 1; i++) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            for (int j = i + 1; j < end; j++) {
                                linkeListModel.setSelectedIndex(2);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);

                                linkeListModel.setSelectedIndex(3);
                                Thread.sleep(flash / 2);
                                if (arr.get(i) > arr.get(j)) {
                                    linkeListModel.setSelectedIndex(4);
                                    int temp = arr.get(i);
                                    arr.set(i, arr.get(j));
                                    arr.set(j, temp);
                                    //hoanVi(sortButton(i), sortButton(j));
                                    shift(sortButton(i), sortButton(j));
                                    //Thread.sleep(flash);
                                }
                                if (!flag) {
                                    return;
                                }
                            }
                        }
                    } else {
                        for (int i = begin - 1; i < end - 1; i++) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            for (int j = i + 1; j < end; j++) {
                                linkeListModel.setSelectedIndex(2);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);

                                linkeListModel.setSelectedIndex(3);
                                Thread.sleep(flash / 2);
                                if (arr.get(i) > arr.get(j)) {
                                    linkeListModel.setSelectedIndex(4);
                                    int temp = arr.get(i);
                                    arr.set(i, arr.get(j));
                                    arr.set(j, temp);
                                    //hoanVi(sortButton(i), sortButton(j));
                                    shift(sortButton(i), sortButton(j));
                                    //Thread.sleep(flash);
                                }
                                if (!flag) {
                                    return;
                                }
                            }
                        }
                    }
                    doneSort();
                    //sắp xếp mảng thành công

                    linkeListModel.setSelectedIndex(7);
                    result = false;
                    new ComplateSort((Frame) frame, true).setVisible(true);
                    addInterchange();
                } catch (Exception e) {
                }
            }
        }).start();
    }

    //Bubble sort
    public void addBubble() {
        //[để tạm]: thay đổi giá trị ô màu tím (để phù hợp hơn cho QuickSort)
        if (rdoQuickSort.isSelected()) {
            jLabel5.setText("Pivot");
        } else {
            jLabel5.setText("Min/Max");
        }
        /*
        for (int i=n-1; i>0; i--) {              
            for (int j=i; j<i; j++) {          
                if (arr[j] > arr[j+1])        
                    swaps(arr[j], arr[j+1]);
            }
        }
         */
        linkeListModel.getDropMode();
        listModel = new DefaultListModel();
        listModel.addElement("    void bubbleSort(int arr[], int n) {");
        listModel.addElement("        for (int i=n-1; i>0; i--) {");
        listModel.addElement("             for (int j=0; j<i; j++) {");
        if (rdoSortAZ.isSelected()) {
            listModel.addElement("                  if (arr[j] < arr[j+1])");
        } else {
            listModel.addElement("                  if (arr[j] > arr[j+1])");
        }
        listModel.addElement("                      swaps(arr[j], arr[j+1]);");
        listModel.addElement("             }");
        listModel.addElement("        }");
        listModel.addElement("    }");
        linkeListModel.setModel(listModel);
    }

    public synchronized void bubbleSort(int begin, int end) {
        new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    getFlash();
                    if (rdoSortAZ.isSelected()) {
                        for (int i = end - 1; i > begin - 1; i--) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            for (int j = begin - 1; j < i; j++) {
                                linkeListModel.setSelectedIndex(2);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);
                                linkeListModel.setSelectedIndex(3);
                                Thread.sleep(flash / 2);
                                if (arr.get(j) > arr.get(j + 1)) {
                                    linkeListModel.setSelectedIndex(4);
                                    int temp = arr.get(j);
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp);
                                    shift(sortButton(j + 1), sortButton(j));

                                }
                                if (!flag) {
                                    return;
                                }
                            }
                        }
                    } else {
                        for (int i = end - 1; i > begin - 1; i--) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            for (int j = begin - 1; j < i; j++) {
                                linkeListModel.setSelectedIndex(2);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);
                                linkeListModel.setSelectedIndex(3);
                                Thread.sleep(flash / 2);
                                if (arr.get(j) < arr.get(j + 1)) {
                                    linkeListModel.setSelectedIndex(4);
                                    int temp = arr.get(j);
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp);
                                    shift(sortButton(j + 1), sortButton(j));
                                }
                                if (!flag) {
                                    return;
                                }
                            }
                        }
                    }
                    doneSort();
                    //sắp xếp mảng thành công
                    //
                    linkeListModel.setSelectedIndex(7);
                    result = false;
                    new ComplateSort((Frame) frame, true).setVisible(true);
                    addBubble();
                } catch (Exception e) {
                }
            }
        }).start();
    }

    public void addSelection() {
        //[để tạm]: thay đổi giá trị ô màu tím (để phù hợp hơn cho QuickSort)
        if (rdoQuickSort.isSelected()) {
            jLabel5.setText("Pivot");
        } else {
            jLabel5.setText("Min/Max");
        }
        /*
        for (int i=0; i<n-1; i++)  {            
            int minIndex = i;                  
            for (int j=i+1; j<n; j++) {      
                if (arr[j] < arr[minIndex]) 
                    minIndex = j;            
                swaps(arr[i], arr[miIndex]);
            }
        }
         */
        linkeListModel.getDropMode();
        listModel = new DefaultListModel();
        listModel.addElement("    void selectionSort(int arr[], int n) {");
        listModel.addElement("        for (int i=0; i<n-1; i++)  { ");
        if (rdoSortAZ.isSelected()) {
            listModel.addElement("             int minPos = i;   ");
            listModel.addElement("             for (int j=i+1; j<n; j++) { ");
            listModel.addElement("                  if (arr[j] < arr[minPos])");
            listModel.addElement("                      minPos = j; ");
            listModel.addElement("             if (minPos != i)");
            listModel.addElement("                 swap(arr[i], arr[minPos]);");
            listModel.addElement("             }");
            listModel.addElement("        }");
            listModel.addElement("    }");

        } else {
            listModel.addElement("            int maxPos = i;   ");
            listModel.addElement("            for (int j=i+1; j<n; j++) { ");
            listModel.addElement("                if (arr[j] > arr[maxPos])");
            listModel.addElement("                    maxPos = j; ");
            listModel.addElement("            if (maxPos != i)");
            listModel.addElement("                swap(arr[i], arr[maxPos]);");
            listModel.addElement("            }");
            listModel.addElement("        }");
            listModel.addElement("    }");
        }

        linkeListModel.setModel(listModel);
    }

    //Selection sort
    public synchronized void selectionSort(int begin, int end) {
        new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                try {
                    getFlash();
                    if (rdoSortAZ.isSelected()) {
                        for (int i = begin - 1; i < end - 1; i++) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            int minIndex = i;
                            sortButton(minIndex).setBackground(new Color(204, 153, 255));
                            linkeListModel.setSelectedIndex(2);
                            for (int j = i + 1; j < end; j++) {
                                linkeListModel.setSelectedIndex(3);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(minIndex).setBackground(new Color(204, 153, 255));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);
                                linkeListModel.setSelectedIndex(4);
                                Thread.sleep(flash / 2);
                                if (arr.get(j) < arr.get(minIndex)) {
                                    linkeListModel.setSelectedIndex(5);
                                    sortButton(minIndex).setBackground(new Color(204, 204, 255));
                                    sortButton(i).setBackground(new Color(204, 255, 204));
                                    minIndex = j;
                                    sortButton(minIndex).setBackground(new Color(204, 153, 255));
                                    Thread.sleep(flash / 3);
                                }
                                if (!flag) {
                                    return;
                                }

                            }
                            linkeListModel.setSelectedIndex(6);
                            Thread.sleep(flash / 3);
                            if (minIndex != i) {
                                linkeListModel.setSelectedIndex(7);
                                shift(sortButton(i), sortButton(minIndex));
                                int temp = arr.get(i);
                                arr.set(i, arr.get(minIndex));
                                arr.set(minIndex, temp);
                            }
                        }
                    } else {
                        for (int i = begin - 1; i < end - 1; i++) {
                            sorting();
                            linkeListModel.setSelectedIndex(1);
                            sortButton(i).setBackground(new Color(204, 255, 204));
                            Thread.sleep(flash / 2);
                            int minIndex = i;
                            sortButton(minIndex).setBackground(new Color(204, 153, 255));
                            linkeListModel.setSelectedIndex(2);
                            for (int j = i + 1; j < end; j++) {
                                linkeListModel.setSelectedIndex(3);
                                sorting();
                                sortButton(i).setBackground(new Color(204, 255, 204));
                                sortButton(minIndex).setBackground(new Color(204, 153, 255));
                                sortButton(j).setBackground(new Color(255, 204, 204));
                                Thread.sleep(flash / 2);
                                linkeListModel.setSelectedIndex(4);
                                Thread.sleep(flash / 2);
                                if (arr.get(j) > arr.get(minIndex)) {
                                    linkeListModel.setSelectedIndex(5);
                                    sortButton(minIndex).setBackground(new Color(204, 204, 255));
                                    sortButton(i).setBackground(new Color(204, 255, 204));
                                    minIndex = j;
                                    sortButton(minIndex).setBackground(new Color(204, 153, 255));
                                    Thread.sleep(flash / 2);
                                }
                                if (!flag) {
                                    return;
                                }
                            }
                            linkeListModel.setSelectedIndex(6);
                            int temp = arr.get(i);
                            arr.set(i, arr.get(minIndex));
                            arr.set(minIndex, temp);
                            shift(sortButton(i), sortButton(minIndex));
                        }
                    }
                    doneSort();
                    //
                    linkeListModel.setSelectedIndex(10);
                    //sắp xếp mảng thành công
                    result = false;
                    new ComplateSort((Frame) frame, true).setVisible(true);
                    addSelection();
                } catch (Exception e) {
                }
            }
        }).start();
    }

    public void addMerge() {

    }

    //merge sort
    public synchronized void mergeSort(int begin, int end) {

    }

    //check sự sắp xếp của mảng
    /*
    Ascending : true -> Tăng dần
    Ascending : False -> Giảm dần
     */
    public boolean checkSorted(boolean ascending) {
        if (ascending) {
            for (int i = this.start - 1; i < this.end - 2; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = this.start - 1; i < this.end - 2; i++) {
                if (arr.get(i) < arr.get(i + 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
                        QUICK SORT BEGIN
    ============================================================================
     */
    public void addQuick() {
        //[để tạm]: thay đổi giá trị ô màu tím (để phù hợp hơn cho QuickSort)
        if (rdoQuickSort.isSelected()) {
            jLabel5.setText("Pivot");
        } else {
            jLabel5.setText("Min/Max");
        }

        linkeListModel.getDropMode();
        listModel = new DefaultListModel();

        /*
        listModel.addElement("void QuickSort(int arr[], int l, int r)");
        listModel.addElement("{");
        listModel.addElement("    int pivot = a[(l+r)/2];");
        listModel.addElement("    int i = l, j = r, temp;");
        listModel.addElement("    while(i < j)");
        listModel.addElement("    {");
        if (rdoSortAZ.isSelected()) {
            listModel.addElement("        while(a[i] < pivot) i++;");
            listModel.addElement("        while(a[j] > pivot) j--;");
        } else {
            listModel.addElement("        while(a[i] > pivot) i++;");
            listModel.addElement("        while(a[j] < pivot) j--;");
        }
        listModel.addElement("        if(i <= j)");
        listModel.addElement("        {");
        listModel.addElement("            swap(a[i], a[j]);");
        listModel.addElement("        }");
        listModel.addElement("    }");
        listModel.addElement("    if(i < r) quickSort(a, i, r);");
        listModel.addElement("    if(j > l) quickSort(a, l, j);");
        listModel.addElement("}");
        linkeListModel.setModel(listModel);
         */
        listModel.addElement("    void quickSort(int arr[], int L, int R) {");
        listModel.addElement("          if (L >= R) return;");
        listModel.addElement("          int pivot = L, i = L +1, j = R;");
        listModel.addElement("          while (i <= j) {");
        listModel.addElement("          while (i <= R && arr[i] <= arr[pivot]) {");
        listModel.addElement("              i++");
        listModel.addElement("          }");
        listModel.addElement("          while (j > L && arr[j] >= arr[pivot]) {");
        listModel.addElement("              j--");
        listModel.addElement("          }");
        listModel.addElement("          if (i > j)");
        listModel.addElement("              swap(a[pivot], a[j]);");
        listModel.addElement("          else ");
        listModel.addElement("              swap(a[i] , a[j]);");
        listModel.addElement("          quickSort(L, j - 1);");
        listModel.addElement("          quickSort(j + 1, R);");
        listModel.addElement("    }");
        linkeListModel.setModel(listModel);
    }

    int count = 0;

    List<Quick> listQuick = new ArrayList();

    /*
    public void quick(int start, int end) {
        if (start >= end) {
            return;
        }
        int key = start;
        int i = start + 1;
        int j = end;
        int temp;

        listQuick.add(new Quick(false, key, i, j, start, end, -1, -1, true, false, false, false, false));

        while (i <= j) {
            while (i <= end && listTempQuick.get(i) <= listTempQuick.get(key)) {
                i++;
                listQuick.add(new Quick(false, key, i, j, start, end, -1, -1, false, true, false, false, false));
            }
            while (j > start && listTempQuick.get(j) >= listTempQuick.get(key)) {
                j--;
                listQuick.add(new Quick(false, key, i, j, start, end, -1, -1, false, false, true, false, false));
            }
            listQuick.add(new Quick(false, key, i, j, start, end, -1, -1, false, false, false, true, false));
            if (i > j) {
                //swap a[key], a[j]
                int tempSort = listTempQuick.get(key);
                listTempQuick.set(key, listTempQuick.get(j));
                listTempQuick.set(j, tempSort);
                listQuick.add(new Quick(true, key, i, j, start, end, key, j));
            } else {
                listQuick.add(new Quick(false, key, i, j, start, end, -1, -1, false, false, false, false, true));
                //swap (a[i] , a[j])
                int tempSort = listTempQuick.get(i);
                listTempQuick.set(i, listTempQuick.get(j));
                listTempQuick.set(j, tempSort);
                listQuick.add(new Quick(true, key, i, j, start, end, i, j));
            }
            quick(start, j - 1);
            quick(j + 1, end);
        }
    }
     */
    public synchronized void quickSort() {
        listQuick.clear();
        listTempQuick.clear();
        listTempQuick.addAll(arr);
        sort(listTempQuick, this.start - 1, this.end - 1);
        System.out.println("Sorted: " + Arrays.toString(listTempQuick.toArray()));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (Quick q : listQuick) {
                        sorting();
                        hideOutside(q.getStart(), q.getEnd());
                        //default: -989898
                        
//                        if (q.getStart() != -989898 && q.getEnd() != -989898) {
//                            sortButton(q.getStart()).setBackground(Color.CYAN);
//                            sortButton(q.getEnd()).setBackground(Color.CYAN);
//                        }
                        if (q.getI() != -989898 && q.getJ() != -989898) {
                            sortButton(q.getI()).setBackground(new Color(204, 255, 204));
                            sortButton(q.getJ()).setBackground(new Color(255, 204, 204));
                        }
                        
                        if (q.getPivot() != -989898) {
                            sortButton(q.getPivot()).setBackground(new Color(204,153,255));
                        }

                        if (q.isSwap() && (q.getX() != q.getY())) {

                            int temp = arr.get(q.getX());
                            arr.set(q.getX(), arr.get(q.getY()));
                            arr.set(q.getY(), temp);
                            
                            shift(sortButton(q.getX()), sortButton(q.getY()));
                        }
                        Thread.sleep(flash / 2);
                    }
                    doneSort();
                    //
                    //sắp xếp mảng thành công
                    result = false;
                    new ComplateSort((Frame) frame, true).setVisible(true);
                    addQuick();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }).start();
    }
    
    public void hideOutside(int l, int r){
        this.arrBtn = new Button[]{this.index1, this.index2, this.index3, this.index4, this.index5, this.index6, this.index7, this.index8, this.index9, this.index10};
        for (int i=0; i<l; i++) {
            arrBtn[i].setBackground(Color.GRAY);
        }
        for(int i=r+1; i<=9; i++){
            arrBtn[i].setBackground(Color.GRAY);
        }
    }

    public void sort(List<Integer> list, int L, int R) {
        if (L >= R) {
            return;
        }

        int key = listTempQuick.get((L + R) / 2);

        int k = getPivot(listTempQuick, L, R, key);

        //add note
        listQuick.add(new Quick(false, k, -989898, -989898, L, R, -989898, -989898));

        sort(listTempQuick, L, k - 1);
        sort(listTempQuick, k, R);
    }

    int getPivot(List<Integer> list, int L, int R, int key) {
        int iL = L;
        int iR = R;

        listQuick.add(new Quick(false, -989898, iL, iR, L, R, -989898, -989898));
        while (iL <= iR) {
            while (listTempQuick.get(iL) < key) {
                iL++;
                listQuick.add(new Quick(false, -989898, iL, iR, L, R, -989898, -989898));
            }
            while (listTempQuick.get(iR) > key) {
                iR--;
                listQuick.add(new Quick(false, -989898, iL, iR, L, R, -989898, -989898));
            }
            if (iL <= iR) {
                //swap(a[iL], a[iR])
                int temp = listTempQuick.get(iL);
                listTempQuick.set(iL, listTempQuick.get(iR));
                listTempQuick.set(iR, temp);
                //System.out.println("Swap(" + iL + "-" + iR + ")");
                //System.out.println("^"+Arrays.toString(list.toArray()));

                //add note
                listQuick.add(new Quick(true, -989898, iL, iR, L, R, iL, iR));
                iL++;
                iR--;
            }
        }
        return iL;
    }

    /*
                        QUICK SORT END
    ============================================================================
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTittle = new javax.swing.JLabel();
        lblInfor = new javax.swing.JLabel();
        pnManHinhMoPhong = new javax.swing.JPanel();
        index1 = new com.swing.Button();
        index2 = new com.swing.Button();
        index3 = new com.swing.Button();
        index4 = new com.swing.Button();
        index5 = new com.swing.Button();
        index6 = new com.swing.Button();
        index7 = new com.swing.Button();
        index8 = new com.swing.Button();
        index9 = new com.swing.Button();
        index10 = new com.swing.Button();
        jPanel4 = new javax.swing.JPanel();
        snTheNum = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnCreate = new com.swing.Button();
        btnDelete = new com.swing.Button();
        pnCode = new javax.swing.JPanel();
        jScrollPane1 = new com.swing.scroll.win11.ScrollPaneWin11();
        linkeListModel = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        btnCreateRand = new com.swing.Button();
        btnCreateFromFile = new com.swing.Button();
        jSeparator1 = new javax.swing.JSeparator();
        pnListlistAlgoritmi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoInterchangeSort = new com.swing.RadioButtonCustom();
        rdoSelectionSort = new com.swing.RadioButtonCustom();
        rdoBubbleSort = new com.swing.RadioButtonCustom();
        rdoMergeSort = new com.swing.RadioButtonCustom();
        rdoShellSort = new com.swing.RadioButtonCustom();
        rdoQuickSort = new com.swing.RadioButtonCustom();
        rdoInsertionSort = new com.swing.RadioButtonCustom();
        btnSort = new com.swing.Button();
        index12 = new com.swing.Button();
        index13 = new com.swing.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCreateFromKey = new com.swing.Button();
        index14 = new com.swing.Button();
        sdFlash = new swing.slider.SliderGradient();
        rdoSortAZ = new com.swing.RadioButtonCustom();
        rdoSortZA = new com.swing.RadioButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm mô phỏng thuật toán sắp xếp");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTittle.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(0, 153, 153));
        lblTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittle.setText("         MÔ PHỎNG THUẬT TOÁN SẮP XẾP               ");
        jPanel2.add(lblTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 80));

        lblInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/library/icon/businessman.png"))); // NOI18N
        lblInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInforMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInforMouseEntered(evt);
            }
        });
        jPanel2.add(lblInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pnManHinhMoPhong.setBackground(new java.awt.Color(244, 244, 244));
        pnManHinhMoPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnManHinhMoPhongMouseEntered(evt);
            }
        });
        pnManHinhMoPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        index1.setBackground(new java.awt.Color(204, 204, 255));
        index1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index1.setName("index1"); // NOI18N
        pnManHinhMoPhong.add(index1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, 60));

        index2.setBackground(new java.awt.Color(204, 204, 255));
        index2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index2.setName("index2"); // NOI18N
        pnManHinhMoPhong.add(index2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 60, 60));

        index3.setBackground(new java.awt.Color(204, 204, 255));
        index3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index3.setName("index3"); // NOI18N
        pnManHinhMoPhong.add(index3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 60));

        index4.setBackground(new java.awt.Color(204, 204, 255));
        index4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index4.setName("index4"); // NOI18N
        pnManHinhMoPhong.add(index4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 60, 60));

        index5.setBackground(new java.awt.Color(204, 204, 255));
        index5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index5.setName("index5"); // NOI18N
        pnManHinhMoPhong.add(index5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 60, 60));

        index6.setBackground(new java.awt.Color(204, 204, 255));
        index6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index6.setName("index6"); // NOI18N
        pnManHinhMoPhong.add(index6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 60, 60));

        index7.setBackground(new java.awt.Color(204, 204, 255));
        index7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index7.setName("index7"); // NOI18N
        pnManHinhMoPhong.add(index7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 60, 60));

        index8.setBackground(new java.awt.Color(204, 204, 255));
        index8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index8.setName("index8"); // NOI18N
        pnManHinhMoPhong.add(index8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 60, 60));

        index9.setBackground(new java.awt.Color(204, 204, 255));
        index9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index9.setName("index9"); // NOI18N
        pnManHinhMoPhong.add(index9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 60, 60));

        index10.setBackground(new java.awt.Color(204, 204, 255));
        index10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index10.setName("index10"); // NOI18N
        pnManHinhMoPhong.add(index10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 60, 60));

        jPanel1.add(pnManHinhMoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1270, 300));

        jPanel4.setBackground(new java.awt.Color(244, 244, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        snTheNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        snTheNum.setModel(new javax.swing.SpinnerNumberModel(3, 3, 10, 1));
        snTheNum.setBorder(null);
        jPanel4.add(snTheNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 30, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Số phần tử");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, 110, 30));

        btnCreate.setBackground(new java.awt.Color(153, 255, 153));
        btnCreate.setText("Tạo mảng");
        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 240, 30));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("Xóa mảng");
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, -1));

        pnCode.setBackground(new java.awt.Color(244, 244, 244));
        pnCode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        pnCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnCodeMouseEntered(evt);
            }
        });
        pnCode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        linkeListModel.setBackground(new java.awt.Color(244, 244, 244));
        linkeListModel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(linkeListModel);

        pnCode.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 40, 466, 250));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Code C/C++");
        pnCode.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 440, 20));

        jPanel4.add(pnCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 12, 470, 287));

        btnCreateRand.setBackground(new java.awt.Color(153, 204, 255));
        btnCreateRand.setText("Tạo mảng ngẫu nhiên");
        btnCreateRand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRandActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreateRand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 240, -1));

        btnCreateFromFile.setBackground(new java.awt.Color(255, 102, 255));
        btnCreateFromFile.setText("Đọc từ File");
        btnCreateFromFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateFromFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateFromFileMouseEntered(evt);
            }
        });
        btnCreateFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFromFileActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreateFromFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 274, 10));

        pnListlistAlgoritmi.setBackground(new java.awt.Color(244, 244, 244));
        pnListlistAlgoritmi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        pnListlistAlgoritmi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Các thuật toán");
        pnListlistAlgoritmi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        buttonGroup2.add(rdoInterchangeSort);
        rdoInterchangeSort.setSelected(true);
        rdoInterchangeSort.setText("Interchange Sort");
        rdoInterchangeSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoInterchangeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoInterchangeSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoInterchangeSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 33, -1, 40));

        buttonGroup2.add(rdoSelectionSort);
        rdoSelectionSort.setText("Selection Sort");
        rdoSelectionSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoSelectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSelectionSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoSelectionSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 71, -1, 30));

        buttonGroup2.add(rdoBubbleSort);
        rdoBubbleSort.setText("Bubble Sort");
        rdoBubbleSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoBubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBubbleSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoBubbleSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 109, -1, 30));

        buttonGroup2.add(rdoMergeSort);
        rdoMergeSort.setText("Merge Sort");
        rdoMergeSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoMergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMergeSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoMergeSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 147, -1, -1));

        buttonGroup2.add(rdoShellSort);
        rdoShellSort.setText("Shell Sort");
        rdoShellSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoShellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoShellSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoShellSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 185, -1, -1));

        buttonGroup2.add(rdoQuickSort);
        rdoQuickSort.setText("Quick Sort");
        rdoQuickSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoQuickSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoQuickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 223, -1, -1));

        buttonGroup2.add(rdoInsertionSort);
        rdoInsertionSort.setText("Insertion Sort");
        rdoInsertionSort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoInsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoInsertionSortActionPerformed(evt);
            }
        });
        pnListlistAlgoritmi.add(rdoInsertionSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jPanel4.add(pnListlistAlgoritmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 12, 200, 287));

        btnSort.setBackground(new java.awt.Color(204, 204, 255));
        btnSort.setText("Sắp xếp");
        btnSort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        jPanel4.add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, 230, 40));

        index12.setBackground(new java.awt.Color(255, 204, 204));
        index12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        index12.setForeground(new java.awt.Color(0, 153, 0));
        index12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index12.setName("index4"); // NOI18N
        index12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                index12ActionPerformed(evt);
            }
        });
        jPanel4.add(index12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 25, 25));

        index13.setBackground(new java.awt.Color(204, 153, 255));
        index13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        index13.setForeground(new java.awt.Color(0, 153, 0));
        index13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index13.setName("index4"); // NOI18N
        index13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                index13ActionPerformed(evt);
            }
        });
        jPanel4.add(index13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 25, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Biến i");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Biến j");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Min/Max");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, 140, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 260, 20));

        btnCreateFromKey.setBackground(new java.awt.Color(255, 102, 255));
        btnCreateFromKey.setText("Thủ công");
        btnCreateFromKey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateFromKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateFromKeyMouseEntered(evt);
            }
        });
        btnCreateFromKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFromKeyActionPerformed(evt);
            }
        });
        jPanel4.add(btnCreateFromKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 110, -1));

        index14.setBackground(new java.awt.Color(204, 255, 204));
        index14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        index14.setForeground(new java.awt.Color(0, 153, 0));
        index14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        index14.setName("index4"); // NOI18N
        index14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                index14ActionPerformed(evt);
            }
        });
        jPanel4.add(index14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 25, 25));

        sdFlash.setBackground(new java.awt.Color(244, 244, 244));
        sdFlash.setMajorTickSpacing(10);
        sdFlash.setMaximum(50);
        sdFlash.setMinimum(10);
        sdFlash.setMinorTickSpacing(10);
        sdFlash.setPaintLabels(true);
        sdFlash.setSnapToTicks(true);
        sdFlash.setValue(30);
        jPanel4.add(sdFlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 250, 50));

        buttonGroup1.add(rdoSortAZ);
        rdoSortAZ.setSelected(true);
        rdoSortAZ.setText("Sắp xếp tăng dần");
        rdoSortAZ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(rdoSortAZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, -1));

        buttonGroup1.add(rdoSortZA);
        rdoSortZA.setText("Sắp xếp giảm dần");
        jPanel4.add(rdoSortZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1250, 310));

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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        doneSort();
        sorting();
        //xóa hết các phần tử mảng
        visibleFalseMid();

        //xóa dữ liệu trong list
        arr.clear();

        //tắt nút sắp xếp
        btnSort.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    int start = 0, end = 0;

    public void createArray() {
        //xóa hết các phần tử mảng
        visibleFalseMid();

        //dựa vào số phần tử để khởi tạo mảng
        int theNum = (int) snTheNum.getValue();
        this.length = theNum;

        switch (theNum) {
            case 3:
                visibleTrueButton(index4, index5, index6);
                this.start = 4;
                this.end = 6;
                break;
            case 4:
                visibleTrueButton(index4, index5, index6, index7);
                this.start = 4;
                this.end = 7;
                break;
            case 5:
                visibleTrueButton(index3, index4, index5, index6, index7);
                this.start = 3;
                this.end = 7;
                break;
            case 6:
                visibleTrueButton(index3, index4, index5, index6, index7, index8);
                this.start = 3;
                this.end = 8;
                break;
            case 7:
                visibleTrueButton(index2, index3, index4, index5, index6, index7, index8);
                this.start = 2;
                this.end = 8;
                break;
            case 8:
                visibleTrueButton(index2, index3, index4, index5, index6, index7, index8, index9);
                this.start = 2;
                this.end = 9;
                break;
            case 9:
                visibleTrueButton(index1, index2, index3, index4, index5, index6, index7, index8, index9);
                this.start = 1;
                this.end = 9;
                break;
            case 10:
                visibleTrueButton(index1, index2, index3, index4, index5, index6, index7, index8, index9, index10);
                this.start = 1;
                this.end = 10;
                break;
        }
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        doneSort();
        sorting();

        //tạo mảng với số phần tử được chọn
        createArray();

        //btn
        btnSort.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCreateRand.setEnabled(true);
        btnCreateFromFile.setEnabled(true);
        btnCreateFromKey.setEnabled(true);
        btnSort.setEnabled(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreateRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRandActionPerformed
        randArray();
        addValueArr();
        sorting();
        btnSort.setEnabled(true);
    }//GEN-LAST:event_btnCreateRandActionPerformed

    private void btnCreateFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFromFileActionPerformed
        try {
            new HuongDanDungFile(frame, true).setVisible(true);
            HuongDanDungFile fl = new HuongDanDungFile();
            String path = fl.chooserFile();
            snTheNum.setValue(fl.readLength(path));
            if (!fl.validate(path, (int) snTheNum.getValue())) {
                return;
            }

            this.arr.clear();
            this.arr.addAll(fl.readArr(path));
            //System.out.println(this.arr.toString());
            createArray();
            addValueArr();
            btnSort.setEnabled(true);
            btnDelete.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCreateFromFileActionPerformed

    public boolean valid() {
        this.arrBtn = new Button[]{index1, index2, index3, index4, index5, index6, index7, index8, index9, index10};
        int i = 0;
        for (Button btn : this.arrBtn) {
            if (btn.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập dữ liệu vào mảng!");
                return false;
            }
        }
        return true;
    }

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        if (btnSort.getText().equalsIgnoreCase("Sắp xếp")) {
            if (valid()) {
                startSort();
                for (int i = this.start - 1; i <= this.end - 1; i++) {
                    System.out.print(" " + arr.get(i));
                }
                System.out.println("");
                btnSort.setText("Dừng!");
                if (rdoInterchangeSort.isSelected()) {
                    interchangeSort(this.start, this.end);
                } else if (rdoBubbleSort.isSelected()) {
                    bubbleSort(this.start, this.end);
                } else if (rdoSelectionSort.isSelected()) {
                    selectionSort(this.start, this.end);
                } else if (rdoMergeSort.isSelected()) {
                    mergeSort(this.start, this.end);
                } else if (rdoShellSort.isSelected()) {

                } else if (rdoQuickSort.isSelected()) {

                    //qs(this.start - 1, this.end - 1);
                    quickSort();
                } else if (rdoInsertionSort.isSelected()) {

                }

            }

        } else {
            int stop = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn dừng lại?");
            if (stop == JOptionPane.YES_OPTION) {
                this.flag = false;
                btnSort.setText("Sắp xếp");
                btnCreate.setEnabled(true);
                btnCreateFromFile.setEnabled(true);
                btnCreateFromKey.setEnabled(true);
                btnCreateRand.setEnabled(true);
                btnDelete.setEnabled(true);
            }

        }


    }//GEN-LAST:event_btnSortActionPerformed

    public void printVaribaleNameBtn(Button btn) {
        System.out.println("BUTTON: " + btn.getName());
    }

    private void index12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_index12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_index12ActionPerformed

    private void index13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_index13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_index13ActionPerformed

    private void lblInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInforMouseClicked
        new Infor(this, true).setVisible(true);
    }//GEN-LAST:event_lblInforMouseClicked

    private void btnCreateFromKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFromKeyActionPerformed
        sorting();
        new InputForm(this, true, (int) snTheNum.getValue()).setVisible(true);
        btnSort.setEnabled(true);
    }//GEN-LAST:event_btnCreateFromKeyActionPerformed


    private void lblInforMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInforMouseEntered
        //initPopUp("Thông tin sản phẩm");
    }//GEN-LAST:event_lblInforMouseEntered

    private void btnCreateFromKeyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateFromKeyMouseEntered
        //initPopUp("Nhập vào các giá trị cho mảng");
    }//GEN-LAST:event_btnCreateFromKeyMouseEntered

    private void btnCreateFromFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateFromFileMouseEntered
        //initPopUp("Thêm các giá trị cho mảng bằng file có sẵng");
    }//GEN-LAST:event_btnCreateFromFileMouseEntered

    private void pnCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCodeMouseEntered
        //initPopUp("Khung mô tả thuật toán bằng code");
    }//GEN-LAST:event_pnCodeMouseEntered

    private void pnManHinhMoPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnManHinhMoPhongMouseEntered
        //initPopUp("Màn hình mô phỏng thuật toán");
    }//GEN-LAST:event_pnManHinhMoPhongMouseEntered

    private void index14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_index14ActionPerformed

    }//GEN-LAST:event_index14ActionPerformed

    private void rdoInterchangeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoInterchangeSortActionPerformed
        addInterchange();
    }//GEN-LAST:event_rdoInterchangeSortActionPerformed

    private void rdoSelectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSelectionSortActionPerformed
        addSelection();
    }//GEN-LAST:event_rdoSelectionSortActionPerformed

    private void rdoQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoQuickSortActionPerformed
        addQuick();
    }//GEN-LAST:event_rdoQuickSortActionPerformed

    private void rdoBubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBubbleSortActionPerformed
        addBubble();
    }//GEN-LAST:event_rdoBubbleSortActionPerformed

    private void rdoMergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMergeSortActionPerformed
        addMerge();
    }//GEN-LAST:event_rdoMergeSortActionPerformed

    private void rdoShellSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoShellSortActionPerformed

    }//GEN-LAST:event_rdoShellSortActionPerformed

    private void rdoInsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoInsertionSortActionPerformed

    }//GEN-LAST:event_rdoInsertionSortActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnCreate;
    private com.swing.Button btnCreateFromFile;
    private com.swing.Button btnCreateFromKey;
    private com.swing.Button btnCreateRand;
    private com.swing.Button btnDelete;
    private com.swing.Button btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.swing.Button index1;
    private com.swing.Button index10;
    private com.swing.Button index12;
    private com.swing.Button index13;
    private com.swing.Button index14;
    private com.swing.Button index2;
    private com.swing.Button index3;
    private com.swing.Button index4;
    private com.swing.Button index5;
    private com.swing.Button index6;
    private com.swing.Button index7;
    private com.swing.Button index8;
    private com.swing.Button index9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInfor;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JList<String> linkeListModel;
    private javax.swing.JPanel pnCode;
    private javax.swing.JPanel pnListlistAlgoritmi;
    private javax.swing.JPanel pnManHinhMoPhong;
    private com.swing.RadioButtonCustom rdoBubbleSort;
    private com.swing.RadioButtonCustom rdoInsertionSort;
    private com.swing.RadioButtonCustom rdoInterchangeSort;
    private com.swing.RadioButtonCustom rdoMergeSort;
    private com.swing.RadioButtonCustom rdoQuickSort;
    private com.swing.RadioButtonCustom rdoSelectionSort;
    private com.swing.RadioButtonCustom rdoShellSort;
    private com.swing.RadioButtonCustom rdoSortAZ;
    private com.swing.RadioButtonCustom rdoSortZA;
    private swing.slider.SliderGradient sdFlash;
    private javax.swing.JSpinner snTheNum;
    // End of variables declaration//GEN-END:variables
}
