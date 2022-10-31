package com.example.weather;

import javax.swing.*;

public class WeatherGui extends JFrame{


    private JButton button1;
    private JTextField textField1;
    private JPanel rootPanel;

    public WeatherGui() {
        setContentPane(rootPanel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new WeatherGui();
    }
}
