package com.bo.upb.algoritmica1.ui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MainForm
 *
 * @author Marcos Quispe
 * @since 1.0
 */
public class MainForm extends JFrame {
    private JTextField txtValues;
    private JButton btnInsertarHeap;
    private JPanel pnlArbol;
    private JButton btnEliminarHeap;
    private JPanel pnlMain;

    public MainForm() throws HeadlessException {
        this.setTitle("Árboles Max-Heap");
        this.setContentPane(pnlMain);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(700, 500);

        Font font1 = new Font("SansSerif", Font.PLAIN, 16); //Font.BOLD
        txtValues.setFont(font1);
        txtValues.setText("10,20,30,40,50,60,70,80,90,100");


//        String valor = JOptionPane.showInputDialog("Ingrese un valor");
//        System.out.println("valor ingresado: " + valor);
//        JOptionPane.showMessageDialog(this,"valor ingresado: " + valor);

        btnEliminarHeap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saludos StackOverflow!");
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.drawOval(0, 0, 100, 100);

        //super.paint(pnlArbol.getGraphics());
        Graphics2D g2d = (Graphics2D) pnlArbol.getGraphics();
        g2d.setStroke(new BasicStroke(2)); // ancho del borde

        g2d.setColor(Color.yellow);
        g2d.fillOval(0, 0, 50, 50); // rellenando circulo 1
        g2d.setPaint(Color.black); // color del borde
        g2d.drawOval(0, 0, 50, 50); // dibujando circulo 1
        //g2d.drawString("C1", 0, 0);
        g2d.drawString("C1", 0 + 18, 0 + 33);

        g2d.setColor(Color.cyan);
        g2d.fillOval(150, 150, 50, 50); // rellenando circulo 2
        g2d.setPaint(Color.blue); // color del borde
        g2d.drawOval(150, 150, 50, 50); // dibujando circulo 2
        //g2d.drawString("C2", 150, 150);
        g2d.drawString("C2", 150 + 18, 150 + 33);

        double hipotenusa = Math.sqrt(Math.pow(150d - 0d, 2d) + Math.pow(150 - 0, 2));
        double angulo = Math.toDegrees(Math.asin((double)(150 - 0) / hipotenusa));

        int hipotenusaCirculo = 50 / 2;
        int xDif = (int)(Math.sin(angulo) * hipotenusaCirculo);
        System.out.printf("hipotenusa: %s, angulo: %s, xDif: %s", hipotenusa, angulo, xDif);

        // dibujando recta
        g2d.setColor(Color.black);
//        g2d.drawLine(0 + 25, 0 + 25, 150 + 25, 150 + 25);
//        g2d.drawLine(0 + 25, 0 + 25, 150 + 25 - xDif + 2, 150 + 25 - xDif + 2);
        g2d.drawLine(0 + 25 + xDif - 2, 0 + 25 + xDif - 2, 150 + 25 - xDif + 2, 150 + 25 - xDif + 2);
    }

    public static void main(String[] args) {
        MainForm form = new MainForm();
    }

}
