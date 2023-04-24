import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        double n1, n2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        n1 = input.nextDouble();
        System.out.print("Bir Sayı Giriniz:");
        n2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("İşlem Seçiniz:");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam:" + (n1 + n2));
                break;

            case 2:
                System.out.println("Çıkarma:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma:" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0 ){
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                }else {
                    System.out.println("Bölme:"+ (n1 / n2));
                }
                break;

            default:
                System.out.println("Yanlış Bir Değer Girdiniz!");


        }


    }
}




