/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugassatuprakpbo;

import tugassatuprakpbo.tiket.*;
import tugassatuprakpbo.exception.DataTiketInvalidException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author amnan
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tiket[] antrean = new Tiket[100];
        int jumlahSukses = 0;
        boolean isRunning = true;

        System.out.println("=== TERMINAL LOKET OOP TIX ===");

        while (isRunning && jumlahSukses < 100) {
            System.out.println("\n--- Input Tiket Ke-" + (jumlahSukses + 1) + " ---");

            try {
                System.out.print("Kode Booking (Awali 'TIX') : ");
                String kode = input.nextLine();

                System.out.print("Tanggal (DD/MM/YYYY)       : ");
                String tgl = input.nextLine();

                System.out.print("Waktu Keberangkatan        : ");
                String waktu = input.nextLine();

                System.out.print("Stasiun Tujuan             : ");
                String stasiun = input.nextLine();

                System.out.print("Harga Dasar (Rp)           : ");
                double harga = input.nextDouble();

                System.out.print("Kelas (1=Eko, 2=Eks, 3=Lux): ");
                int kelas = input.nextInt();
                input.nextLine();

                Jadwal jadwal = new Jadwal(tgl, waktu, stasiun);
                
                if (kelas == 1) {
                    antrean[jumlahSukses] = new TiketEkonomi(kode, jadwal, harga);
                } else if (kelas == 2) {
                    antrean[jumlahSukses] = new TiketEksekutif(kode, jadwal, harga);
                } else if (kelas == 3) {
                    antrean[jumlahSukses] = new TiketLuxury(kode, jadwal, harga);
                } else {
                    throw new DataTiketInvalidException("Pilihan kelas kereta tidak terdaftar.");
                }

                jumlahSukses++;
                System.out.println("[INFO] Tiket berhasil diterbitkan.");

            } catch (DataTiketInvalidException e) {
                System.out.println("\n[DITOLAK] " + e.getMessage());
                
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR SISTEM] Input harga/kelas harus berupa angka!");
                input.nextLine(); 
                
            } catch (Exception e) {
                System.out.println("\n[FATAL] Kesalahan sistem tak terduga.");
                input.nextLine();
            }

            System.out.print("\nCetak tiket lain? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("n")) {
                isRunning = false;
            }
        }

        System.out.println("\n=========================================");
        System.out.println("          REKAPITULASI TIKET             ");
        System.out.println("=========================================");

        if (jumlahSukses == 0) {
            System.out.println("Belum ada tiket yang diterbitkan.");
        } else {
            for (int i = 0; i < jumlahSukses; i++) {
                Tiket t = antrean[i];

                System.out.println("Kode Booking : " + t.getKodeTiket());
                System.out.println("Jadwal       : " + t.getJadwal().getInfoJadwal());
                
                System.out.println("Total Harga  : Rp " + t.hitungTotalHarga()); 

                if (t instanceof LayananEksklusif) {
                    LayananEksklusif fasilitas = (LayananEksklusif) t;
                    System.out.println("Fasilitas    : " + fasilitas.getFasilitas());
                }
                System.out.println("-----------------------------------------");
            }
        }
        System.out.println("Sesi loket diakhiri.");
        input.close();
    }
}
