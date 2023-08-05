package org.Calc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;
public class Calc extends JFrame implements ActionListener{

    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0,
             opSum, opRest, opMul, opDiv, igual, point, clear;

    private int acumulation = 0, result = 0;
    private JLabel screen;

    public Calc(){
        Font font = new Font("Serif", 1, 24);
        Font fontNum = new Font("Serif", 1, 16);
        UIManager.put("Button.font", fontNum);
        UIManager.put("Label.font", font);

        setLayout(null);
        screen = new JLabel("");
        screen.setBounds(30, 30, 260, 50);
        screen.setBackground(Color.BLACK);
        screen.setForeground(Color.WHITE);
        screen.setOpaque(true);
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        screen.setBorder(new EmptyBorder(0, 0, 0, 20));
        add(screen);

        num1 = new JButton("1");
        num1.setBounds(30, 100, 50, 50);
        num1.setBackground(new Color(0, 0,  0));
        num1.setForeground(new Color(255, 255, 255));
        add(num1);
        num1.addActionListener(this);

        num2 = new JButton("2");
        num2.setBounds(100, 100, 50, 50);
        num2.setBackground(new Color(0, 0,  0));
        num2.setForeground(new Color(255, 255, 255));
        add(num2);
        num2.addActionListener(this);

        num3 = new JButton("3");
        num3.setBounds(170, 100, 50, 50);
        num3.setBackground(new Color(0, 0,  0));
        num3.setForeground(new Color(255, 255, 255));
        add(num3);
        num3.addActionListener(this);

        num4 = new JButton("4");
        num4.setBounds(30, 170, 50, 50);
        num4.setBackground(new Color(0, 0,  0));
        num4.setForeground(new Color(255, 255, 255));
        add(num4);
        num4.addActionListener(this);

        num5 = new JButton("5");
        num5.setBounds(100, 170, 50, 50);
        num5.setBackground(new Color(0, 0,  0));
        num5.setForeground(new Color(255, 255, 255));
        add(num5);
        num5.addActionListener(this);

        num6 = new JButton("6");
        num6.setBounds(170, 170, 50, 50);
        num6.setBackground(new Color(0, 0,  0));
        num6.setForeground(new Color(255, 255, 255));
        add(num6);
        num6.addActionListener(this);

        num7 = new JButton("7");
        num7.setBounds(30, 240, 50, 50);
        num7.setBackground(new Color(0, 0,  0));
        num7.setForeground(new Color(255, 255, 255));
        add(num7);
        num7.addActionListener(this);

        num8 = new JButton("8");
        num8.setBounds(100, 240, 50, 50);
        num8.setBackground(new Color(0, 0,  0));
        num8.setForeground(new Color(255, 255, 255));
        add(num8);
        num8.addActionListener(this);

        num9 = new JButton("9");
        num9.setBounds(170, 240, 50, 50);
        num9.setBackground(new Color(0, 0,  0));
        num9.setForeground(new Color(255, 255, 255));
        add(num9);
        num9.addActionListener(this);

        num0 = new JButton("0");
        num0.setBounds(30, 310, 50, 50);
        num0.setBackground(new Color(0, 0,  0));
        num0.setForeground(new Color(255, 255, 255));
        add(num0);
        num0.addActionListener(this);

// ---------------------- OPERATORS ---------------------------------------------
        opSum = new JButton("+");
        opSum.setBounds(240, 100, 50, 50);
        opSum.setBackground(new Color(0, 0,  0));
        opSum.setForeground(new Color(255, 255, 255));
        add(opSum);
        opSum.addActionListener(this);

        opRest = new JButton("-");
        opRest.setBounds(240, 170, 50, 50);
        opRest.setBackground(new Color(0, 0,  0));
        opRest.setForeground(new Color(255, 255, 255));
        add(opRest);
        opRest.addActionListener(this);

        opMul = new JButton("*");
        opMul.setBounds(240, 240, 50, 50);
        opMul.setBackground(new Color(0, 0,  0));
        opMul.setForeground(new Color(255, 255, 255));
        add(opMul);
        opMul.addActionListener(this);

        opDiv = new JButton("/");
        opDiv.setBounds(240, 310, 50, 50);
        opDiv.setBackground(new Color(0, 0,  0));
        opDiv.setForeground(new Color(255, 255, 255));
        add(opDiv);
        opDiv.addActionListener(this);

        igual = new JButton("=");
        igual.setBounds(100, 310, 50, 50);
        igual.setBackground(new Color(0, 0,  0));
        igual.setForeground(new Color(255, 255, 255));
        add(igual);
        igual.addActionListener(this);

        clear = new JButton("C");
        clear.setBounds(170, 310, 50, 50);
        clear.setBackground(new Color(0, 0,  0));
        clear.setForeground(new Color(255, 255, 255));
        add(clear);
        clear.addActionListener(this);
    }

    private String currentOperation = "";
    private int firstSum = 0;

    public void actionPerformed(ActionEvent event){
        String currentText = screen.getText();
        Object e = event.getSource(); // getSource return the entire component

        if (e == clear){
            currentOperation = "";
            firstSum = 0;
            currentText = "";
            screen.setText("");
        }
        if (e == num1 || e == num2 || e == num3 || e == num4 || e == num5 ||
        e == num6 || e == num7 || e == num8 || e == num9 || e == num0){
            if (currentOperation.isEmpty()){
                screen.setText(currentText + event.getActionCommand());
            } else { // getActionCommand return the text into
                screen.setText(currentText + event.getActionCommand());
            }
        }
        if (e == opSum){
            currentOperation = "+";
            firstSum = Integer.parseInt(currentText);
            screen.setText("");
        } else if (e == opRest){
            currentOperation = "-";
            firstSum = Integer.parseInt(currentText);
            screen.setText("");
        } else if (e == opMul){
            currentOperation = "*";
            firstSum = Integer.parseInt(currentText);
            screen.setText("");
        } else if (e == opDiv){
            currentOperation = "/";
            firstSum = Integer.parseInt(currentText);
            screen.setText("");
        }
        if (e == igual){
            int secondSum = Integer.parseInt(currentText);
            switch (currentOperation) {
                case "+" -> {
                    int resultSum = firstSum + secondSum;
                    screen.setText(String.valueOf(resultSum));
                }
                case "-" -> {
                    int resultSum = firstSum - secondSum;
                    screen.setText(String.valueOf(resultSum));
                }
                case "*" -> {
                    int resultSum = firstSum * secondSum;
                    screen.setText(String.valueOf(resultSum));
                }
                case "/" -> {
                    int resultSum = firstSum / secondSum;
                    screen.setText(String.valueOf(resultSum));
                }
            }
            currentOperation = "";
        }
    }

    public static void main(String[] args){
        Calc calc = new Calc();
        calc.setBounds(0, 0, 330, 450);
        calc.setVisible(true);
        calc.setResizable(false);
        calc.setLocationRelativeTo(null);
    }

}