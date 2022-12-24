package prac_5.task2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*
public class Figure_zad2 extends JFrame{
    public Figure_zad2()  {
        setSize(1050, 1050);
        JFrame myWindow = new JFrame("random figures");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("paint");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });
        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(240,240,240));
        graph.fillRect(0, 0, 1050, 1050);
        for (int i = 0; i < 20; i++) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            int[] arrayx = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            int[] arrayy = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            Polygon poly = new Polygon(arrayx, arrayy, 4);
            graph.drawPolygon(poly);
            graph.fillPolygon(poly);
        }

    }

*/
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Figure_zad2 extends JFrame{
    public Figure_zad2()  {
        setSize(1000, 500);
        JFrame myWindow = new JFrame("Painting rectangles");
        myWindow.setPreferredSize(new Dimension(200,100));
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JButton button = new JButton("Start painting");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });

        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(30, 30, 30));
        graph.fillRect(0, 0, 1000, 500);



        int border_space = 60;
        int x_space = 150;
        int y_space = 50;
        int near_border = 30;
        int far_border = near_border*2;
        int difference = far_border - near_border;
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 5; i++) {

                Color color = new Color(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)
                );
                int[] arrayx = {
                        (int) ((Math.random() * near_border) + border_space) + x_space * i, // top-left x
                        (int) ((Math.random() * near_border) + border_space) + x_space * i, // bottom-left x
                        (int) ((Math.random() * far_border) + difference + border_space) + x_space * i, // bottom-right x
                        (int) ((Math.random() * far_border) + difference + border_space) + x_space * i // top-right x
                };
                int[] arrayy = {
                        (int) ((Math.random() * near_border) + border_space) + y_space * k, // top-left y
                        (int) ((Math.random() * far_border) + difference + border_space) + y_space * k, // bottom-left y
                        (int) ((Math.random() * far_border) + difference + border_space) + y_space * k, // bottom-right y
                        (int) ((Math.random() * near_border) + border_space) + y_space * k // top-right y

                };

                g.setColor(color);
                Polygon poly = new Polygon(arrayx, arrayy, 4);
                graph.drawPolygon(poly);
                graph.fillPolygon(poly);

            }
        }

    }


    public static void main(String args[]) {
        Figure_zad2 app = new Figure_zad2();
    }

}

  /*  public static void main(String args[]) {
        Figure_zad2 app = new Figure_zad2();
    }*/
