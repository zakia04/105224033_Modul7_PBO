//subclass LayananInternasional mewarisi LayananEkspedisi
public class LayananInternasional extends LayananEkspedisi {
    String negaraTujuan; //atribut tambahan untuk layanan internasional
    double nilaiBarangUSD;
    //konstruktor memanggil konstruktor superclass melalui super() dan menginisialisasi atribut tambahan
    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }
    //mengoverride method hitungOngkir untuk menghitung ongkir dengan tarif dasar dan pajak bea cukai
    @Override
    public double hitungOngkir(){
        double ongkir = hitungBeratEfektif() * 200000; // Tarif dasar untuk layanan internasional
        double pajakBeaCukai = 0;
        if (this.nilaiBarangUSD > 50){ //if nilai barang lebih dari $50, maka dikenakan pajak bea cukai 20% dari ongkir
            pajakBeaCukai = 0.2* ongkir; 
        }
        return ongkir + pajakBeaCukai; // Total ongkir dengan pajak bea cukai
    }
    //method untuk mencetak manifest internasional dengan negara tujuan dan nilai barang
    public void cetakManifest(){ 
        System.out.println("Manifest Internasional ke " + this.negaraTujuan + " deklarasi nilai: $" + this.nilaiBarangUSD);
    }
}
