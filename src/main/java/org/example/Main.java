package org.example;
public class Main {
    public static void main(String[] args) {
        Buku a, b = new Buku();
        a = new Buku(" Siaga Merah "," Alistair Maclean ");
        b = new Buku();
        a.cetakKelayar();
        b.cetakKelayar();
    }
}
//public static void main (String[] args) {
//    Buku a = new Buku();
//    a.setNilai("Jurassic Park", "Michael", 21);
//    a.cetakKeLayar();
//}
