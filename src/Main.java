import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1 -> {
                int toplam = n1 + n2;
                System.out.println("Sonuç : " + toplam);
            }
            case 2 -> {
                int fark = n1 - n2;
                System.out.println("Sonuç : " + fark);
            }
            case 3 -> {
                int carpim = n1 * n2;
                System.out.println("Sonuç : " + carpim);
            }
            case 4 -> {
                if (n2 != 0) {
                    int bolum = n1 / n2;
                    System.out.println("Sonuç:" + bolum);
                } else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
            }
            default -> System.out.println("Hatalı seçim yaptınız! Tekrar deneyiniz.");
        }
    }
}