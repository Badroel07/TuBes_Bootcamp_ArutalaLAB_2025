import java.util.*;
import java.util.Scanner;

public class Program_Perpajakan{
    public static void main(String[] args){

        //Deklarasi Variabel
        int penghasilan_tahunan;
        int tanggungan_keluarga;
        int sektor_pekerjaan;
        String pekerja_lepas;

    
        System.out.println("======= Selamat datang di Program Perpajakan 2025 =======\n");
        Scanner user_input = new Scanner(System.in);

        System.out.println("Silakan masukkan data untuk menghitung pajak Anda");

    //INPUT DATA
        //Input Penghasilan Tahunan
        System.out.print("Masukkan Penghasilan Tahunan: ");
        penghasilan_tahunan = user_input.nextInt();

        //Input Tanggungan Keluarga
        System.out.print("Masukkan Jumlah Tanggungan Keluarga: ");
        tanggungan_keluarga = user_input.nextInt();

        //Input Sektor Pekerjaan
        System.out.println("Pilih Sektor Pekerjaan: ");
        System.out.println("1. Pendidikan/Kesehatan/Sosial");
        System.out.println("2. Teknologi");
        System.out.println("3. Keuangan");
        System.out.println("4. Lainnya");
        System.out.print("Masukkan Pilihan: ");
        sektor_pekerjaan = user_input.nextInt();
        switch (sektor_pekerjaan) {
            case 1:
                
                break;
        
            default:
                break;
        }

        user_input.nextLine();  // membersihkan buffer

        //Input Pekerja Lepas atau tidak
        System.out.print("Apakah Anda seorang pekerja lepas? (Y/N): ");
        pekerja_lepas = user_input.nextLine();

    //PROSES PERHITUNGAN
    

    
    }
}