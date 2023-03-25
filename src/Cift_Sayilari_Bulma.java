import java.util.Scanner;

public class Cift_Sayilari_Bulma {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.

Bonus Geliştirme
Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların
 ortalamasını hesaplayan programı yazınız.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = input.nextInt();

        //System.out.println("Çift sayılar: ");

        int i = 0;
        while (i <= sayi) {

                System.out.println(i);
                i+=2;

            }



        /*
        for (int i = 0; i <= sayi; i += 2) {
            System.out.print(i + " ");  */


        /*
        if (a%2==0){
            System.out.println(a+" cift sayidir");
        }else if (b%2==0) {
            System.out.println(b + " cift sayidir");
        }else if (c%2==0) {
            System.out.println(c + " cift sayidir");
        }else if (d%2==0) {
            System.out.println(d + " cift sayidir");
        }else if (e%2==0) {
            System.out.println(e + " cift sayidir");
        }else{
            System.out.println("Girdiginiz sayi tek sayidir");
        }

         */


        }
    }


