
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double para, paraKdv, kdvTutar, kdv = 0.18;

        System.out.print("KDV'sini Hesaplamak İstediginiz Tutarı Giriniz: ");
        para = scan.nextInt();

        kdvTutar = kdv * para;
        paraKdv = kdvTutar + para;

        System.out.println("KDV Oranı = " + kdv);
        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV'li Fiyat = " + paraKdv);
        System.out.println("KDV Tutarı = " + kdvTutar);

    }
}