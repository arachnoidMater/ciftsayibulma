import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k, total = 0, numbers = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                numbers++;

            }
        }
        if (numbers == 0) {
            System.out.println("Girilen sayı aralığında 3 ve 4'e tam bölünen bir sayı yok.");
        } else {
            double average = (double) total / numbers;
            System.out.println("Ortalama değeri:" + average);
        }
    }
}