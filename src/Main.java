import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Created by Marc Goodman on 10/5/2017.
 *
 * This is the root class that controls all the separate GUIs.
 */

// My Main class
class Main {
    private static JFrame mFrame = null;
    private static String mEmail = "";
    private static String mPassword = "";

    static void createGUI() {
        mFrame = new JFrame();
        mFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        showLogin();
    }

    private static void showPanel(JPanel panel) {
        mFrame.getContentPane().removeAll();
        mFrame.getContentPane().add(panel);
        mFrame.pack();
        mFrame.setLocationRelativeTo(null);
        mFrame.setVisible(true);
    }

    static void showLogin() {
        showPanel(new LoginForm(mEmail, mPassword).getRootPanel());
    }

    static void showRegister() {
        showPanel(new RegisterForm(mEmail, mPassword).getRootPanel());
    }

    private static void showFinal() {
        showPanel(new FinalForm().getRootPanel());
    }

    static void setEmail(String email) {
        mEmail = email;
    }

    static void setPassword(String password) {
        mPassword = password;
    }

    static void login() {
        showFinal();
    }

    public static void main(String[] args) {
        invokeLater(Main::createGUI);
    }
}
