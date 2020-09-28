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
public class BejoProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bejo2 A = new Bejo2(10, 54000, 30*30, 111);
        System.out.println("Jumlah Kramik A Yang Didapat : 111");
        System.out.println("Total Harga Kramik : Rp. " + A.totalK());
        System.out.println("Dengan Luas : " + A.luasK()+ " m2");       
    
        Bejo2 B = new Bejo2(5, 65000, 40*40, 125);
        System.out.println("Jumlah Kramik C Yang Didapat : 125");
        System.out.println("Total Harga Kramik  : Rp. " + B.totalK());
        System.out.println("Dengan Luas : " + B.luasK()+ " m2");   
        
        Bejo2 C = new Bejo2(8, 60000, 30*40, 104);
        System.out.println("Jumlah Kramik C Yang Didapat : 104");
        System.out.println("Total Harga Kramik : Rp. " + C.totalK());
        System.out.println("Dengan Luas : " + C.luasK()+ " m2");   
    }
}
