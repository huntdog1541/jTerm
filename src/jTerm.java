import javax.swing.*;

public class jTerm {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Console con = new Console();
        frame.getContentPane().add(con);
        frame.pack();
        frame.setVisible (true);
        con.addText("Added here");
    }


}
