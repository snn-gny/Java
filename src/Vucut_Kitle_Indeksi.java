import java.util.Scanner;

public class Vucut_Kitle_Indeksi {
    public static void main(String[] args) {

        /*
        Formül : Kilo (kg) / Boy(m) * Boy(m)

Proje Konusu
Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Örnek Çıktı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
Bonus Geliştirme
Eğer Vücut Kitle İndeksi .

18.5'ten küçükse ekrana "Zayıf"
18.5 ile 24.9 arasında ise ekrana "İdeal"
25 ile 29.9 arasında ise ekrana "Şişman"
30 ile 34.9 arasında ise ekrana "Obez"
35'ten büyükse ise ekrana "Aşırı Obez" yazsın.



         */
        Scanner scan=new Scanner(System.in);

        double kilo, boy, vki;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=scan.nextDouble();

        vki= kilo / (boy*boy);

        System.out.print("Vücut Kitle İndeksiniz : "+vki);

        if (vki<18.5){
            System.out.println("\nSiz zayifsiniz.");
        }else if (vki>=18.5 && vki<=24.9 ){
            System.out.println("\nSiz Ideal kilodasiniz.");
        }else if (vki>=25 && vki<=29.9 ){
            System.out.println("\nSiz biraz fazla kilolusunuz.");
        }else if (vki>=30 && vki<=34.9 ){
            System.out.println("\nSiz Obezsiniz.");
        }else if (vki>=35 ) {
            System.out.println("\nSiz Asiri Obezsiniz.");
        }else {
            System.out.println("\nLütfen gecerli degerler giriniz.");
        }

    }

}
