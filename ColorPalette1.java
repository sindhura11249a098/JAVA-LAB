 import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorPalette1 extends Applet
        implements ActionListener {

    Button red, green, blue, yellow;

    public void init() {
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        yellow = new Button("Yellow");

        add(red);
        add(green);
        add(blue);
        add(yellow);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red)
            setBackground(Color.RED);
        else if (e.getSource() == green)
            setBackground(Color.GREEN);
        else if (e.getSource() == blue)
            setBackground(Color.BLUE);
        else if (e.getSource() == yellow)
            setBackground(Color.YELLOW);
    }
}
