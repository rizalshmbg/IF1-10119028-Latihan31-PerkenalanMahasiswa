/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan identitas
 *                     Mahasiswa baru dengan konsep OOP 
 */
public class IF110119028Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10119010";
        mahasiswa1.nama = "Rizal Sihombing";
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110269";
        mahasiswa2.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110270";
        mahasiswa3.nama = "Indra Tiola";
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "101190269";
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        
        mahasiswa1.perkenalanDiri();
        mahasiswa2.perkenalanDiri();
        mahasiswa3.perkenalanDiri();
        mahasiswa4.perkenalanDiri();
    }
    
}
