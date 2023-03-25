import java.util.Scanner;

public class Manav_Sepet_Tutari {
    public static void main(String[] args) {
        /*

        Proje Konusu
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Ürün Kg Fiyatları

Salatalık : 3,14 TL
Elma : 4,11 TL
Kabak : 2,22 TL
Domates: 0,95 TL
Patlıcan : 7,00 TL

Örnek Çıktı
Salatalık Kaç Kilo ? :0
Elma Kaç Kilo ? :0
Kabak Kaç Kilo ? :0
Domates Kaç Kilo ? :1
Patlıcan Kaç Kilo ? :1
Toplam Tutar : 7,95 TL

         */

        Scanner scanner=new Scanner(System.in);

        double Salatalık = 3.14 ;
        double Elma = 4.11;
        double Kabak = 2.22;
        double Domates= 0.95;
        double Patlıcan = 7.00;
        double Tutar;


        double Salatalık_Kg ;
        double Elma_Kg;
        double Kabak_Kg;
        double Domates_Kg;
        double Patlıcan_Kg;

        System.out.print("Salatalık Kaç Kilo ?: ");
        Salatalık_Kg= scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        Elma_Kg= scanner.nextDouble();

        System.out.print("Kabak Kaç Kilo ? : ");
        Kabak_Kg= scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        Domates_Kg= scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Patlıcan_Kg= scanner.nextDouble();

        Tutar=((Salatalık_Kg*Salatalık)+(Elma_Kg*Elma)+(Kabak_Kg*Kabak)
                +(Domates_Kg*Domates)+(Patlıcan*Patlıcan_Kg));
        System.out.print("Toplam Tutar : "+Tutar+"TL");








    }
}
