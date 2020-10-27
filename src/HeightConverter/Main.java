package HeightConverter;

import HeightConverter.UI.GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        JFrame frame = new JFrame(Strings.title);
        frame.setContentPane(gui.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTexts();
        frame.pack();
        frame.setVisible(true);
    }
}
