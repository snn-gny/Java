import java.util.Scanner;

public class while_ {

    public static void main(String[] args) {

/*
        int i = 1;

        while (i <= 5) {
            System.out.print(i + ",");
            i++;
        }*/

        //do while döngüsü
        /*
        do {
            System.out.print(i + ",");
            i++;
        } while ( i <= 5);


        //Örnek 1: 1 den 100 e kadar cift sayilari yazdiran program
        int i=1;
        while(i<=100){
            if(i%2 == 0){
                System.out.println(i);
            }

            i++;
        }*/
        // Örnek 2: Negatif bir deger girilene kadar kullanicidan girisleri kabul eden
        // ve girilen degerlerden tek sayilari toplayan program
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int input;

        while(true){
            System.out.println("Lütfen bir sayi giriniz: ");
            input = scan.nextInt();

            if (input<0){
                System.out.println("Girilen sayi negatif, bu yüzden program sona erdi.");
                break;
            }else if (input%2==1) {
                //toplam += input;
                System.out.println("girilen tek sayilarin toplami: " + (toplam+=input));

            }
        }
        }
    }

