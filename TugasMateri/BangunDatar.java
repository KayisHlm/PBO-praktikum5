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
 * Jawaban soal
 * 1. keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas
 * dalam interface IResize dibanding dijadikan sebagai abstract method
 * dalam class BangunDatar adalah karena kita tidak perlu memakai semua method
 * dalam abstract class BangunDatar. Hal ini membuat kodingan menjadi lebih efektif
 * 
 */