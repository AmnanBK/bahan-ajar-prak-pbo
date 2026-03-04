/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduldua;

/**
 *
 * @author amnan
 */
public class AsistenLab {
    
    // 1. Atribut: Keadaan atau karakteristik yang dimiliki objek
    public String nama;
    public String nim;
    public double ipk;
    
    // 2. Constructor: Dijalankan pertama kali saat objek dibuat di memori
    // Berfungsi memberikan nilai awal (inisialisasi) pada atribut
    public AsistenLab(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    // 3. Method: Perilaku atau aksi yang dapat dilakukan oleh objek
    public void evaluasiKelayakan() {
        final double STANDAR_IPK = 3.00;
        System.out.print("Kandidat: " + this.nama + " | IPK: " + this.ipk + " -> ");
        
        if (this.ipk >= STANDAR_IPK) {
            System.out.println("Lolos Seleksi Berkas");
        } else {
            System.out.println("Tidak Lolos");
        }
    }
}