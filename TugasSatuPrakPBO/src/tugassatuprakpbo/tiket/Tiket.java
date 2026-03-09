/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassatuprakpbo.tiket;
import tugassatuprakpbo.exception.DataTiketInvalidException;

/**
 *
 * @author amnan
 */
public abstract class Tiket {
    protected String kodeTiket;
    protected Jadwal jadwal; 
    protected double hargaDasar;

    public Tiket(String kodeBooking, Jadwal jadwal, double hargaDasar) throws DataTiketInvalidException {
        if (hargaDasar <= 0) {
            throw new DataTiketInvalidException("Harga dasar tidak boleh nol atau negatif.");
        }
        if (!kodeBooking.startsWith("TIX")) {
            throw new DataTiketInvalidException("Kode booking wajib diawali 'TIX'.");
        }
        
        this.kodeTiket = kodeBooking;
        this.jadwal = jadwal;
        this.hargaDasar = hargaDasar;
    }

    public abstract double hitungTotalHarga(); 

    public String getKodeTiket() { return kodeTiket; }
    public Jadwal getJadwal() { return jadwal; }
}
