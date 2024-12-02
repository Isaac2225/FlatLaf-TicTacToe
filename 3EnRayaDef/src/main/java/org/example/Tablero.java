package org.example;

import javax.swing.*;
import java.awt.*;

public class Tablero extends JFrame {
    private JPanel panel1, panelTab, panelBtn, panelBtn2, panelBtn3, panelBtn4, panelBtn5, panelBtn6, panelBtn7, panelBtn8, panelBtn9;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReiniciar, btnTema;
    private JCheckBox ch, ch2;
    private JLabel lblx1, lblx2, lblx3, lblx4, lblx5, lblx6, lblx7, lblx8, lblx9;
    private JLabel lblo1, lblo2, lblo3, lblo4, lblo5, lblo6, lblo7, lblo8, lblo9;

    public Tablero(){
        initComponentes();
        montarComponentes();
    }
    public void initComponentes(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(100, 100, 700, 700);
        setResizable(false);

        GridLayout grd=new GridLayout(3, 3);

        panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 700, 700);

        panelTab=new JPanel();
        panelTab.setBackground(Color.BLACK);
        panelTab.setBounds(93, 5, 500, 500);
        panelTab.setLayout(grd);

        ch=new JCheckBox("Jugador 1");
        ch.setBounds(300, 530, 100, 20);
        ch2=new JCheckBox("Jugador 2");
        ch2.setBounds(300, 560, 100, 20);

        btn1=new JButton();
        btn1.setBackground(Color.DARK_GRAY);
        btn2=new JButton();
        btn2.setBackground(Color.DARK_GRAY);
        btn3=new JButton();
        btn3.setBackground(Color.DARK_GRAY);
        btn4=new JButton();
        btn4.setBackground(Color.DARK_GRAY);
        btn5=new JButton();
        btn5.setBackground(Color.DARK_GRAY);
        btn6=new JButton();
        btn6.setBackground(Color.DARK_GRAY);
        btn7=new JButton();
        btn7.setBackground(Color.DARK_GRAY);
        btn8=new JButton();
        btn8.setBackground(Color.DARK_GRAY);
        btn9=new JButton();
        btn9.setBackground(Color.DARK_GRAY);

        panelBtn=new JPanel();
        panelBtn.setBackground(Color.DARK_GRAY);
        panelBtn.setLayout(null);
        panelBtn2=new JPanel();
        panelBtn2.setBackground(Color.DARK_GRAY);
        panelBtn2.setLayout(null);
        panelBtn3=new JPanel();
        panelBtn3.setBackground(Color.DARK_GRAY);
        panelBtn3.setLayout(null);
        panelBtn4=new JPanel();
        panelBtn4.setBackground(Color.DARK_GRAY);
        panelBtn4.setLayout(null);
        panelBtn5=new JPanel();
        panelBtn5.setBackground(Color.DARK_GRAY);
        panelBtn5.setLayout(null);
        panelBtn6=new JPanel();
        panelBtn6.setBackground(Color.DARK_GRAY);
        panelBtn6.setLayout(null);
        panelBtn7=new JPanel();
        panelBtn7.setBackground(Color.DARK_GRAY);
        panelBtn7.setLayout(null);
        panelBtn8=new JPanel();
        panelBtn8.setBackground(Color.DARK_GRAY);
        panelBtn8.setLayout(null);
        panelBtn9=new JPanel();
        panelBtn9.setBackground(Color.DARK_GRAY);
        panelBtn9.setLayout(null);

        Font font=new Font("Arial", Font.BOLD, 30);
        lblx1=new JLabel("x");
        lblx1.setBounds(55, 60, 100, 20);
        lblx1.setFont(font);
        lblx1.setVisible(false);
        Font font2=new Font("Arial", Font.BOLD, 30);
        lblx2=new JLabel("x");
        lblx2.setBounds(55, 60, 100, 20);
        lblx2.setFont(font);
        lblx2.setVisible(false);
        Font font3=new Font("Arial", Font.BOLD, 30);
        lblx3=new JLabel("x");
        lblx3.setBounds(55, 60, 100, 20);
        lblx3.setFont(font);
        lblx3.setVisible(false);
        Font font4=new Font("Arial", Font.BOLD, 30);
        lblx4=new JLabel("x");
        lblx4.setBounds(55, 60, 100, 20);
        lblx4.setFont(font);
        lblx4.setVisible(false);
        Font font5=new Font("Arial", Font.BOLD, 30);
        lblx5=new JLabel("x");
        lblx5.setBounds(55, 60, 100, 20);
        lblx5.setFont(font);
        lblx5.setVisible(false);
        Font font6=new Font("Arial", Font.BOLD, 30);
        lblx6=new JLabel("x");
        lblx6.setBounds(55, 60, 100, 20);
        lblx6.setFont(font);
        lblx6.setVisible(false);
        Font font7=new Font("Arial", Font.BOLD, 30);
        lblx7=new JLabel("x");
        lblx7.setBounds(55, 60, 100, 20);
        lblx7.setFont(font);
        lblx7.setVisible(false);
        Font font8=new Font("Arial", Font.BOLD, 30);
        lblx8=new JLabel("x");
        lblx8.setBounds(55, 60, 100, 20);
        lblx8.setFont(font);
        lblx8.setVisible(false);
        Font font9=new Font("Arial", Font.BOLD, 30);
        lblx9=new JLabel("x");
        lblx9.setBounds(55, 60, 100, 20);
        lblx9.setFont(font);
        lblx9.setVisible(false);


        Font fontO=new Font("Arial", Font.BOLD, 30);
        lblo1=new JLabel("o");
        lblo1.setBounds(55, 60, 100, 20);
        lblo1.setFont(fontO);
        lblo1.setVisible(false);
        lblo2=new JLabel("o");
        lblo2.setBounds(55, 60, 100, 20);
        lblo2.setFont(fontO);
        lblo2.setVisible(false);
        lblo3=new JLabel("o");
        lblo3.setBounds(55, 60, 100, 20);
        lblo3.setFont(fontO);
        lblo3.setVisible(false);
        lblo4=new JLabel("o");
        lblo4.setBounds(55, 60, 100, 20);
        lblo4.setFont(fontO);
        lblo4.setVisible(false);
        lblo5=new JLabel("o");
        lblo5.setBounds(55, 60, 100, 20);
        lblo5.setFont(fontO);
        lblo5.setVisible(false);
        lblo6=new JLabel("o");
        lblo6.setBounds(55, 60, 100, 20);
        lblo6.setFont(fontO);
        lblo6.setVisible(false);
        lblo7=new JLabel("o");
        lblo7.setBounds(55, 60, 100, 20);
        lblo7.setFont(fontO);
        lblo7.setVisible(false);
        lblo8=new JLabel("o");
        lblo8.setBounds(55, 60, 100, 20);
        lblo8.setFont(fontO);
        lblo8.setVisible(false);
        lblo9=new JLabel("o");
        lblo9.setBounds(55, 60, 100, 20);
        lblo9.setFont(fontO);
        lblo9.setVisible(false);

        btnReiniciar=new JButton("REINICIAR");
        btnReiniciar.setBounds(295, 600, 100, 40);

        ImageIcon i=new ImageIcon("H:\\iconos\\sol.png");
        Image im=i.getImage();
        Image newIm=im.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(newIm);

        btnTema=new JButton();
        btnTema.setIcon(i2);
        btnTema.setBounds(600, 600, 50, 50);
    }

    public void montarComponentes(){
        panelBtn.add(lblx1);
        panelBtn2.add(lblx2);
        panelBtn3.add(lblx3);
        panelBtn4.add(lblx4);
        panelBtn5.add(lblx5);
        panelBtn6.add(lblx6);
        panelBtn7.add(lblx7);
        panelBtn8.add(lblx8);
        panelBtn9.add(lblx9);

        panelBtn.add(lblo1);
        panelBtn2.add(lblo2);
        panelBtn3.add(lblo3);
        panelBtn4.add(lblo4);
        panelBtn5.add(lblo5);
        panelBtn6.add(lblo6);
        panelBtn7.add(lblo7);
        panelBtn8.add(lblo8);
        panelBtn9.add(lblo9);

        btn1.add(panelBtn);
        btn2.add(panelBtn2);
        btn3.add(panelBtn3);
        btn4.add(panelBtn4);
        btn5.add(panelBtn5);
        btn6.add(panelBtn6);
        btn7.add(panelBtn7);
        btn8.add(panelBtn8);
        btn9.add(panelBtn9);

        panelTab.add(btn1);
        panelTab.add(btn2);
        panelTab.add(btn3);
        panelTab.add(btn4);
        panelTab.add(btn5);
        panelTab.add(btn6);
        panelTab.add(btn7);
        panelTab.add(btn8);
        panelTab.add(btn9);
        panel1.add(panelTab);
        panel1.add(ch);
        panel1.add(ch2);
        panel1.add(btnReiniciar);
        panel1.add(btnTema);
        add(panel1);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JLabel getLblo9() {
        return lblo9;
    }

    public JLabel getLblo8() {
        return lblo8;
    }

    public JLabel getLblo7() {
        return lblo7;
    }

    public JLabel getLblo6() {
        return lblo6;
    }

    public JLabel getLblo5() {
        return lblo5;
    }

    public JLabel getLblo3() {
        return lblo3;
    }

    public JLabel getLblo4() {
        return lblo4;
    }

    public JLabel getLblo2() {
        return lblo2;
    }

    public JLabel getLblo1() {
        return lblo1;
    }

    public JLabel getLblx9() {
        return lblx9;
    }

    public JLabel getLblx8() {
        return lblx8;
    }

    public JLabel getLblx7() {
        return lblx7;
    }

    public JLabel getLblx6() {
        return lblx6;
    }

    public JLabel getLblx5() {
        return lblx5;
    }

    public JLabel getLblx4() {
        return lblx4;
    }

    public JLabel getLblx3() {
        return lblx3;
    }

    public JLabel getLblx2() {
        return lblx2;
    }

    public JLabel getLblx1() {
        return lblx1;
    }

    public JCheckBox getCh2() {
        return ch2;
    }

    public JCheckBox getCh() {
        return ch;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtnReiniciar() {
        return btnReiniciar;
    }

    public JButton getBtnTema() {return btnTema;}

    public JPanel getPanelBtn() {
        return panelBtn;
    }

    public JPanel getPanelBtn2() {
        return panelBtn2;
    }

    public JPanel getPanelBtn3() {
        return panelBtn3;
    }

    public JPanel getPanelBtn4() {
        return panelBtn4;
    }

    public JPanel getPanelBtn5() {
        return panelBtn5;
    }

    public JPanel getPanelBtn6() {
        return panelBtn6;
    }

    public JPanel getPanelBtn7() {
        return panelBtn7;
    }

    public JPanel getPanelBtn8() {
        return panelBtn8;
    }

    public JPanel getPanelBtn9() {
        return panelBtn9;
    }
}
