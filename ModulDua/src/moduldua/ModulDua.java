/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moduldua;

/**
 *
 * @author amnan
 */
public class ModulDua {
    public static void main(String[] args) {

        System.out.println("=== Evaluasi Kandidat (Pendekatan OOP) ===\n");

        // Membentuk objek nyata (instansiasi) 
        AsistenLab asisten1 = new AsistenLab("Rifqi", "123200001", 3.85);
        AsistenLab asisten2 = new AsistenLab("TIka", "123200002", 3.90);
        AsistenLab asisten3 = new AsistenLab("Budi", "123200003", 2.75);

        // Setiap objek bertanggung jawab atas evaluasinya sendiri
        asisten1.evaluasiKelayakan();
        asisten2.evaluasiKelayakan();
        asisten3.evaluasiKelayakan();
    }
    
}
