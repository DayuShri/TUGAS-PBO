package Tugas_PBO_Yuyi;

public class Login {
    private String user;
    private String pass_user;
    private String admin;
    private String pass_admin;

    public Login() {
        this.user = "user";
        this.pass_user = "pass_user";
        this.admin = "admin";
        this.pass_admin = "pass_admin";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPass_admin() {
        return pass_admin;
    }

    public void setPass_admin(String pass_admin) {
        this.pass_admin = pass_admin;
    }
}
