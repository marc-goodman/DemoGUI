import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SYTC307u8365 on 10/10/2017.
 */
class FinalForm {
    private JButton startOverButton;
    private JPanel rootPanel;


    JPanel getRootPanel() {
        return rootPanel;
    }

    FinalForm() {
        startOverButton.addActionListener(actionEvent -> {
            Main.setEmail("");
            Main.setPassword("");
            Main.createGUI();
        });
    }
}
