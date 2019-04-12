/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar{
    public void bentuk(){
        System.out.print("Bentuk bangun segitiga");
        int a = 3;
        for(int i=0; i<a; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}
