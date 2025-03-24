package Tugas;
import java.time.LocalDate;
import java.time.Period;
public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS;

    public String getNIP(){
        return nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
    
    public void setNIP(String nip){
        this.nip = nip;
    }

    public PNS(String nama, LocalDate tglMulai, String alamat, double pendapatan, String nip){
        super(nama,tglMulai,alamat,pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(){
        this("",null,"",0.0,"");
        counterPNS++;
    }
    public int hitungMasaKerja(){
        Period selisih = Period.between(LocalDate.now(),getTglMulai());
        return selisih.getYears()*365 + selisih.getMonths()*30 + selisih.getDays()+2;
    }

    public double hitungPajak(){
        return (10/100) * getPendapatan();
    }


}
