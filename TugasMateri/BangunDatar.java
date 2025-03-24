public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar= 0;
    
    public BangunDatar() {
        this(0,"","");
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int sisi) {
        jmlSisi = sisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: "+ jmlSisi);
        System.out.println("Warna: "+ warna);
        System.out.println("Border: "+border);
    }

    final public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: "+ counterBangunDatar);
    }
    public abstract double getLuas();
    public abstract double getKeliling();

}



/* 
 *   Soal 1
 *   Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
 *   bangun datar yang berbeda?
 *   Jawab: Bisa, karena method isEqualLuas() merupakan method yang dibuat pada superclass BangunDatar
 *   yang dapat digunakan untuk membandingkan objek bangun datar yang berbeda.
 *
 *   Soal 2
 *   Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
 *   dan isEqualKeliling pada class BangunDatar? Mengapa?
 *   Jawab: Tidak bisa, karena method isEqualLuas() dan isEqualKeliling() harus diimplementasikan pada subclass
 *   karena setiap bangun datar memiliki rumus luas dan keliling yang berbeda-beda. Sehingga, BangunDatar harus
 *   dijadikan sebagai abstract class agar method-method tersebut dapat diimplementasikan pada subclass.
 *
 *   Soal 3
 *   Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
 *   Jawab: Banyak kelebihan yaitu memungkinkan method abstract untuk implementasi yang spesifik pada tiap subclassnya, mencegah instansiasi
 *   BangunDatar karena merupakan suatu konsep(template), dan supaya subclass konsisten dalam implementasi method yang diwarisi dari superclass.
 */
/*
 * Jawaban soal
 * 1. keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas
 * dalam interface IResize dibanding dijadikan sebagai abstract method
 * dalam class BangunDatar adalah karena kita tidak perlu memakai semua method
 * dalam abstract class BangunDatar. Hal ini membuat kodingan menjadi lebih efektif
 * 
 */

