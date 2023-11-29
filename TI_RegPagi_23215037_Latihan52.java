/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulana 
 * NIM : 23215037 
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang menampilkan nama dan profesi
 *                     sebagai dosen dan mahasiswa.
 */
public class TI_RegPagi_23215037_Latihan52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 23215037");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
