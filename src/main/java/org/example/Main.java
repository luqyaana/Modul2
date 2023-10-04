package org.example;

public class Main {
    public static void main (String[] args) {
        Buku a = new Buku();
        Buku b = new Buku();
        a = new Buku(" Siaga Merah "," Alistair Maclean ");
        b = new Buku();
        a.cetakKelayar();
        b.cetakKelayar();
//        Buku a = new Buku();
//        a.setNilai("Jurassic Park", "Michael", 21);
//        a.cetakKeLayar();
    }
}