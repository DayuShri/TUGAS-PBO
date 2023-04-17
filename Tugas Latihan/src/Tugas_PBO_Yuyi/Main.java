package Tugas_PBO_Yuyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Tugas_PBO_Yuyi.Login user_login = new Tugas_PBO_Yuyi.Login();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Username dan Pass Untuk Login");
        System.out.print("Masukkan Username : ");
        String user = bf.readLine();
        System.out.print("Masukkan Password : ");
        String pw = bf.readLine();
        System.out.println("=============================");
        if (user.equals(user_login.getUser()) && pw.equals(user_login.getPass_user()) || user.equals(user_login.getAdmin()) && pw.equals(user_login.getPass_admin())) {
            if (user.equals(user_login.getUser())) {
                System.out.println("Selamat datang User");
            } else if (user.equals(user_login.getAdmin())) {
                System.out.println("Selamat datang Admin");
            }
        }

    }
}

