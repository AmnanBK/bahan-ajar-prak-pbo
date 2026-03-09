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
public class TiketEksekutif extends Tiket implements LayananEksklusif {
    public TiketEksekutif(String kodeBooking, Jadwal jadwal, double hargaDasar) throws DataTiketInvalidException {
        super(kodeBooking, jadwal, hargaDasar);
    }

    @Override
    public String getFasilitas() {
        return "Makan Siang";
    }

    @Override
    public double hitungTotalHarga() {
        return hargaDasar + 50000;
    }
}
