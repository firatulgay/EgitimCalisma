package Egitim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        IslemSecmeMetodu();
    }

    public static void IslemSecmeMetodu() {
        System.out.println("Seçim yapınız" + "\n" + "1: Tek Çift Bulma" + "\n" + "2: Yıldız oluşturma" + "\n" + "3: Cümle yazma");
        int sayi = scan.nextInt();
        if (sayi == 1){
            tekCiftMetodu();
        }else if (sayi == 2){
            yildizMetodu();
        }else if (sayi== 3){
            cumleMetodu();
        }
    }
    public static void terstenYazma(){
        System.out.println("kelime giriniz");
        String kelime = scan.nextLine();

    }

    public static void yildizMetodu() {
    /**
     * satır sayısı 4 vermeme rağmen 5 oluyor. Neden ?
     */
    System.out.println("satir sayısı giriniz:");
    int sayi1 = scan.nextInt();
    System.out.println("sütün sayısı giriniz:");
    int sayi2 = scan.nextInt();

    for (int i = 0; i < sayi1; i++) {
        for (int j = 0; j < sayi2; j++) {
            if (i == 0 && j!=0) {
                System.out.print("*");
            } else if (i > 0) {
                break;
            }
        }
        System.out.println("*");
    }
}

    public static void cumleMetodu() {
        System.out.println("bir cumle giriniz:");
        String cumle = scan.nextLine();
        System.out.println("baslangıc degeri giriniz");
        int ilkDeger = scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int sonDeger = scan.nextInt();

        String yeniCumle = cumle.substring(ilkDeger, sonDeger);
        System.out.println(yeniCumle);
    }

    public static void tekCiftMetodu() {
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();

        List<Integer> tekSayiList = new ArrayList<>();
        List<Integer> ciftSayilarList = new ArrayList<>();

        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0 ){
                ciftSayilarList.add(i);
        }else
            tekSayiList.add(i);
        }
        System.out.println( tekSayiList + "\n"+ ciftSayilarList);

    }

}
