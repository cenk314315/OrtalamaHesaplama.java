import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik, toplam;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz:  ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:  ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:  ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:  ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:  ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:  ");
        muzik = inp.nextInt();

        toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6 ;

        boolean kosul1 = ortalama >= 60;




        System.out.println("Notlarınızın Ortalaması: " + ortalama);
        String str = (kosul1) ? "SINIFI GEÇTİ" : "SINIFTA KALDI";
        System.out.println("DURUMUNUZ: " + str);


    }


}
