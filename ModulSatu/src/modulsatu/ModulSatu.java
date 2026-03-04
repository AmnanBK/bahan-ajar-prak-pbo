/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulsatu;

/**
 *
 * @author amnan
 */
public class ModulSatu {
    // Method main adalah titik awal eksekusi program
    public static void main(String[] args) {
        
        // 1. Deklarasi Data (Tipe Data dan Array)
        String[] namaKandidat = {"Rifqi", "Tika", "Budi"};
        double[] ipkKandidat = {3.85, 3.90, 2.75};
        
        // Konstanta untuk standar kelulusan 
        final double STANDAR_IPK = 3.00; 
        
        System.out.println("=== Evaluasi Kandidat Asisten Laboratorium ===");
        
        // 2. Perulangan (Looping) untuk memproses setiap data
        for (int i = 0; i < namaKandidat.length; i++) {
            System.out.print("Kandidat: " + namaKandidat[i] + " | IPK: " + ipkKandidat[i] + " -> ");
            
            // 3. Pengambilan Keputusan (Conditionals)
            if (ipkKandidat[i] >= STANDAR_IPK) {
                System.out.println("Lolos Seleksi Berkas");
            } else {
                System.out.println("Tidak Lolos");
            }
        }
        
        // 4. Simulasi pencetakan jadwal
        System.out.println("\n=== Simulasi Jadwal Jaga ===");
        int shiftPerHari = 2;
        int hariKerja = 3;
        
        for (int hari = 1; hari <= hariKerja; hari++) {
            System.out.println("Hari ke-" + hari + ":");
            for (int shift = 1; shift <= shiftPerHari; shift++) {
                System.out.println("  - Mengajar Praktikum Shift " + shift);
            }
        }
    }
}
