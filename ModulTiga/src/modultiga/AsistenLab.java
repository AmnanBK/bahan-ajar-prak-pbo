/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

/**
 *
 * @author amnan
 */
// Menggunakan 'extends' untuk mewarisi SivitasAkademika
public class AsistenLab extends SivitasAkademika {
    
    // Encapsulation: IPK dilindungi agar tidak dimanipulasi sembarangan
    private double ipk;
    
    public AsistenLab(String nama, String idInstitusi, double ipk) {
        // Keyword 'super' memanggil constructor milik kelas induk
        super(nama, idInstitusi); 
        setIpk(ipk); // Menggunakan setter untuk inisialisasi awal agar tervalidasi
    }
    
    // Setter bertindak sebagai "penjaga gerbang" (Data Validation)
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Peringatan: Input IPK tidak valid. Diset ke 0.0");
            this.ipk = 0.0;
        }
    }
    
    // Getter untuk membaca data secara aman
    public double getIpk() {
        return this.ipk;
    }

    // 1. Polymorphism (Overriding): Menimpa method induk dengan logika spesifik
    @Override
    public void tampilkanPeran() {
        System.out.println(this.nama + " adalah Asisten Laboratorium.");
    }
    
    // 2. Polymorphism (Overloading) - Bentuk ke-1 
    public void tugaskan(String mataKuliah) {
        System.out.println(this.nama + " ditugaskan mengajar: " + mataKuliah);
    }
    
    // 2. Polymorphism (Overloading) - Bentuk ke-2 (Beda jumlah parameter)
    public void tugaskan(String mataKuliah, String ruangLab) {
        System.out.println(this.nama + " ditugaskan mengajar: " + mataKuliah + " di ruang " + ruangLab);
    }
}
