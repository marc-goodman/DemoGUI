import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * Created by Marc Goodman on 10/5/2017.
 *
 * This is the root class that controls all the separate GUIs.
 */

// My Main class
public class Main {
    private static JFrame mFrame = null;
    private static String mEmail = "";
    private static String mPassword = "";

    public static void createGUI() {
        mFrame = new JFrame();
        mFrame.setDefaultCloseOperation(mFrame.EXIT_ON_CLOSE);
        showLogin();
    }

    public static void showLogin() {
        mFrame.getContentPane().removeAll();
        mFrame.getContentPane().add(new LoginForm(mEmail, mPassword).getRootPanel());
        mFrame.pack();
        mFrame.setLocationRelativeTo(null);
        mFrame.setVisible(true);
    }

    public static void showRegister() {
        mFrame.getContentPane().removeAll();
        mFrame.getContentPane().add(new RegisterForm(mEmail, mPassword).getRootPanel());
        mFrame.pack();
        mFrame.setLocationRelativeTo(null);
        mFrame.setVisible(true);
    }

    public static void showUserTakingTest() {
        mFrame.getContentPane().removeAll();
        mFrame.getContentPane().add(new FinalForm().getRootPanel());
        mFrame.pack();
        mFrame.setLocationRelativeTo(null);
        mFrame.setVisible(true);
    }

    public static void setEmail(String email) {
        mEmail = email;
    }

    public static void setPassword(String password) {
        mPassword = password;
    }

    public static void login() {
        showUserTakingTest();
    }

    public static void main(String[] args) {
        invokeLater(new Runnable() {
           public void run() {
               createGUI();
           }
        });
    }
}
