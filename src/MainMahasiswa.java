
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    Mahasiswa mhs = new Mahasiswa();
    
    System.out.println("Masukan Nama Kamu");
    mhs.setNama(input.next());
    System.out.println("Masukan Alamat Kamu");
    mhs.setAlamat(input.next());
    System.out.println("Masukan Umur Kamu");
    mhs.setUmur(input.next());
    System.out.println("Masukan NRP Kamu");
    mhs.setNrp(input.next());
    
        System.out.println(mhs.toString());
    }
    }
    

