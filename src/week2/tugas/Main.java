/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.tugas;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Drum drum = new Drum("Dipukul");
        Gitar gitar = new Gitar("Dipetik");
        Suling suling = new Suling("Ditiup");
        Piano piano = new Piano("Ditekan",drum,gitar,suling);
        
        System.out.println(piano.toString());
    }
    
}
