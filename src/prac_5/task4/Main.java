package prac_5.task4;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Main(){
        this.setSize(500, 500);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("1.jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        imageIcon = new ImageIcon(image);

        imgLabel = new JLabel("", imageIcon, SwingConstants.CENTER);


        getContentPane().add(imgLabel);

        Timer timer = new Timer(500, w -> nextImg());
        timer.start();
    }
    private void nextImg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource( (++imgNum) + ".jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        imageIcon = new ImageIcon(image);

        imgLabel.setIcon(imageIcon);
        if(imgNum == 3) imgNum = 0;

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setVisible(true);

    }
}
