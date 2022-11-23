import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, ask, newPassword;

        Scanner veri = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        userName = veri.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = veri.nextLine();

        if (userName.equals("psyfurkan") && password.equals("f2r0k0n3")) {
            System.out.println("Başarıyla giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz sistemle uyuşmuyor. Şifrenizi sıfırlamak ister misiniz? y/n");
            ask = veri.nextLine();
            if (ask.equals("y")) {
                System.out.println("Lütfen yeni şifrenizi giriniz");
                newPassword = veri.nextLine();
                if (newPassword.equals("f2r0k0n3")) {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.");
                } else {
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu.");
                }
            } else {
                System.out.println("Banane girme o zaman");
            }
        }
    }
}