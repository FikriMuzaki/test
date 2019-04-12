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
public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double s, double a, double t, double p, double l, double r) {
        super(s, a, t, p, l, r);
    }

    public PersegiPanjang() {
    }
    
    public void luas(){
        double p = super.getP();
        double l = super.getL();
        double luas = 2*(p+1);
        System.out.println("Keliling Persegi Panjang = "+luas);
    }
    public void kel(){
        double p = super.getP();
        double l = super.getL();
        double kel = 2*(p+1);
        System.out.println("Keliling Persegi Panjang = "+kel);
                
    }
    
}
