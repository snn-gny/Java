import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        Scanner scan=new Scanner(System.in);
        double km, km_ucreti,toplam_ucret;
        int acilis_ucreti=10;
        int kisa_mesafe_ucreti=20;
        km_ucreti=2.2;

        System.out.print("Lütfen gidilen mesafeyi yaziniz: ");
        km=scan.nextDouble();

        toplam_ucret=(km*km_ucreti)+acilis_ucreti;
        if (kisa_mesafe_ucreti>toplam_ucret){
            System.out.println("Ödenecek tutar: "+kisa_mesafe_ucreti+"TL");
        }else if (kisa_mesafe_ucreti<toplam_ucret) {
            System.out.println("Ödenecek tutar: " +toplam_ucret+"TL");
        }else {
            System.out.println("Lütfen gecerli bir deger giriniz.");
        }

    }
}
