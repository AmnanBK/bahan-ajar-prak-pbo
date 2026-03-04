/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modultiga;

/**
 *
 * @author amnan
 */
public class ModulTiga {

    public static void main(String[] args) {
        System.out.println("=== Sistem Manajemen Sivitas Akademika ===\n");
        
        // Membentuk objek menggunakan Constructor 
        AsistenLab asisten1 = new AsistenLab("Rifqi", "123200001", 3.85);
        AsistenLab asisten2 = new AsistenLab("Tika", "123200002", 5.00); // Sengaja dibuat salah
        
        // Menguji Overriding (Polymorphism)
        asisten1.tampilkanPeran();
        
        // Menguji Overloading (Polymorphism)
        asisten1.tugaskan("Pemrograman Berorientasi Objek");
        asisten1.tugaskan("Struktur Data", "Lab Komputer A");
        
        // Menguji Encapsulation
        System.out.println("\n--- Pengecekan Integritas Data ---");
        System.out.println("IPK " + asisten1.nama + " : " + asisten1.getIpk());
        System.out.println("IPK " + asisten2.nama + " : " + asisten2.getIpk()); // Akan menampilkan 0.0 karena ditolak Setter
    }
    
}
