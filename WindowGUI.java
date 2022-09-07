package OO3.src.Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowGUI extends JFrame implements WindowListener, ActionListener {

    private JTextField text = new JTextField(20);
    private JButton button;
    private JButton button2;
    private JButton button3;
    private String buttonName = "It's a bird!";
    private String button2Name = "No, a plane!";
    private String button3Name = "It's a man...";
    private String initMessage = "Click a button, please!";
    private String message = "Bird!";
    private String message2 = "Plane!";
    private String message3 = "Insane!";
    private static String windowName = "Bad Craziness";

    public WindowGUI(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        this.addWindowListener(this);

        text.setText(initMessage);
        this.add(text);

        button = new JButton(buttonName);
        this.add(button);
        button.addActionListener(this);

        button2 = new JButton(button2Name);
        this.add(button2);
        button2.addActionListener(this);

        button3 = new JButton(button3Name);
        this.add(button3);
        button3.addActionListener(this);
    }

    public static void main(String[] args) {
        WindowGUI window = new WindowGUI(windowName);
        window.setSize(320, 100);
        window.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(buttonName)) {
            text.setText(message);
        }

        if (e.getActionCommand().equalsIgnoreCase(button2Name)) {
            text.setText(message2);
        }

        if (e.getActionCommand().equalsIgnoreCase(button3Name)) {
            text.setText(message3);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
