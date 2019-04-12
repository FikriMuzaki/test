/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.tugas;

/**
 *
 * @author User
 */
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar();
        b.bentuk();
        b.bentuk();
        
        //Persegi p1 = new Persegi();
        Persegi p2 = new Persegi();
        p2.setS(7);
        p2.luas();
        p2.kel();
        
        Segitiga s2 = new Segitiga();
        s2.setA(8);
        s2.setT(2);
        s2.luas();
        
        PersegiPanjang p1 = new PersegiPanjang();
        p1.setP(4);
        p1.setL(6);
        p1.luas();
        p1.kel();
        
        Lingkaran l =new Lingkaran();
        l.setR(7);
        l.luas();
        l.kel();
    }
    
}
