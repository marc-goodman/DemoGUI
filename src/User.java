public class User {
    private String mEmail;
    private String mPassword;
    private String mRole;

    public User(String email, String password, String role) {
        mEmail = email;
        mPassword = password;
        mRole = role;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getRole() {
        return mRole;
    }
}
