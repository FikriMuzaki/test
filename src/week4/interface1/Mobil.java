/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.interface1;

/**
 *
 * @author User
 */
public class Mobil implements KomponenInterface {

    @Override
    public void main() {
        System.out.println("Kecepatan mobil : "+kecepatanmax);
       
    }

    @Override
    public void design() {
        System.out.println("Model mobil : "+model);
        
    }
    
}
