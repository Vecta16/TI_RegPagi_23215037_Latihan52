/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulna 
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang menampilkan nama dan profesi
 *                     sebagai dosen dan mahasiswa.
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Alan umur 23 tahun sedang balajar dikelas PBO2");  
    } 
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
