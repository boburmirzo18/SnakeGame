package org.example;

import javax.swing.*;
import java.awt.*;

public class PasswordGenratorGUI extends JFrame {

    private PasswordGenrator passwordGenrator;

    public PasswordGenratorGUI(){
        super("Password Generator");

        setSize(540, 570);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        passwordGenrator=new PasswordGenrator();
        addGuiComponents();
    }

    private void addGuiComponents(){
        JLabel titleLabel= new JLabel("Password Generator");

        titleLabel.setFont(new Font("Dialog",Font.BOLD,32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0,10,540,39);

        add(titleLabel);

        JTextArea passwordOutput= new JTextArea();

        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog",Font.BOLD,32));

        JScrollPane passwordoutputPane=new JScrollPane(passwordOutput);
        passwordoutputPane.setBounds(25,97,479,70);

        passwordoutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordoutputPane);


        JLabel passwordLengthLabel= new JLabel("Password Length: ");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 32));
        passwordLengthLabel.setBounds(25,215,272,39);
        add(passwordLengthLabel);








    }

}
