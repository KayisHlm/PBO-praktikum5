package Tugas;
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha;

    public String getNPWP() {
        return npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    public Pengusaha(String nama, LocalDate tglMulai, String alamat, double pendapatan, String npwp ){
        super(nama,tglMulai,alamat,pendapatan);
        this.npwp=npwp;
        counterPengusaha++;
    }
    public Pengusaha(){
        this("",null,"",0.0,"");
        counterPengusaha++;
    }
    public int hitungMasaKerja(){
        Period selisih = Period.between(LocalDate.now(),getTglMulai());
        return selisih.getYears()*365 + selisih.getMonths()*30 + selisih.getDays()+5;
    }

    public double hitungPajak(){
        return (15/100) * getPendapatan();
    }

}
