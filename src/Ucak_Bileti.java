import java.sql.SQLOutput;
import java.util.Scanner;

public class Ucak_Bileti {
    public static void main(String[] args) {
        /*Proje Konusu
Java ile mesafeye ve durumlara göre otobüs bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaş ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgileri ile mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.




        Km birim fiyati : 0.10$
        12 yasindan kücükse toplam fiyata 50% indirim
        12 ve 24 yas arasi 10% indirim
        65 yasindan büyükse 30% indirim
        Gidis-dönüs alirsa 20% indirim
        bu kosullara uyan ucak bileti programi yazin
         */
        Scanner scan=new Scanner(System.in);
        int Mesafe, yas,tip;
        float Km_fiyat= 0.10f;


        System.out.print("Kac kilometre ucacaginizi yazin: ");
        Mesafe=scan.nextInt();

        double Ücret,indirimli_Ücret,tip_indirimi;

        System.out.print("Lütfen yasinizi giriniz: ");
        yas=scan.nextByte();
        System.out.println("Yolculuk tipini seciniz: \n1-Gidis , \n2-Gidis-dönüs , \n3-Dönüs");
        tip=scan.nextByte();
        if (Mesafe>0 && yas>0 && (tip==1 || tip==2 || tip==3)){
            Ücret= Km_fiyat*Mesafe;
            if (yas<12){
                indirimli_Ücret=Ücret*0.5;
            }else if(yas>=12 && yas<=24){
                indirimli_Ücret=Ücret*0.1;
            }else if(yas>=65){
                indirimli_Ücret=Ücret*0.3;
            }else{
                indirimli_Ücret=0;
            }

            Ücret -= indirimli_Ücret;

            if(tip==2) {
                tip_indirimi=(Ücret*0.2);
                Ücret=(Ücret-tip_indirimi)*2;

            }
            System.out.println("Bilet ücreti:  "+Ücret+"$");

        }else{
            System.out.println("Lütfen dogru giris yapiniz");
        }





    }
}
