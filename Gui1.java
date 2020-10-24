package Lab4;

import java.awt.*;
import javax.swing.*;
public class Gui1 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Algerian",Font.ITALIC,30);
    Gui1()
    {
        super("Prodam garage");
        setLayout(new FlowLayout());
        setSize(300,400);
        add(jta);
        jta.setForeground(Color.magenta);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Gui1();
    }
}
