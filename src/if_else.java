import java.util.Scanner;
public class if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gun;
        System.out.println("Lütfen bir gün adi yaziniz: ");
        gun = input.nextLine().toLowerCase();

        if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma"))
        {

            System.out.println(gun+" bir is günüdür");
        } else if(gun.equals("cumartesi") || gun.equals("pazar"))
        {
            System.out.println(gun+" bir tatil günüdür");
        }
        else{
            System.out.println("Gecersiz bir gün girdiniz");
        }
    }
}
