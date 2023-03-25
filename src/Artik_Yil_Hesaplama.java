import java.util.Scanner;

public class Artik_Yil_Hesaplama {
    public static void main(String[] args) {

        /*
        Proje Konusu
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

Formül ;

Artık yıllar 4 rakamının katı olan yıllardır: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil,
yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
Örnek Çıktı

Yıl Giriniz : 2020
2020 bir artık yıldır !
Yıl Giriniz : 2022
2021 bir artık yıldır değildir !
         */
        Scanner scan=new Scanner(System.in);

        int yil;

        boolean artik_yil=false;

        System.out.print("Lütfen bir yil giriniz: ");
        yil=scan.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artik_yil = true;
                }
            } else {
                artik_yil = true;
            }
        }


        if (artik_yil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }


    }
}
