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
public class Suling {
    
    private String nama;

    public Suling() {
    }

    public Suling(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Suling{" + "nama=" + nama + '}';
    }
    
    
    
}
