/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulempat;

/**
 *
 * @author amnan
 */
public class ModulEmpat {

    public static void main(String[] args) {
        
        System.out.println("=== Sistem Manajemen SimLab ===\n");

        // 1. Instansiasi Objek
        // Perhatikan tipe datanya kita menggunakan Abstract Class
        SivitasAkademika asisten1 = new AsistenLab("Rifqi", "123200001", 3.85, "Pemrograman Web");
        
        // 2. Memanggil method dari Abstract Class
        asisten1.tampilkanIdentitas();
        asisten1.jalankanTugasUtama(); // Polimorfisme bekerja di sini

        System.out.println();

        // 3. Menggunakan Interface sebagai referensi
        // Kita memastikan bahwa asisten1 benar-benar memiliki kemampuan EvaluasiKinerja
        EvaluasiKinerja asistenDievaluasi = (EvaluasiKinerja) asisten1;
        asistenDievaluasi.hitungSkorEvaluasi();
    }
    
}
