package Lab4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Gui3 extends JFrame
{
    JTextArea textArea = new JTextArea(12,20);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    Font fnt = new Font("Algerian",Font.ITALIC,30);
    public Gui3()
    { super("Panel");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(textArea);
        textArea.setForeground(Color.magenta);
        textArea.setFont(fnt);
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)

            {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                textArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new Gui3().setVisible(true);

    }
}