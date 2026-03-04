/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modullima;

/**
 *
 * @author amnan
 */
// Custom exception harus menjadi turunan (extends) dari class Exception
public class IpkTidakValidException extends Exception {
    
    // Constructor menerima pesan error dan meneruskannya ke superclass Exception
    public IpkTidakValidException(String pesan) {
        super(pesan); 
    }
}
