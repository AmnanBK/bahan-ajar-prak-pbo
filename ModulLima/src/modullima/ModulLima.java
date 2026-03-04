/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modullima;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author amnan
 */
public class ModulLima {
public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("=== Pendaftaran Asisten Laboratorium ===");
        
        // Blok TRY: Berisi kode yang berpotensi menimbulkan exception
        try {
            System.out.print("Masukkan Nama Asisten : ");
            String nama = inputUser.nextLine();
            
            System.out.print("Masukkan NIM          : ");
            String nim = inputUser.nextLine();
            
            System.out.print("Masukkan IPK (0.0-4.0): ");
            // Berpotensi memicu InputMismatchException jika user mengetik huruf
            double ipk = inputUser.nextDouble(); 
            
            System.out.print("Masukkan Mata Kuliah  : ");
            // Membersihkan buffer scanner
            inputUser.nextLine(); 
            String matkul = inputUser.nextLine();
            
            // Berpotensi memicu IpkTidakValidException dari method setIpk() di dalam constructor
            AsistenLab asistenBaru = new AsistenLab(nama, nim, ipk, matkul);
            
            System.out.println("\n[SUKSES] Data asisten berhasil didaftarkan!");
            asistenBaru.tampilkanIdentitas();
            
        } 
        // Blok CATCH 1: Menangkap error dari input Scanner (Kesalahan Tipe Data)
        catch (InputMismatchException e) {
            System.out.println("\n[ERROR SISTEM] Input gagal! Anda memasukkan teks pada kolom angka.");
        } 
        // Blok CATCH 2: Menangkap error dari Custom Exception kita (Kesalahan Logika Bisnis)
        catch (IpkTidakValidException e) {
            System.out.println("\n[ERROR VALIDASI] " + e.getMessage());
        } 
        // Blok FINALLY: Selalu dieksekusi, baik terjadi error maupun tidak
        finally {
            System.out.println("-> Menutup saluran input...");
            inputUser.close(); // Penting untuk mencegah kebocoran memori (resource leak)
            System.out.println("=== Proses Pendaftaran Selesai ===");
        }
    }
    
}
