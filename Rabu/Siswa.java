package Rabu;

import java.util.*;
import java.io.*;

public class Siswa {
    static Scanner input = new Scanner(System.in);

    //ArrayList declare
    ArrayList<String>namaSiswa = new ArrayList<String>();
    ArrayList<String>alamatSiswa = new ArrayList<String>();
    ArrayList<String>telefonSiswa = new ArrayList<String>();
    ArrayList<Boolean>statusSiswa = new ArrayList<Boolean>();
    ArrayList<Integer>idSiswa = new ArrayList<Integer>();

    public Siswa(){

        //Siswa 1
        this.namaSiswa.add("Abizar");
        this.alamatSiswa.add("Ngawi");
        this.telefonSiswa.add("08321556586");
        this.idSiswa.add(1038);
        this.statusSiswa.add(true);

        //Siswa 2
        this.namaSiswa.add("Abdul");
        this.alamatSiswa.add("Jombang");
        this.telefonSiswa.add("08321593638");
        this.idSiswa.add(2738);
        this.statusSiswa.add(false);

        //Siswa 3
        this.namaSiswa.add("Nabil");
        this.alamatSiswa.add("Malang");
        this.telefonSiswa.add("0832150283");
        this.idSiswa.add(1937);
        this.statusSiswa.add(true);

        //Siswa 4
        this.namaSiswa.add("Nur");
        this.alamatSiswa.add("Sidoarjo");
        this.telefonSiswa.add("08329373920");
        this.idSiswa.add(7352);
        this.statusSiswa.add(false);       
    }

    public void getSiswa(){
        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();
        //Find index of nama
        int index = this.namaSiswa.indexOf(nama);
        if (index == -1){
            System.out.println("Nama tidak ditemukan");
        } else {
            System.out.println("Nama anda adalah: " + this.namaSiswa.get(index));
            System.out.println("Alamat anda adalah: " + this.alamatSiswa.get(index));
            System.out.println("Telefon anda adalah: " + this.telefonSiswa.get(index));
            System.out.println("Id anda adalah: " + this.idSiswa.get(index));
            if (this.statusSiswa.get(index)){
                System.out.println("Status anda adalah: Aktif");
            } else {
                System.out.println("Status anda adalah: Tidak Aktif");
            }
        }
    }
}