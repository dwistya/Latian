/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latian;

/**
 *
 * @author LENOVO
 */
public class TesSiswa extends Siswa {
    public static void main(String[] args) {
        Siswa identitas = new Siswa();
        identitas.setNama("Dwi Setya Arianza Nuzzaman");
        identitas.setKelas("XR4");
        identitas.setAbsen(16);
        identitas.setTTL("Lumajang,11 juli 2004");
        identitas.setBeratbadan(60);
        
        System.out.println("Nama saya: "+identitas.getNama());
        System.out.println("Kelas saya: "+identitas.getKelas());
        System.out.println("Absen saya: "+identitas.getAbsen());
        System.out.println("TTL saya: "+identitas.getTTL());
        System.out.println("Beratbadan saya: "+identitas.getBeratbadan());


    }
}
