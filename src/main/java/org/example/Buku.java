package org.example;
public class Buku {
    private String judul;
    private String pengarang;

    public Buku(){
        judul = "Tidak diketahui ";
        pengarang = "Tidak diketahui";
    }
    public Buku(String judul, String pengarang){
        System.out.println("Konstruktor dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }

    void cetakKelayar(){
        if (judul == null && pengarang == null)
        return;
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }

//    private String judul;
//    private String pengarang;
//    private int jumlah;
//    public void setNilai(String judul, String pengarang, int jumlah){
//        this.judul = judul;
//        this.pengarang = pengarang;
//        this.jumlah = jumlah;
//
//    }
//    void cetakKeLayar()
//    {
//        System.out.println("Judul : " + judul);
//        System.out.println("Pengarang : " + pengarang);
//        System.out.println("Jumlah : " + jumlah);
//    }
}
