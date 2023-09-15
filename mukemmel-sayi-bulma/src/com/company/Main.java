import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 1) {
            System.out.println("Geçersiz sayı. Pozitif bir tam sayı giriniz.");
        } else {
            boolean sonuc = isMukemmelSayi(sayi);
            if (sonuc) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }
    }

    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
}

