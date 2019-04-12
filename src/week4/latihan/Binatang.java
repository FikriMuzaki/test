/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihan;

/**
 *
 * @author User
 */
public class Binatang extends Hewan {

    @Override
    void duck() {
        System.out.println("Duck{name=Angsa, bred=Cirebon, umur = 1}");
        System.out.println("kwek...kweek...kwek...");
    }

    @Override
    void cat() {
        System.out.println("Cat{name=Si manis, breed=Anggora, umur = 5}");
        System.out.println("Meong...Meong...Meong...");
    }

    @Override
    void dog() {
        System.out.println("Dog{name=Si hitam, breed=Ciwawa, umur = 30}");
        System.out.println("Gok...Gok...Gok...");
        
    }
    
    
}
