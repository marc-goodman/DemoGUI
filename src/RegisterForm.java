import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SYTC307u8365 on 10/5/2017.
 */
class RegisterForm {
    private JPanel rootPanel;
    private JTextField emailTextField;
    private JButton loginExistingButton;
    private JButton registerButton;
    private JTextField passwordTextField;
    private JPasswordField passwordConfirmField;

    RegisterForm(String email, String password) {
        emailTextField.setText(email);
        passwordTextField.setText(password);

        registerButton.addActionListener(actionEvent -> {
            // some logic to verify that the user is the legitimate user.
            Main.setEmail(emailTextField.getText());
            Main.setPassword(passwordTextField.getText());
            Main.login();
        });
        loginExistingButton.addActionListener(actionEvent -> {
            Main.setEmail(emailTextField.getText());
            Main.setPassword(passwordTextField.getText());
            Main.showLogin();
        });
    }

    JPanel getRootPanel() {
        return rootPanel;
    }
}
