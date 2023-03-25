import java.util.Scanner;

public class Sinif_Atlama {
    public static void main(String[] args) {
        /*
        Türkce, Matematik, Fen, Sosyal, Beden notlari girilsin
        Not ortalamasi hesaplansin
        Ortalama 50' den asagi ise sinifta kalsin, yüksekse sinif gecsin
         */

        Scanner scan = new Scanner(System.in);
        int Türkce, Matematik, Fen, Sosyal, Beden;
        double ortalama=0;

        System.out.print("Lütfen Türkce notunu girin: ");
        Türkce = scan.nextByte();
        System.out.print("Lütfen Matematik notunu girin: ");
        Matematik = scan.nextByte();
        System.out.print("Lütfen Fen notunu girin: ");
        Fen = scan.nextByte();
        System.out.print("Lütfen Sosyal notunu girin: ");
        Sosyal = scan.nextByte();
        System.out.print("Lütfen Beden notunu girin: ");
        Beden = scan.nextByte();
        ortalama=(Türkce+Matematik+Fen+Sosyal+Beden)/5;

        if (ortalama>=85){
            System.out.println("Tebrikler, Sinifi Takdirle gectiniz");
        }
        else if(ortalama>=70){
            System.out.println("Tebrikler, Sinifi Tesekkürle gectiniz");
        }
        else if(ortalama>=50){
            System.out.println("Tebrikler, Sinifi direk gectiniz");
        }

        else {
            System.out.println("Maalesef sinifta kaldiniz");
        }
        System.out.println("Ortalamaniz: "+ ortalama);
    }
}
