/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan20_targetsaldotabungan;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan kemajuan saldo nasabah mengejar target 
 *              saldo tabungan
 */
public class PBO2_10117081_Latihan20_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1;
        int saldoTabungan = 3500000;
        double bungaBulan = 0.08;
        double saldoBulan;
        
        while (saldoTabungan <= 6000000) {
            
            saldoBulan = bungaBulan * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoBulan);
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + saldoTabungan);
           i++;
        }
        
    }
    
}
