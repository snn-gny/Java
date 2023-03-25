import java.util.Scanner;
import java.util.*;

public class Kullanici_Adi_Sifre {

    public static void main(String[] args) {

        String Kullanici_Adi, Parola;
        int yanlisGirisSayisi = 0;
        boolean girisBasarili = false;

        Scanner scan = new Scanner(System.in);

        while (yanlisGirisSayisi < 3 && !girisBasarili) {
            System.out.println("Lütfen Kullanici adini giriniz: ");
            Kullanici_Adi = scan.nextLine();
            System.out.println("Lütfen Parolanizi giriniz: ");
            Parola = scan.nextLine();

            if (Kullanici_Adi.equals("Ali") && Parola.equals("1234")) {
                System.out.println("Kullanici adiniz ve parolaniz dogru, islemlerinize devam edin");
                girisBasarili = true;
            } else {
                yanlisGirisSayisi++;
                if (yanlisGirisSayisi < 3) {
                    System.out.println("Yanlis kullanici adi veya parola girdiniz, tekrar deneyiniz.");
                } else {
                    System.out.println("3 defa yanlis giris yaptiniz. 1 saat sonra tekrar deneyin.");
                }
            }
        }
    }
}
