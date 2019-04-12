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
public class Piano {
    
    private String nama;
    
    private Drum drum;
    private Gitar gitar;
    private Suling suling;

    public Piano(String nama, Drum drum, Gitar gitar, Suling suling) {
        this.nama = nama;
        this.drum = drum;
        this.gitar = gitar;
        this.suling = suling;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Drum getDrum() {
        return drum;
    }

    public void setDrum(Drum drum) {
        this.drum = drum;
    }

    public Gitar getGitar() {
        return gitar;
    }

    public void setGitar(Gitar gitar) {
        this.gitar = gitar;
    }

    public Suling getSuling() {
        return suling;
    }

    public void setSuling(Suling suling) {
        this.suling = suling;
    }

    @Override
    public String toString() {
        return "Piano{" + "nama=" + nama + ", drum=" + drum + ", gitar=" + gitar + ", suling=" + suling + '}';
    }
    
    
}
