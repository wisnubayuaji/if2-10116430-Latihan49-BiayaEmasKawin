/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class Emas {
    private int harga;
    private double beli;
    
    public int getHarga() {
        System.out.println("Harga Emas Per-bulan ini = Rp "+harga);
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public double getBeli() {
        System.out.println("Beli Per-gram = "+beli);
        return beli;
    }
    public void setBeli(double beli) {
        this.beli = beli;
    }
    
    public double Bayar(int val1, double val2) {
        val1 = harga;
        val2 = beli;
        int bayar = (int) (val1*val2);
        System.out.println("Total Harga Emas = Rp "+bayar);
        return bayar;
    }
    
}
