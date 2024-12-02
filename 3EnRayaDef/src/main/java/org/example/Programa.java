package org.example;


import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Programa {
    Tablero t;
    VerificarGanador v;
    private boolean juegoTerminado;
    private boolean empate;
    private boolean oscuro;
    private boolean claro;

    public Programa(Tablero t, VerificarGanador v){
        this.t=t;
        this.v=v;
        this.juegoTerminado=false;
        this.empate=false;
        this.oscuro=true;
        this.claro=false;
        acciones();
    }
    public void acciones(){
        t.getBtn1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla1();
                    setGanador();
                }
            }
        });
        t.getBtn2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla2();
                    setGanador();
                }
            }
        });
        t.getBtn3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla3();
                    setGanador();
                }
            }
        });
        t.getBtn4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla4();
                    setGanador();
                }
            }
        });
        t.getBtn5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla5();
                    setGanador();
                }
            }
        });
        t.getBtn6().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla6();
                    setGanador();
                }
            }
        });
        t.getBtn7().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla7();
                    setGanador();
                }
            }
        });
        t.getBtn8().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla8();
                    setGanador();
                }
            }
        });
        t.getBtn9().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(juegoTerminado){
                    JOptionPane.showMessageDialog(t.getPanel1(), "Primero dale al boton de reiniciar.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    setCasilla9();
                    setGanador();
                }
            }
        });
        t.getCh().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(t.getCh().isSelected()){
                    t.getCh2().setSelected(false);
                }
            }
        });
        t.getCh2().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(t.getCh2().isSelected()){
                    t.getCh().setSelected(false);
                }
            }
        });
        t.getBtnReiniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarTablero();
            }
        });
        t.getBtnTema().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ajustarTema();
                } catch (UnsupportedLookAndFeelException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void setCasilla1(){
        if(t.getCh().isSelected()){
            t.getLblx1().setVisible(true);
            t.getLblo1().setVisible(false);
            t.getBtn1().setEnabled(false);
        }

        if(t.getCh2().isSelected()){
            t.getLblo1().setVisible(true);
            t.getLblx1().setVisible(false);
            t.getBtn1().setEnabled(false);
        }
    }
    public void setCasilla2(){
        if(t.getCh().isSelected()){
            t.getLblx2().setVisible(true);
            t.getLblo2().setVisible(false);
            t.getBtn2().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo2().setVisible(true);
            t.getLblx2().setVisible(false);
            t.getBtn2().setEnabled(false);
        }
    }
    public void setCasilla3(){
        if(t.getCh().isSelected()){
            t.getLblx3().setVisible(true);
            t.getLblo3().setVisible(false);
            t.getBtn3().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo3().setVisible(true);
            t.getLblx3().setVisible(false);
            t.getBtn3().setEnabled(false);
        }
    }
    public void setCasilla4() {
        if(t.getCh().isSelected()){
            t.getLblx4().setVisible(true);
            t.getLblo4().setVisible(false);
            t.getBtn4().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo4().setVisible(true);
            t.getLblx4().setVisible(false);
            t.getBtn4().setEnabled(false);
        }
    }
    public void setCasilla5(){
        if(t.getCh().isSelected()){
            t.getLblx5().setVisible(true);
            t.getLblo5().setVisible(false);
            t.getBtn5().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo5().setVisible(true);
            t.getLblx5().setVisible(false);
            t.getBtn5().setEnabled(false);
        }
    }
    public void setCasilla6(){
        if(t.getCh().isSelected()){
            t.getLblx6().setVisible(true);
            t.getLblo6().setVisible(false);
            t.getBtn6().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo6().setVisible(true);
            t.getLblx6().setVisible(false);
            t.getBtn6().setEnabled(false);
        }
    }
    public void setCasilla7(){
        if(t.getCh().isSelected()){
            t.getLblx7().setVisible(true);
            t.getLblo7().setVisible(false);
            t.getBtn7().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo7().setVisible(true);
            t.getLblx7().setVisible(false);
            t.getBtn7().setEnabled(false);
        }
    }
    public void setCasilla8(){
        if(t.getCh().isSelected()){
            t.getLblx8().setVisible(true);
            t.getLblo8().setVisible(false);
            t.getBtn8().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo8().setVisible(true);
            t.getLblx8().setVisible(false);
            t.getBtn8().setEnabled(false);
        }
    }
    public void setCasilla9(){
        if(t.getCh().isSelected()){
            t.getLblx9().setVisible(true);
            t.getLblo9().setVisible(false);
            t.getBtn9().setEnabled(false);
        }
        if(t.getCh2().isSelected()){
            t.getLblo9().setVisible(true);
            t.getLblx9().setVisible(false);
            t.getBtn9().setEnabled(false);
        }
    }
    public void setGanador(){
        boolean ganador1=false, ganador2=false;
        ganador1=v.ganador1();
        ganador2=v.ganador2();
        empate=v.empate(ganador1, ganador2);
        if(ganador1){
            JOptionPane.showMessageDialog(t.getPanel1(), "Gana el jugador 1", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
            juegoTerminado=true;
        }else if(ganador2){
            JOptionPane.showMessageDialog(t.getPanel1(), "Gana el jugador 2", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
            juegoTerminado=true;
        }else if(empate){
            JOptionPane.showMessageDialog(t.getPanel1(), "Empate", "EMPATE", JOptionPane.INFORMATION_MESSAGE);
            juegoTerminado=true;
        }
    }
    public void ajustarTema() throws UnsupportedLookAndFeelException {
        ImageIcon i=new ImageIcon("H:\\iconos\\luna.png");
        Image im=i.getImage();
        Image newIm=im.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(newIm);

        ImageIcon iB=new ImageIcon("H:\\iconos\\sol.png");
        Image imB=iB.getImage();
        Image newImB=imB.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        ImageIcon i2B=new ImageIcon(newImB);

        if(oscuro){
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            t.getPanelBtn().setBackground(Color.WHITE);
            t.getPanelBtn2().setBackground(Color.WHITE);
            t.getPanelBtn3().setBackground(Color.WHITE);
            t.getPanelBtn4().setBackground(Color.WHITE);
            t.getPanelBtn5().setBackground(Color.WHITE);
            t.getPanelBtn6().setBackground(Color.WHITE);
            t.getPanelBtn7().setBackground(Color.WHITE);
            t.getPanelBtn8().setBackground(Color.WHITE);
            t.getPanelBtn9().setBackground(Color.WHITE);
            t.getBtn1().setBackground(Color.WHITE);
            t.getBtn2().setBackground(Color.WHITE);
            t.getBtn3().setBackground(Color.WHITE);
            t.getBtn4().setBackground(Color.WHITE);
            t.getBtn5().setBackground(Color.WHITE);
            t.getBtn6().setBackground(Color.WHITE);
            t.getBtn7().setBackground(Color.WHITE);
            t.getBtn8().setBackground(Color.WHITE);
            t.getBtn9().setBackground(Color.WHITE);
            t.getBtnTema().setIcon(i2);
            oscuro=false;
            claro=true;
        }else if(claro){
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            t.getPanelBtn().setBackground(Color.DARK_GRAY);
            t.getPanelBtn2().setBackground(Color.DARK_GRAY);
            t.getPanelBtn3().setBackground(Color.DARK_GRAY);
            t.getPanelBtn4().setBackground(Color.DARK_GRAY);
            t.getPanelBtn5().setBackground(Color.DARK_GRAY);
            t.getPanelBtn6().setBackground(Color.DARK_GRAY);
            t.getPanelBtn7().setBackground(Color.DARK_GRAY);
            t.getPanelBtn8().setBackground(Color.DARK_GRAY);
            t.getPanelBtn9().setBackground(Color.DARK_GRAY);
            t.getBtn1().setBackground(Color.DARK_GRAY);
            t.getBtn2().setBackground(Color.DARK_GRAY);
            t.getBtn3().setBackground(Color.DARK_GRAY);
            t.getBtn4().setBackground(Color.DARK_GRAY);
            t.getBtn5().setBackground(Color.DARK_GRAY);
            t.getBtn6().setBackground(Color.DARK_GRAY);
            t.getBtn7().setBackground(Color.DARK_GRAY);
            t.getBtn8().setBackground(Color.DARK_GRAY);
            t.getBtn9().setBackground(Color.DARK_GRAY);
            t.getBtnTema().setIcon(i2B);
            oscuro=true;
            claro=false;
        }
        SwingUtilities.updateComponentTreeUI(t.getPanel1());
    }
    public void reiniciarTablero(){
        t.getLblx1().setVisible(false);
        t.getLblx2().setVisible(false);
        t.getLblx3().setVisible(false);
        t.getLblx4().setVisible(false);
        t.getLblx5().setVisible(false);
        t.getLblx6().setVisible(false);
        t.getLblx7().setVisible(false);
        t.getLblx8().setVisible(false);
        t.getLblx9().setVisible(false);

        t.getLblo1().setVisible(false);
        t.getLblo2().setVisible(false);
        t.getLblo3().setVisible(false);
        t.getLblo4().setVisible(false);
        t.getLblo5().setVisible(false);
        t.getLblo6().setVisible(false);
        t.getLblo7().setVisible(false);
        t.getLblo8().setVisible(false);
        t.getLblo9().setVisible(false);

        t.getBtn1().setEnabled(true);
        t.getBtn2().setEnabled(true);
        t.getBtn3().setEnabled(true);
        t.getBtn4().setEnabled(true);
        t.getBtn5().setEnabled(true);
        t.getBtn6().setEnabled(true);
        t.getBtn7().setEnabled(true);
        t.getBtn8().setEnabled(true);
        t.getBtn9().setEnabled(true);

        juegoTerminado=false;
        empate=false;
    }
}
