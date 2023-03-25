import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        // break döngüyü durdurur
        // continue döngüyü durdurmaz ama bir sonraki adima gecer

        Scanner scan = new Scanner(System.in);
        /*
        int sayi;

        while (true) {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if (sayi == 0) {
                System.out.println("Döngü sona erdi.");
                break;
            }
            System.out.println(sayi);
        }
    */
    for (int i=1; i<=10 ; i++){
        if (i==4  || i==9 ){
            System.out.println("Continue atladi");
            continue;

        }
        System.out.println("i= " +i);
    }

    }

}