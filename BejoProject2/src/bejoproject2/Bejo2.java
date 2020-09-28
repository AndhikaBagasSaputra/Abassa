/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejoproject2;

/**
 *
 * @author Bagas
 */
public class Bejo2 {
    /*Membuat Attribut*/
    double banyak;
    double ukuranKramik;
    double harga;
    double box;
    
    //constructor
    Bejo2(double b, double h, double uK, double B){
        this.box = b;
        this.harga = h;
        this.ukuranKramik = uK;
        this.banyak = B;
    }
    
    /*Membuat Method*/
    double totalK(){
        double total;
        total = this.banyak * this.harga;
        /* Code diatas untuk mengetahui total harga masing masing kramik*/
        return total; 
    }
    
    double luasK(){
        double luas;
        luas =((this.ukuranKramik) * this.box / 10000) * this.banyak;
        return luas;
        /*Code diatas untuk mengetahui berapa luas keramik yang terbeli dengan luas 100m2*/
    }
}
