import java.util.Scanner;

public class Not_Ortalamasi {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Örnek Çıktı
Fizik Notunuz : 70
Matematik Notunuz : 40
Türkçe Notunuz : 30
Kimya Notunuz : 100
Müzik Notunuz : 60
Tarih Notunuz : 80
Ortalamanız : 63.0
Bonus Geliştirme
Bu programa geliştirme olarak If ve Else kullanmadan, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
         */

        Scanner scan=new Scanner(System.in);
        int Fizik,Matematik,Türkçe,Kimya,Müzik,Tarih;
        System.out.println("Lütfen notlarinizi giriniz:");

        System.out.print("Fizik Notunuz: ");
        Fizik=scan.nextInt();

        System.out.print("Matematik Notunuz :");
        Matematik=scan.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Türkçe=scan.nextInt();

        System.out.print("Kimya Notunuz :");
        Kimya=scan.nextInt();

        System.out.print("Müzik Notunuz :");
        Müzik=scan.nextInt();

        System.out.print("Tarih Notunuz : ");
        Tarih=scan.nextInt();


        double Ortalamaniz=((Fizik+Matematik+Türkçe+Kimya+Müzik+Tarih)/6) ;

        System.out.println("Fizik Notunuz: "+Fizik+
                "\nMatematik Notunuz: "+Matematik+
                "\nTürkçe Notunuz: "+Türkçe+
                "\nKimya Notunuz: "+Kimya+
                "\nMüzik Notunuz: "+Müzik+
                "\nTarihNotunuz: "+Tarih+
                "\nOrtalamaniz: "+Ortalamaniz);

        String sonuc = (Ortalamaniz >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldıniz";
        System.out.println(sonuc);



    }
}
