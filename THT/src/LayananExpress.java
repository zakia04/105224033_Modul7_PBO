//subclass LayananExpress mewarisi LayananEkspedisi
public class LayananExpress extends LayananEkspedisi {
    //konstruktor memanggil konstruktor superclass melalui super()
    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }
    //mengoverride method hitungOngkir untuk menghitung ongkir dengan tarif dasar
    @Override
    public double hitungOngkir(){
        return hitungBeratEfektif() * 30000; // Tarif dasar untuk layanan express lebih tinggi
    }
    //method untuk klaim asuransi dengan nilai barang sebagai parameter
    public void klaimAsuransi(double nilaiBarang) {
        if (nilaiBarang > 1000000) { 
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " sedang diproses prioritas");
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja");
        }
    }
}
