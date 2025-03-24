package Tugas;
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asalKota;
    private static int counterPetani;

    public String getAsalKota(){
        return asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String kota){
        asalKota=kota;
    }
    
    public Petani(String nama, LocalDate tglMulai, String alamat, double pendapatan, String asalKota){
        super(nama,tglMulai,alamat,pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }
    public Petani(){
        this("",null,"",0.0,"");
        counterPetani++;
    }
    public int hitungMasaKerja(){
        Period selisih = Period.between(LocalDate.now(),getTglMulai());
        return selisih.getYears()*365 + selisih.getMonths()*30 + selisih.getDays()+1;
    }

    public double hitungPajak(){
        return 0;
    }

}
