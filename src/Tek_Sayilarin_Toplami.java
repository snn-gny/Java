import java.util.Scanner;

public class Tek_Sayilarin_Toplami {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini kabul eden
ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.

Örnek Çıktı
Sayı Giriniz : 2
Sayı Giriniz : 3
Sayı Giriniz : 7
Sayı Giriniz : -15
Toplam : 10
Bonus Geliştirme
Java ile girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input=new Scanner(System.in);

        int total=0;
        int number;

        //do while ile cözüm
        do {
            System.out.print("Lütfen sayi giriniz: ");
            number= input.nextInt();

            if (number%2==1){
                total +=number;
            }

        } while (number>0);
/*
*while ile cözüm
        while(true){
            System.out.print("Lütfen sayi giriniz: ");
            int number= input.nextInt();
            if (number<0){
                break;
            }
            if (number%2==1){
                total +=number;
            } */


        System.out.println(total);
    }
}
