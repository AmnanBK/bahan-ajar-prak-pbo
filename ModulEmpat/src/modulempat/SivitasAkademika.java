/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulempat;

/**
 *
 * @author amnan
 */
// Ditandai 'abstract' agar tidak bisa diinstansiasi langsung dengan 'new'
public abstract class SivitasAkademika {
    // Atribut 'protected'
    protected String nama;
    protected String nim;

    // Constructor
    public SivitasAkademika(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method biasa (Boleh ada di dalam Abstract Class)
    public void tampilkanIdentitas() {
        System.out.println("Nama: " + this.nama + " | NIM: " + this.nim);
    }

    // METHOD BARU BAB 4: Abstract Method
    // Tidak punya penutup kurung kurawal {}, memaksa childnya untuk mengisi logikanya.
    public abstract void jalankanTugasUtama();
}
