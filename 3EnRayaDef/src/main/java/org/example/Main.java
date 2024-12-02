package org.example;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatMacDarkLaf());
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                Tablero t=new Tablero();
                VerificarGanador v=new VerificarGanador(t);
                Programa p=new Programa(t, v);
                t.setVisible(true);
            }
        });
    }
}