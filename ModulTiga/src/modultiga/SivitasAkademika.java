/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

/**
 *
 * @author amnan
 */
public class SivitasAkademika {
    // Modifier 'protected' agar dapat diakses oleh kelas turunannya,
    // tetapi tetap tertutup dari kelas di luar hierarki atau package.
    protected String nama;
    protected String idInstitusi;

    public SivitasAkademika(String nama, String idInstitusi) {
        this.nama = nama;
        this.idInstitusi = idInstitusi;
    }

    // Method ini akan di-override oleh kelas turunannya
    public void tampilkanPeran() {
        System.out.println("Sivitas Akademika Umum");
    }
}