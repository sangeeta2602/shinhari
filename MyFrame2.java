import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener {
    Button b1;

    MyFrame2() {
        b1 = new Button("Back");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (b1 == ae.getSource()) {
            this.dispose();
        }
    }
}
