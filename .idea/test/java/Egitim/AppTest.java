package Egitim;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * Created by FiratUlgay on 3.12.2019.
     */
    public static class Okul {

        String ad ;
        String soyad;

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public void setSoyad(String soyad) {
            this.soyad = soyad;
        }
    }

    /**
     * Created by FiratUlgay on 3.12.2019.
     */
    public static class test {

        public static void main(String[] args) {
            iciceFor();
            List<Integer> sayiList = new ArrayList<>();
            sayiList.add(50);
            sayiList.add(20);
            sayiList.add(30);

            getVeri(sayiList);

            List<Okul> okulList = new ArrayList<>();
            Okul okul = new Okul();
            okul.setAd("ahmet");
            okul.setSoyad("aşan");
            okulList.add(okul);

            Okul okul2 = new Okul();
            okul2.setAd("canan");
            okul2.setSoyad("aşan");
            okulList.add(okul2);

            Okul okul3 = new Okul();
            okul3.setAd("mehmet");
            okul3.setSoyad("aşan");
            okulList.add(okul3);

            getOkulListesi(okulList);

        }

        public static void iciceFor() {
            for (int i = 0; i < 10; i++) {
                System.out.println("sayi" + i);
                for (int j = 0; j < 5; j++) {
                    System.out.println("ikinci sayı " + j);
                }
                System.out.println("içerideki for bitti");
            }
            System.out.println("üstteki for bitti");
        }

        public static void getVeri(int a ){
            int toplam = a + 5;
            System.out.println(toplam);
        }

        public static void getVeri(List<Integer> list){
            int top = 0;
            for (Integer ınteger : list) {
                top = top + ınteger;
            }
        }

        public static void getOkulListesi(List<Okul> list){
            for (Okul okul : list) {

            }

        }


    }
}
