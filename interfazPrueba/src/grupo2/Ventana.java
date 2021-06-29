package grupo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public  class Ventana extends JFrame {

    JPanel panel = new JPanel();
    JButton boton1 = new JButton("Cerrar1");
    JButton boton2 = new JButton("Cerrar2");
    JButton boton3 = new JButton("Cerrar3");
    public static String var1;

    public void ventana(){
        setTitle("prueba");
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        Panel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void Panel(){
        this.getContentPane().add(panel);
        panel.setBackground(Color.yellow);
        panel.setLayout(null);
        boton1();
        boton2();
        boton3();

    }
    public void boton1(){
        boton1.setBounds(50, 500, 200, 30);
        panel.add(boton1);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               var1="personaje1";
            }
        };
        boton1.addActionListener(accion);
    }

    public void boton2(){
        boton2.setBounds(300, 500, 200, 30);
        panel.add(boton2);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var1="personaje2";
            }
        };
        boton2.addActionListener(accion);
    }

    public void boton3(){
        boton3.setBounds(550, 500, 200, 30);
        panel.add(boton3);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var1="personaje3";
            }
        };
        boton3.addActionListener(accion);
    }

}