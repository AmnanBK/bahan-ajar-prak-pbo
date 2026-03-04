/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modullima;

/**
 *
 * @author amnan
 */
// Mewarisi SivitasAkademika DAN mematuhi kontrak EvaluasiKinerja
public class AsistenLab extends SivitasAkademika implements EvaluasiKinerja {
    // Encapsulation
    private double ipk;
    private String mataKuliah;

    public AsistenLab(String nama, String nim, double ipk, String mataKuliah) throws IpkTidakValidException {
        super(nama, nim); // Memanggil constructor induk
        setIpk(ipk);      // Validasi IPK
        this.mataKuliah = mataKuliah;
    }

    // Getter & Setter
    // Keyword 'throws' pada deklarasi method memberitahu bahwa 
    // method ini berpotensi melempar IpkTidakValidException ke pemanggilnya 
    public void setIpk(double ipk) throws IpkTidakValidException {
        if (ipk < 0.0 || ipk > 4.0) {
            // Keyword 'throw' digunakan untuk menghasilkan objek exception secara manual
            throw new IpkTidakValidException("GAGAL: Nilai IPK " + ipk + " berada di luar batas kewajaran (0.0 - 4.0).");
        }
        this.ipk = ipk;
    }

    public double getIpk() {
        return this.ipk;
    }
    
    // KEWAJIBAN 1: Dari Abstract Class (SivitasAkademika)
    @Override
    public void jalankanTugasUtama() {
        System.out.println(this.nama + " sedang memandu praktikum: " + this.mataKuliah);
    }

    // KEWAJIBAN 2: Dari Interface (EvaluasiKinerja)
    @Override
    public void hitungSkorEvaluasi() {
        System.out.println("Menghitung skor evaluasi akhir semester untuk asisten: " + this.nama);
    }
}