import java.util.Scanner;

public class YDS_Puan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int YDSPuanı;

        System.out.println("Lütfen YDS Puaninizi Giriniz: ");
        YDSPuanı = input.nextInt();

        //int YDSPuanı = 82;
        char seviye;
        if (YDSPuanı >= 90) {
            System.out.println("Seviye = A");
        } else if (YDSPuanı >= 80) {
            System.out.println("Seviye = B");
        } else if (YDSPuanı >= 70) {
            System.out.println("Seviye = C");
        } else if (YDSPuanı >= 60) {
            System.out.println("Seviye = D");
        } else if (YDSPuanı >= 50) {
            System.out.println("Seviye = E");
        } else {
            System.out.println("Seviye = -");
        }
    }

}
