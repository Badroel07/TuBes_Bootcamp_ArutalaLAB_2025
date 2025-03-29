import java.util.*;
import java.util.Scanner;

public class Program_Perpajakan{
    public static void main(String[] args){

        //Deklarasi Variabel
        double penghasilan_tahunan;
        int tanggungan_keluarga;
        int sektor_pekerjaan;
        String pekerja_lepas;
        double tarif_pajak = 0;
        double pekerja_lepas_pajak = 0;
        double disc_tanggungan = 0;
        double disc_sektor = 0;
        double total = 0;
        String kategori;

    
        System.out.println("======= Selamat datang di Program Perpajakan 2025 =======\n");
        Scanner user_input = new Scanner(System.in);

        System.out.println("Silakan masukkan data untuk menghitung pajak Anda");
        System.out.println("=========================================================");

    //INPUT DATA
        //Input Penghasilan Tahunan
        System.out.print("Masukkan Penghasilan Tahunan: Rp");
        penghasilan_tahunan = user_input.nextDouble();
        System.out.println("-----------------------------------------------");

        //Input Tanggungan Keluarga
        System.out.print("Masukkan Jumlah Tanggungan Keluarga: ");
        tanggungan_keluarga = user_input.nextInt();
        System.out.println("-----------------------------------------------");    


        //Input Sektor Pekerjaan
        System.out.println("Pilih Sektor Pekerjaan: ");
        System.out.println("1. Pendidikan/Kesehatan/Sosial");
        System.out.println("2. Teknologi");
        System.out.println("3. Keuangan");
        System.out.println("4. Lainnya");
        System.out.print("Masukkan Pilihan: ");
        sektor_pekerjaan = user_input.nextInt();
        System.out.println("-----------------------------------------------");


        user_input.nextLine();  // membersihkan buffer

        //Input Pekerja Lepas atau tidak
        System.out.print("Apakah Anda seorang pekerja lepas? (Y/N): ");
        pekerja_lepas = user_input.nextLine();
        System.out.println("=========================================================");

    //PROSES PERHITUNGAN
        //Kelas I
        if (penghasilan_tahunan <= 50000000) {
            tarif_pajak = penghasilan_tahunan * (5.0/100);
            kategori = "Kelas I";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        //Kelas II
        } else if (penghasilan_tahunan <= 100000000) {
            tarif_pajak = penghasilan_tahunan * (10.0/100);
            kategori = "Kelas II";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        //Kelas III
        } else if (penghasilan_tahunan <= 250000000) {
            tarif_pajak = penghasilan_tahunan * (15.0/100);
            kategori = "Kelas III";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        //Kelas IV
        } else if (penghasilan_tahunan <= 500000000) {
            tarif_pajak = penghasilan_tahunan * (20.0/100);
            kategori = "Kelas IV";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        //Kelas V
        } else if (penghasilan_tahunan <= 1000000000) {
            tarif_pajak = penghasilan_tahunan * (25.0/100);
            kategori = "Kelas V";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        //Kelas VI
        } else if (penghasilan_tahunan > 1000000000) {
            tarif_pajak = penghasilan_tahunan * (30.0/100);
            kategori = "Kelas VI";
            if (pekerja_lepas.equalsIgnoreCase("Y")) {
                pekerja_lepas_pajak = penghasilan_tahunan * (2.0/100);
            } else {
                pekerja_lepas_pajak = 0;
            }
        } else {
            System.out.println("Penghasilan tahunan tidak valid.");
        }

        switch (sektor_pekerjaan) {
            case 1:
                disc_sektor = tarif_pajak * (5.0/100);
                break;
            case 2:
                disc_sektor = tarif_pajak * (3.0/100);
                break;
            case 3:
                disc_sektor = tarif_pajak * (2.0/100);
                break;
            default:
                disc_sektor = 0;
                break;
        }

        switch (tanggungan_keluarga) {
            case 0:
                disc_tanggungan = 0;
                break;
            case 1:
                disc_tanggungan = tarif_pajak * (5.0/100);
                break;
            case 2:
                disc_tanggungan = tarif_pajak * (10.0/100);
                break;
            case 3:
                disc_tanggungan = tarif_pajak * (15.0/100);
                break;
            default:
                disc_tanggungan = tarif_pajak * (15.0/100);
                break;
        }
        total = tarif_pajak - disc_tanggungan - disc_sektor + pekerja_lepas_pajak;
    
        //OUTPUT
        System.out.println("Hasil Perhitungan Pajak:\n");
        System.out.println("Pajak Sebelum Diskon: Rp" + String.format("%.2f", tarif_pajak));
        System.out.println("Diskon Tanggungan: Rp" + String.format("%.2f", disc_tanggungan));
        System.out.println("Diskon Sektor Pekerjaan: Rp" + String.format("%.2f", disc_sektor));
        System.out.println("Total Pajak yang Harus Dibayar: Rp" + String.format("%.2f", total));
        System.out.println("=========================================================");
        

    
    }
}