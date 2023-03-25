import java.util.Scanner;

public class Etkinlik_Önerme {
    public static void main(String[] args) {

        /*
        Proje Konusu
Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri öneren programı yazınız.

Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
                */
       Scanner scan = new Scanner(System.in);
       int sicaklik;
        System.out.println("Lütfen hava sicakligini giriniz: ");
        sicaklik=scan.nextInt();

        if (sicaklik>=30){
            System.out.println("Yüzmeye gidebilirsiniz");
        } else if (sicaklik>=5 && sicaklik<30) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if(sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }else{
            System.out.println("Gecerli bir hava sicakligi giriniz.");
        }
    }
}
