package main.java.graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 苏若墨
 */
public class Buttons {
    JFrame frame;
    JLabel label;
    boolean flag = false;
    int red = 0, green = 0, blue = 0;

    public static void main(String[] args) {
        Buttons tb = new Buttons();
        tb.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("I am waiting for you!");

        JButton labelButton = new JButton("Change a label");
        labelButton.addActionListener(new LabelListener());
        JButton circleButton = new JButton("Change a circle");
        circleButton.addActionListener(new CircleListener());

        flag = true;
        MyDrawPanel myPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.SOUTH, circleButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, myPanel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            label.setText("OhCh!");
        }
    }

    class CircleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            flag = true;
            frame.repaint();
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) { // this method is called every time the button is clicked
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (flag == true) {
                red = (int) (Math.random() * 255);
                green = (int) (Math.random() * 255);
                blue = (int) (Math.random() * 255);
                Color randomColor = new Color(red, green, blue);
                g.setColor(randomColor); // Set random color
                g.fillOval(70, 70, 100, 100); // Make a oval(circle)
                flag = false;
            } else {
                Color randomColor2 = new Color(red, green, blue);
                g.setColor(randomColor2); // Set random color
                g.fillOval(70, 70, 100, 100); // Make a oval(circle)
            }
        }
    }
}
