import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenler Tanımlandı

        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımlandı

        Scanner Dersler = new Scanner(System.in);

        // kullanıcıdan veri alma;

        System.out.println("Matematik Ders Notunuzu Giriniz : ");
        matematik = Dersler.nextInt();

        System.out.println("Fizik Ders Notunuzu Giriniz : ");
        fizik = Dersler.nextInt();

        System.out.println("Kimya Ders Notunuzu Giriniz : ");
        kimya = Dersler.nextInt();

        System.out.println("Turkce Ders Notunuzu Giriniz : ");
        turkce = Dersler.nextInt();

        System.out.println("Tarih Ders Notunuzu Giriniz : ");
        tarih = Dersler.nextInt();

        System.out.println("Müzik Ders Notunuzu Giriniz : ");
        muzik = Dersler.nextInt();

        int Toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double Ortalama = Toplam / 6;

        System.out.println("Not Ortalamanız : " + Ortalama);

        // Geçme Kalma Durum bilgisi Koşulu eklendi.

        int GecmeKosulu = 60;

        boolean kosul1 = Ortalama == GecmeKosulu;
        boolean kosul2 = Ortalama >= GecmeKosulu;
        boolean sonuc = kosul1 || kosul2;

        String Basari = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı!!!";

        System.out.println(Basari);



    }
}