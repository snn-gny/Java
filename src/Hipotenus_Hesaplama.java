import java.util.Scanner;

public class Hipotenus_Hesaplama {
    public static void main(String[] args) {
        /*
Proje Konusu
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.

Örnek Çıktı
1. Kenarı Giriniz : 3
2. Kenarı Giriniz : 4
Hipotenüs : 5
Bonus Geliştirme
Hipotenüs teoremi ile bulduğunuz 3. kenar uzunluğu ile birlikte üçgenin alanını hesaplayan programı yazınız.

Formüller ;

Üçgenin Çevresi = 2u
u = (a+b+c) / 2
Alan * Alan = u * (u - a) * (u - b) * (u - c)
Yardımcı Dersler

         */




        Scanner scanner=new Scanner(System.in);
        int BirincidikKenar, ikincidikKenar;
        System.out.print("1. Kenari Giriniz: ");
        BirincidikKenar= scanner.nextInt();

        System.out.print("\n2. Kenari Giriniz: ");
        ikincidikKenar= scanner.nextInt();

        double hipotenus=Math.sqrt((BirincidikKenar*BirincidikKenar)+(ikincidikKenar*ikincidikKenar));
        System.out.println("\nHipotenüs: "+hipotenus);

        double cevre= (BirincidikKenar+ikincidikKenar+hipotenus);
        double alan= (BirincidikKenar*ikincidikKenar)/2;

        System.out.println("\nÜcgenin cevresi: "+cevre);
        System.out.println("\nÜcgenin alani: "+alan);





    }
}
