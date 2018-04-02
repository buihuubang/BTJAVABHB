/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author bang
 */
public class Bai1 {

    /**
     */
    Label lblA,lblB,lblC;
    TextField txtA,txtB,txtC;
    Button btnTong,btnHieu,btnNhan,btnChia;
    
    public Bai1(){
        Frame fr = new Frame("Bai1");
        fr.setSize(170,350);
        fr.setTitle("Bai1");
        fr.setLayout(new FlowLayout());
        lblA = new Label("a");
        fr.add(lblA);
        txtA = new TextField(20);
        fr.add(txtA);
        lblB = new Label("b");
        fr.add(lblB);
        txtB = new TextField(20);
        fr.add(txtB);
        btnTong = new Button("+");
        btnTong.addActionListener(new ListenTong());
        fr.add(btnTong);
        btnHieu= new Button("-");
        btnHieu.addActionListener(new ListenHieu());
        fr.add(btnHieu);
        btnNhan= new Button("*");
        btnNhan.addActionListener(new ListenNhan());
        fr.add(btnNhan);
        btnChia= new Button("/");
        btnChia.addActionListener(new ListenChia());
        fr.add(btnChia);
        lblC = new Label("KET QUA");
        fr.add(lblC);
        txtC = new TextField(20);
        fr.add(txtC);
        XuLySuKienCuaSo boLangNge = new XuLySuKienCuaSo();
        fr.addWindowListener(boLangNge);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bai1 bai1 = new Bai1();
    }
    
    class ListenTong implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a + b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenHieu implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a - b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenNhan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a * b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenChia implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a / b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    static class XuLySuKienCuaSo implements WindowListener {
        

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   }
    
}
