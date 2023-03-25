import java.util.Scanner;
public class Hesap_Makinesi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Proje Konusu
Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.

Bonus Geliştirme
Yaptığınız hesap makinesini eğer Switch-Case ile yaptıysanız If blokları ile , eğer If blokları ile yaptıysanız Switch-Case ile tekrar yapınız.
         */

        int sayi1, sayi2, secim,Sonuc=0;
        System.out.print("Lütfen ilk sayiyi giriniz: ");
        sayi1=scan.nextInt();

        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        sayi2=scan.nextInt();

        System.out.println("\nLütfen yapmak istediginiz islemi seciniz: ");
        System.out.println("1- Toplama \n2- Cikarma \n3- Carpma \n4- Bölme");
        System.out.println("Seciminiz: ");
        secim= scan.nextInt();
/*
        if (secim==1){
            System.out.println("Sonuc: "+ (sayi1+sayi2));
        }
        else if (secim==2){
            System.out.println("Sonuc: "+ (sayi1-sayi2));
        }else if (secim==3){
            System.out.println("Sonuc: "+ (sayi1*sayi2));
        }else if (secim==4){
            if(sayi2==0){
                System.out.println("Ikinci sayi 0'a esittir ve islem sonucu belirsizdir.");
            }
        }
            System.out.println("Sonuc: "+ (sayi1/sayi2));
        }
        else{
            System.out.println("Gecersiz bir sayi girdiniz, lütfen tekrar islem seciniz...");
        */
      //int Sonuc;
        switch (secim){
            case 1:
              Sonuc = sayi1+sayi2;
                break;
            case 2:
                Sonuc= sayi1-sayi2;
                break;
            case 3:
                Sonuc= sayi1*sayi2;
                break;
            case 4:

                if(sayi2==0){
                    System.out.println("Ikinci sayi 0'a esittir ve islem sonucu belirsizdir.");
                }
                Sonuc= sayi1/sayi2;
                break;
            default:
                System.out.println("Gecersiz bir sayi girdiniz, lütfen tekrar islem seciniz...");
                break;

        }
        System.out.println(Sonuc);
    }

}
