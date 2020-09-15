/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramikproject;

/**
 *
 * @author Bagas
 */
public class Kramik {
    /* Membuat Attribut*/
    /* dikarnakan banyak desimal maka menggunakan double*/
    double ukuranKramik;
    double box;
    double banyak;
    double harga;
    char jenisKr;
    
    /* membuat method */
    void luasK(){
        double luas;
        luas = (this.ukuranKramik * box / 10000) * banyak;
        /*Code diatas untuk mengetahui berapa luas keramik yang terbeli dengan luas 100m2*/
        
        double total;
        total = banyak * harga;
        /* Code diatas untuk mengetahui total harga masing masing kramik*/
        System.out.println("Total Harga Kramik " + jenisKr + " Adalah Rp."+ total+ " Dgn Luas " + luas + " m2 ");
    }
}
