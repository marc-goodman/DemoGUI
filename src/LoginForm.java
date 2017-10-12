import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SYTC307u8365 on 10/5/2017.
 */
public class LoginForm {
    JPanel rootPanel;
    JTextField emailTextField;
    JButton newAccountButton;
    JButton loginButton;
    JTextField passwordTextField;

    public LoginForm(String email, String password) {
        emailTextField.setText(email);
        passwordTextField.setText(password);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // some logic to verify that the user is the legitimate user.
                Main.setEmail(emailTextField.getText());
                Main.setPassword(passwordTextField.getText());
                Main.login();
            }
        });
        newAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.setEmail(emailTextField.getText());
                Main.setPassword(passwordTextField.getText());
                Main.showRegister();
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
