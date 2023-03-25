import java.util.Scanner;
import java.util.Arrays;
public class Sayi_Siralama {

        public static void main(String[] args) {
            /*
            Proje Konusu
Java ile kullanıcının girdiği 3 sayıyı büyükten küçüğe sıralayan programı yazınız.
             */


            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[6];

            System.out.println("Lütfen 6 sayı giriniz:");

            for (int i = 0; i < 6; i++) {
                numbers[i] = scanner.nextInt();
            }

            Arrays.sort(numbers);

            System.out.print("Girilen sayıların küçükten büyüğe sıralanmış hali:");

            for (int i = 0; i <= 5; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
}








