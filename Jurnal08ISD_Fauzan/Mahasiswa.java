package hashmapp;

import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan NIM: ");
        nim = s.nextLine();
        System.out.println("Masukkan Nama: ");
        nama = s.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas = s.next();
    }

    @Override
    public String toString() {
        return "NIM : " + nim + " Nama : " + nama + " Kelas : " + kelas + " ";
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
}
