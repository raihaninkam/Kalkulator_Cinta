import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String NamaA, NamaB;
        int UmurA, UmurB;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat Datang Di aplikasi Kalkulator Cinta");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println('\n');

        System.out.println("Data Anda");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Anda : ");
        NamaA = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        UmurA = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Data Pasangan Anda");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Masukkan Nama Pasangan Anda : ");
        NamaB = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        UmurB = input.nextInt();
        System.out.println();
        System.out.println("Tekan ENTER Untuk Melihat Hasil Ramalan...");
        breakConsule();

        System.out.println(NamaA + " [" + UmurA + "] Tahun");
        System.out.println();
        final int size = 3;
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < 5 * size; n++) {
                double post1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double post2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (post1 < size + 0.5 || post2 < size + 0.5) {
                    System.out.print('♡');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print('♡');
            }
            System.out.print(System.lineSeparator());
        }
        System.out.println();
        System.out.println(NamaB + " [" + UmurB + "] Tahun");
        System.out.println();
        double value = random.nextDouble() * 100;
        while (value < 50) ;
        value = random.nextDouble() * 100;
        System.out.printf("Kecocokan Anda Dengan Pasangan Anda Adalah : %.2f\n", value, "%");
        System.out.println("Terimakasih telah menggunakan aplikasi Kalkulator Cinta");
        input.close();
    }

    private static void breakConsule() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




