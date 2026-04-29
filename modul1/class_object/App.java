package class_object;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merk mobil pertama: ");
        String merk1 = input.nextLine();

        System.out.print("Masukkan nomor polisi mobil pertama: ");
        String nopol1 = input.nextLine();

        System.out.print("Masukkan warna mobil pertama: ");
        String warna1 = input.nextLine();

        System.out.print("Masukkan kecepatan mobil pertama (kpj): ");
        int kecepatan1 = input.nextInt();

        System.out.print("Masukkan waktu perjalanan mobil pertama (jam): ");
        int waktu1 = input.nextInt();
        input.nextLine(); 

        Mobil mobil1 = new Mobil();
        mobil1.setMerk(merk1);
        mobil1.setNopol(nopol1);
        mobil1.setWarna(warna1);
        mobil1.setKecepatan(kecepatan1);
        mobil1.hitungJarakTempuh(waktu1);

        System.out.print("Masukkan merk mobil kedua: ");
        String merk2 = input.nextLine();

        System.out.print("Masukkan nomor polisi mobil kedua: ");
        String nopol2 = input.nextLine();

        System.out.print("Masukkan warna mobil kedua: ");
        String warna2 = input.nextLine();

        System.out.print("Masukkan kecepatan mobil kedua (kpj): ");
        int kecepatan2 = input.nextInt();

        System.out.print("Masukkan waktu perjalanan mobil kedua (jam): ");
        int waktu2 = input.nextInt();
        input.nextLine();

        Mobil mobil2 = new Mobil();
        mobil2.setMerk(merk2);
        mobil2.setNopol(nopol2);
        mobil2.setWarna(warna2);
        mobil2.setKecepatan(kecepatan2);
        mobil2.hitungJarakTempuh(waktu2);

        System.out.println("===== Data Mobil =====");

        System.out.println("Mobil 1:");
        mobil1.display();
        mobil1.tampilKecepatanMS();

        System.out.println("Mobil 2:");
        mobil2.display();
        mobil2.tampilKecepatanMS();

        input.close();
    }
}