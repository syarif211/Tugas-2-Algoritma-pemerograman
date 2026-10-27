import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persentaseLembur = 0;
        double gajiLembur, totalPenghasilan;

        System.out.println("=== PROGRAM PENGHITUNGAN GAJI KARYAWAN ===");
        
        // Input dari pengguna
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.nextLine().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();

        // Menentukan Gaji Pokok berdasarkan Golongan menggunakan IF
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            return; // Menghentikan program jika golongan salah
        }

        // Menentukan Persentase Lembur berdasarkan Jam Lembur
        if (jamLembur == 1) {
            persentaseLembur = 0.30;
        } else if (jamLembur == 2) {
            persentaseLembur = 0.32;
        } else if (jamLembur == 3) {
            persentaseLembur = 0.34;
        } else if (jamLembur == 4) {
            persentaseLembur = 0.36;
        } else if (jamLembur >= 5) {
            persentaseLembur = 0.38;
        } else {
            persentaseLembur = 0.0;
        }

        // Menghitung Gaji Lembur dan Total Penghasilan
        gajiLembur = gajiPokok * persentaseLembur;
        totalPenghasilan = gajiPokok + gajiLembur;

        // Menampilkan Output ke Layar
        System.out.println("\n--- RINCIAN PENGHASILAN ---");
        System.out.println("Golongan Karyawan   : " + golongan);
        System.out.println("Gaji Pokok          : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Jam Lembur          : " + jamLembur + " Jam");
        System.out.println("Gaji Lembur         : Rp " + String.format("%,.0f", gajiLembur));
        System.out.println("Total Penghasilan   : Rp " + String.format("%,.0f", totalPenghasilan));

        input.close();
    }
}