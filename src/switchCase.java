import java.util.Scanner;
public class switchCase {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gün;

        System.out.println("Lütfen 1 ile 7 arasi bir sayi giriniz ve girdiginiz sayinin haftanin hangi günü oldugunu ögreniniz: ");
        gün = input.nextInt();

        //int gün = 2;
        String haftanınGünü;
        switch (gün) {
            case 1:
                haftanınGünü = "Pazartesi";
                break;
            case 2:
                haftanınGünü = "Salı" ;
                break;
            case 3:
                haftanınGünü = "Çarşamba" ;
                break;
            case 4:
                haftanınGünü =  "Perşembe" ;
                break;
            case 5:
                haftanınGünü = "Cuma";
                break;
            case 6:
                haftanınGünü = "Cumartesi";
                break;
            case 7:
                haftanınGünü = "Pazar";
                break;
            default:
                haftanınGünü = "Geçersiz gün";
                break;
        }
        System.out.println(haftanınGünü);
    }
}
