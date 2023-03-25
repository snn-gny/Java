import java.util.Scanner;

public class Cin_Zodyak {
    public static void main(String[] args) {

        /*
        Proje Konusu
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 -> Maymun
Doğum Tarihi %12 = 1 -> Horoz
Doğum Tarihi %12 = 2 -> Köpek
Doğum Tarihi %12 = 3 -> Domuz
Doğum Tarihi %12 = 4 -> Fare
Doğum Tarihi %12 = 5 -> Öküz
Doğum Tarihi %12 = 6 -> Kaplan
Doğum Tarihi %12 = 7 -> Tavşan
Doğum Tarihi %12 = 8 -> Ejderha
Doğum Tarihi %12 = 9 -> Yılan
Doğum Tarihi %12 = 10 ->At
Doğum Tarihi %12 = 11 ->Koyun
Örnek Çıktı

Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At
         */

        Scanner scan= new Scanner(System.in);

        int yil, zodyak;
        System.out.print("Lütfen dogum yilinizi giriniz: ");
        yil=scan.nextInt();

        zodyak=yil%12;

        String Cin_Zodyagi;


        switch (zodyak){
               case 0:
                   Cin_Zodyagi = "Maymun";
                    break;
                case 1:
                    Cin_Zodyagi= "Horoz" ;
                break;

                case 2:
                    Cin_Zodyagi = "Köpek" ;
                    break;
                case 3:
                    Cin_Zodyagi = "Domuz" ;
                    break;
                case 4:
                    Cin_Zodyagi=  "Fare" ;
                    break;
                case 5:
                    Cin_Zodyagi= "Öküz";
                    break;
                case 6:
                    Cin_Zodyagi = "Kaplan";
                    break;
                case 7:
                    Cin_Zodyagi = "Tavsan";
                    break;
            case 8:
                Cin_Zodyagi = "Ejderha";
                break;
            case 9:
                Cin_Zodyagi = "Yilan";
                break;
            case 10:
                Cin_Zodyagi = "At";
                break;
            case 11:
                Cin_Zodyagi = "Koyun";
                break;
            default:
                    Cin_Zodyagi = "Geçersiz gün";
                    break;
            }
            System.out.println("Çin Zodyağı Burcunuz : "+Cin_Zodyagi);






    }
}
