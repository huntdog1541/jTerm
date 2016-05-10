//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Console extends JPanel {
    private JTextArea textArea;
    private JTextField jcomp2;
    private JButton submitButton;
    private JList CommandList;

    public Console() {
        //construct preComponents
        Command_List cmd = new Command_List();
        String[] CommandListItems = cmd.getList();

        //construct components
        textArea = new JTextArea (5, 5);
        jcomp2 = new JTextField (5);
        submitButton = new JButton ("Submit");
        CommandList = new JList (CommandListItems);

        //set components properties
        CommandList.setToolTipText ("List of Commands");

        //adjust size and set layout
        setPreferredSize (new Dimension (784, 454));
        setLayout (null);

        //add components
        add (textArea);
        add (jcomp2);
        add (submitButton);
        add (CommandList);

        //set component bounds (only needed by Absolute Positioning)
        textArea.setBounds (10, 5, 490, 370);
        jcomp2.setBounds (10, 390, 490, 25);
        submitButton.setBounds (510, 390, 100, 25);
        CommandList.setBounds (510, 5, 265, 200);
    }

    public void addText(String str)
    {
        textArea.append(str);
    }

}