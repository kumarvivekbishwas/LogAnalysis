/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.android.log;

import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.TextArea;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author c_vivk
 */


public class MyFrame extends JFrame  {
    private JPanel jpenel1;
    private JPanel jpenel2;
    private TextArea textArea1;
    private TextArea textArea2;
    private TextArea textArea3;
    private TextArea textArea4;
    private TextArea textArea5;
    private TextArea textArea6;
    public MyFrame(String str) {
    super("Example");   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
       // setLayout(new BorderLayout());
        
       // jpenel1 = new JPanel(new BorderLayout());
        //jpenel2 = new JPanel(new BorderLayout());
        jpenel1 = new JPanel();
        //jpenel1.setBounds(20,20,200,300);
        
        jpenel1.setLayout(new BoxLayout(jpenel1, BoxLayout.Y_AXIS));
        
        textArea1 = new TextArea(str);
        textArea2 = new TextArea(str);
        textArea3 = new TextArea(str);
        textArea4 = new TextArea(str);
        textArea5 = new TextArea(str);
        textArea6 = new TextArea(str);
        
        jpenel1.add(textArea1);
        jpenel1.add(textArea2);
        jpenel1.add(textArea3);
        jpenel1.add(textArea4);
        jpenel1.add(textArea5);
        jpenel1.add(textArea6);
        
        add(jpenel1);
       // add(jpenel2);
        setVisible(true);
    }

  
}