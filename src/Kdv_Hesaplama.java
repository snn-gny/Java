import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

Örnek Çıktı
Tutar Giriniz : 100
KDV Oranı : %18
KDV Tutarı : 18.00
KDV'li Tutar : 118.0
Bonus Geliştirme
Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV hesaplayan programı yazınız.
         */
        Scanner scan=new Scanner(System.in);
        int tutar;
        System.out.print("Tutar giriniz: ");
        tutar=scan.nextInt();

        int Kdv_Orani= 18;

        double Kdv_tutari= (tutar*Kdv_Orani)/100;

        double Kdvli_tutar= tutar+Kdv_tutari;
/*
        System.out.print("Tutar Giriniz : "+tutar);
        System.out.print("\nKdv_Orani= %18");
        System.out.print ("\nKDV Tutari: "+Kdv_tutari);
        System.out.print("\nKDV'li Tutar: "+Kdvli_tutar);

*/


        if (tutar>0 && tutar<=500){
            Kdv_tutari= (tutar*18)/100;
            Kdvli_tutar= tutar+Kdv_tutari;
            System.out.println("\nKDV'li Tutar: "+Kdvli_tutar);

        } else if (tutar>500) {
            Kdv_tutari= (tutar*8)/100;
            Kdvli_tutar= tutar+Kdv_tutari;
            System.out.println("\nKDV'li Tutar: "+Kdvli_tutar);

        }

    }
}
