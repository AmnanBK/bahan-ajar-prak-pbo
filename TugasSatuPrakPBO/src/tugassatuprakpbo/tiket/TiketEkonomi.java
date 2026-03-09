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
public class TiketEkonomi extends Tiket {
    public TiketEkonomi(String kodeBooking, Jadwal jadwal, double hargaDasar) throws DataTiketInvalidException {
        super(kodeBooking, jadwal, hargaDasar);
    }

    @Override
    public double hitungTotalHarga() {
        return hargaDasar;
    }
}
