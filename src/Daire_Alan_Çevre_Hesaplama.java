import java.util.Scanner;

public class Daire_Alan_Çevre_Hesaplama {
    public static void main(String[] args) {

        /*
        Proje Konusu
Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.

Daire Alan Formülü : π * r * r

Daire Çevre Formülü : 2 * π * r

Bonus Geliştirme
Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.

π Sayısını = 3,14 alın.

Formül : (π  * (r*r) *a) / 360)
         */
        Scanner scanner= new Scanner(System.in);
        int r;
        System.out.print("Lütfen dairenin yaricapini giriniz: ");
        r= scanner.nextInt();

        double Pi=3.14;



        double Alan= Pi*r*r;

        double cevre= 2*Pi*r;

        System.out.println("Dairenin Alani: "+Alan);

        System.out.println("dairenin Cevresi: "+cevre);

        double Aci;
        System.out.print("Lütfen dairenin ic acisini giriniz: ");
        Aci= scanner.nextDouble();

        double Acili_Alan= ((Pi*(r*r)*Aci)/360)  ;
        System.out.println("Acisi "+Aci+"° olan daire diliminin alani:  "+Acili_Alan);






    }
}
