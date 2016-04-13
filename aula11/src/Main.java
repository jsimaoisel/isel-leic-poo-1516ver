import javax.swing.*;
import java.awt.*;

/**
 * Created by jsimao on 12-04-2016.
 */

class JFrameView implements IView {

    private final JFrame frame;
    private final TextField txtField;

    public JFrameView() {
        frame = new JFrame("POO JFrame View");
        frame.add(txtField = new TextField());
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void valueChanged(int value) {
        txtField.setText(""+value);
    }
}

class PrintlineView implements IView {
    public void valueChanged(int value) {
        System.out.println("* " + value + " *");
    }
}

public class Main {

    public static void main(String[] args) {
        ConsoleControl control = new ConsoleControl();
        //control.run(new PrintlineView());
        control.run(new JFrameView());
    }
}
