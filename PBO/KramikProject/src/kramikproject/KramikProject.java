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
public class KramikProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kramik A = new Kramik();
        A.jenisKr = 'A';
        A.ukuranKramik = 30 * 30;
        A.harga = 54000;
        A.banyak = 111;
        A.box = 10;
        A.luasK();
        System.out.println(" ");
        
        Kramik B = new Kramik();
        B.jenisKr = 'B';
        B.ukuranKramik = 40 * 40;
        B.harga = 65000;
        B.banyak = 125;
        B.box = 5;
        B.luasK();
        System.out.println(" ");
        
        Kramik C = new Kramik();
        C.jenisKr = 'C';
        C.ukuranKramik = 30 * 40;
        C.harga = 60000;
        C.banyak = 104;
        C.box = 8;
        C.luasK();
        System.out.println(" ");
    }
    
}
