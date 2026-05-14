//superclass berupa layanan ekspedisi
public class LayananEkspedisi { 
    //ini merupakan atribut dari superclass menggunakan access modifier protected agar bisa diakses oleh subclass 
    protected String nomorResi;     
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    //konstruktor untuk menginisialisasi semua atribut layanan ekspedisi
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    //membandingkan berat aktual dengan berat volumetrik
    public double hitungBeratEfektif(){
        double volumetrik = (panjang * lebar * tinggi) / 6000;
        if (volumetrik > this.beratAktualKg){ // jika berat volumetrik lebih besar, maka gunakan berat volumetrik
            return volumetrik;
        } else { // jika berat aktual lebih besar, maka gunakan berat aktual
            return this.beratAktualKg;
        }
    }
    
    //method untuk mencetak nomor resi dan berat efektif
    public void cetakResi(){
        System.out.println("Nomor Resi: " + this.nomorResi);
        System.out.println("Berat Efektif (kg): " + hitungBeratEfektif());
    }
    
    //method untuk menghitung ongkir, akan dioverride oleh subclass
    public double hitungOngkir(){
        return 0.0;
    }
}
