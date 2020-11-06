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
 *                     Mahasiswa baru dengan konsep OO
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalanDiri() {
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
}
