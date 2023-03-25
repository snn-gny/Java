import java.util.Scanner;

public class Kuvvet_Bulan_Program {
    public static void main(String[] args) {
        /*
        Proje Konusu
Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı
n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.

Örnek Çıktı
N Değerini Giriniz : 2
Sınır Değerini Giriniz : 20
1
2
4
8
16
         */
        Scanner input=new Scanner(System.in);
        int n;
        int K;
        System.out.println("N Değerini Giriniz : " );
        n= input.nextInt();

        System.out.println("Sınır Değerini Giriniz : ");
        K= input.nextInt();

        for (int i=1; i<=K ;i*=n){
            System.out.println(i);
        }




    }
}
