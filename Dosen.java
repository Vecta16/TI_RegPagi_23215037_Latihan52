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
 * Nim : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang menampilkan nama dan profesi
 *                     sebagai dosen dan mahasiswa.
 */
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Magi Abid Zuama umur 27 tahun sedang mengajar matakuliah PBO");
    }
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
        
    }
    
    
    
}
