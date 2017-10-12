import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SYTC307u8365 on 10/5/2017.
 */
class LoginForm {
    private JPanel rootPanel;
    private JTextField emailTextField;
    private JButton newAccountButton;
    private JButton loginButton;
    private JTextField passwordTextField;

    LoginForm(String email, String password) {
        emailTextField.setText(email);
        passwordTextField.setText(password);

        loginButton.addActionListener(actionEvent -> {
            // some logic to verify that the user is the legitimate user.
            Main.setEmail(emailTextField.getText());
            Main.setPassword(passwordTextField.getText());
            Main.login();
        });
        newAccountButton.addActionListener(actionEvent -> {
            Main.setEmail(emailTextField.getText());
            Main.setPassword(passwordTextField.getText());
            Main.showRegister();
        });
    }

    JPanel getRootPanel() {
        return rootPanel;
    }
}
