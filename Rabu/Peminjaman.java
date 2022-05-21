package Rabu;

import java.util.*;
import java.io.*;
import Rabu.Buku;

public class Peminjaman implements Buku {
    static Scanner input = new Scanner(System.in);

    //Declare ArrayList
    ArrayList<String>namaBuku = new ArrayList<String>();
    ArrayList<Integer>nomor = new ArrayList<Integer>();
    ArrayList<Integer>idBuku = new ArrayList<Integer>();
    ArrayList<Integer>Banyak = new ArrayList<Integer>();
    ArrayList<Integer>Stok = new ArrayList<Integer>();
    ArrayList<Integer>Harga = new ArrayList<Integer>();

    //Constructor
    public Peminjaman() {
        this.nomor.add(0);
        this.namaBuku.add("Matematika");
        this.idBuku.add(2313);
        this.Stok.add(20);
        this.Harga.add(120000);

        this.nomor.add(1);
        this.namaBuku.add("Bahasa Inggris");
        this.idBuku.add(2937);
        this.Stok.add(10);
        this.Harga.add(150000);

        this.nomor.add(2);
        this.namaBuku.add("Bahasa Indonesia");
        this.idBuku.add(2735);
        this.Stok.add(15);
        this.Harga.add(100000);

        this.Banyak.add(0);
        this.Banyak.add(0);
        this.Banyak.add(0);
    }

    //Override
    @Override
    public void tampilBuku() {
        System.out.println("--DAFTAR BUKU--");
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(0));
        System.out.println("Nama buku: " + namaBuku.get(0));
        System.out.println("Id buku: " + idBuku.get(0));
        System.out.println("Stok buku: " + Stok.get(0));
        System.out.println("Harga buku: " + Harga.get(0));
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(1));
        System.out.println("Nama buku: " + namaBuku.get(1));
        System.out.println("Id buku: " + idBuku.get(1));
        System.out.println("Stok buku: " + Stok.get(1));
        System.out.println("Harga buku: " + Harga.get(1));
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(2));
        System.out.println("Nama buku: " + namaBuku.get(2));
        System.out.println("Id buku: " + idBuku.get(2));
        System.out.println("Stok buku: " + Stok.get(2));
        System.out.println("Harga buku: " + Harga.get(2));
        System.out.println("");
    }
    @Override
    public void pinjambuku() {
        tampilBuku();
        System.out.println("");
        System.out.println("Masukkan nomor Buku yang ingin dipinjam: ");
        int id = input.nextInt();
        System.out.println("Berapa banyak buku yang ingin anda pinjam: ");
        int banyak = input.nextInt();
        System.out.println("Buku yang dipinjam: " + namaBuku.get(id));
        System.out.println("Stok buku saat ini: " + Stok.get(id));
        System.out.println("Yakin ingin meminjam buku ini? (Y/N)");
        String jawab = input.next();
        if (jawab.equalsIgnoreCase("Y") && banyak <= Stok.get(id)) {
            System.out.println("BUKU BERHASIL DIPINJAM SEBANYAK " + banyak + " BUKU" + " DAN ANDA TIDAK BOLEH MEMINJAM LAGI SEBELUM MENGEMBALIKAN BUKU NYA");
            System.out.println("Stok buku setelah dipinjam: " + (Stok.get(id) - banyak));
        }else if(jawab.equalsIgnoreCase("N")){
            System.out.println("BUKU TIDAK DIPINJAM");
        }else if(banyak > Stok.get(id)){
            System.out.println("BUKU TIDAK DIPINJAM KARENA STOK TIDAK MENCUKUPI");
        }
    }
    @Override
    public void kembalikanbuku() {
        System.out.println("");
        System.out.println("Masukkan nomor Buku yang ingin dikembalikan: ");
        int id = input.nextInt();
        System.out.println("Berapa banyak buku yang ingin anda kembalikan: ");
        int banyak = input.nextInt();
        System.out.println("Buku yang dikembalikan: " + namaBuku.get(id));
        System.out.println("Stok buku saat ini: " + Stok.get(id));
        System.out.println("Yakin ingin mengembalikan buku ini? (Y/N)");
        String jawab = input.next();
        if (jawab.equalsIgnoreCase("Y")) {
            System.out.println("BUKU BERHASIL DIKEMBALIKAN SEBANYAK " + banyak + " BUKU");
            System.out.println("Stok buku setelah dikembalikan: " + (Stok.get(id) + banyak));
        }      
    }
    @Override
    public void belibuku() {
        System.out.println("");
        System.out.println("Masukkan nomor Buku yang ingin anda beli: ");
        int id = input.nextInt();
        System.out.println("Berapa banyak buku yang ingin anda beli: ");
        int banyak = input.nextInt();
        do {
            if (banyak > Stok.get(id)) {
                System.out.println("Stok buku tidak mencukupi");
                break;
            }
        } while (banyak > Stok.get(id));              
        System.out.println("Yakin ingin membeli buku ini? (Y/N)");
        String jawab = input.next();
        if (jawab.equalsIgnoreCase("Y") && banyak <= Stok.get(id))  {
            int total = Harga.get(id) * banyak;
            System.out.println("Buku yang  akan dibeli: " + namaBuku.get(id));
            System.out.println("Stok buku saat ini: " + Stok.get(id));
            System.out.println("Harga buku: " + Harga.get(id));
            System.out.println("");
            System.out.println("Total harga: " + total);
            System.out.println("Silahkan membayar sejumlah "+total);
            int uang = input.nextInt();
            if(uang <= total){
                System.out.println("Uang anda cukup");
                System.out.println("BUKU BERHASIL DIBAYAR");
                System.out.println("Stok buku setelah dibeli: " + (Stok.get(id) - banyak));
            }else{
                System.out.println("Uang anda tidak cukup");
            }
        }
    }
    @Override
    public void lihatbuku() {
        System.out.println("--DAFTAR BUKU KAMI--");
        System.out.println("");
        for (int i = 0; i < namaBuku.size(); i++) {
            System.out.println("Nomor buku: " + nomor.get(i));
            System.out.println("Nama buku: " + namaBuku.get(i));
            System.out.println("Id buku: " + idBuku.get(i));
            System.out.println("Stok buku: " + Stok.get(i));
            System.out.println("Harga buku: " + Harga.get(i));
            System.out.println("");
        }
    }

}
