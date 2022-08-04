package obiektowe.zajecia.functional.programing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My App :D");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocation(960, 540);

        JButton button = new JButton("Nacisnij");
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(button);
        frame.add(panel);

        JTextField numberField = new JTextField("0", 10);
        panel.add(numberField);

        frame.pack();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click");
                int number = Integer.parseInt(numberField.getText());
                number++;
                numberField.setText(number + "");
            }
        };
        button.addActionListener(actionListener);
    }
}
