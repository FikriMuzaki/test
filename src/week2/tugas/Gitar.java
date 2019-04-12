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
public class Gitar {
    private String nama;

    public Gitar() {
    }

    public Gitar(String nama) {
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
        return "Gitar{" + "nama=" + nama + '}';
    }
    
    
    
}
