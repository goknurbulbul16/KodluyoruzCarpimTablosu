import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nBir işlem seçiniz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sayıların toplamı: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sayıların Çıkarması: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Sayıların Çarpımı: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Sayıların Bölümü: " + (n1 / n2));
                break;
        }
    }
}