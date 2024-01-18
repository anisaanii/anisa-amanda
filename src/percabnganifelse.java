public class percabnganifelse {
}

import java.util.Scanner;

public class ContohPercabangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Contoh penggunaan if
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        if (angka > 0) {
            System.out.println("Angka tersebut positif.");
        }
        // Contoh penggunaan if-else
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan tersebut adalah bilangan genap.");
        } else {
            System.out.println("Bilangan tersebut adalah bilangan ganjil.");
        }
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        if (nilai >= 80) {
            System.out.println("Nilai Anda adalah A");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda adalah B");
        } else if (nilai >= 60) {
            System.out.println("Nilai Anda adalah C");
        } else if (nilai >= 50) {
            System.out.println("Nilai Anda adalah D");
        } else {
            System.out.println("Nilai Anda adalah E");
        }
        input.close();
    }
}

