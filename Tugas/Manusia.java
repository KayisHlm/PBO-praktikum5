package Tugas;
import java.time.LocalDate;
abstract class Manusia {
    private String nama;
    private LocalDate tglMulai;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    public String getNama(){
        return nama;
    }
    public LocalDate getTglMulai(){
        return tglMulai;
    }
    public String getAlamat(){
        return alamat;
    }
    public double getPendapatan() {
        return pendapatan;
    }
    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulai(LocalDate tgl) {
        tglMulai = tgl;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public Manusia(String nama, LocalDate tglMulai, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulai = tglMulai;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    public Manusia(){
        this("",null,"",0.0);
    }
    public void cetakInfo() {
        System.out.println("Nama\t: "+getNama());
        System.out.println("Tanggal Mulai Kerja\t: "+getTglMulai());
        System.out.println("Alamat\t: "+getAlamat());
        System.out.println("Pendapatan\t: "+getPendapatan());
        System.out.println("Jumlah Manusia\t: "+getCounterMns());
    }
    public abstract int hitungMasaKerja();

}