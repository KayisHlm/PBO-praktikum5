
public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }
    public Persegi() {
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi*sisi;
    }

    public double getKeliling() {
        return 4*sisi;
    }

    public double getDiagonal() {
        return Math.sqrt((Math.pow(sisi,2) + Math.pow(sisi,2)));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: "+sisi);
    }

    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }
    @Override
    public void zoomOut(){
        sisi = sisi* 0.9;
    }
    @Override
    public void zoom(int percent) {
        sisi = sisi*percent/100;
    }
}
