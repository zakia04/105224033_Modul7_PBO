//subclass LayananReguler mewarisi LayananEkspedisi
public class LayananReguler extends LayananEkspedisi {
    //konstruktor memanggil konstruktor superclass melalui super()
    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }
    //mengoverride method hitungOngkir untuk menghitung ongkir dengan tarif dasar
    @Override
    public double hitungOngkir(){
        return hitungBeratEfektif() * 15000;
    }
    //Overloading method hitungOngkir dengan parameter member dan jarak
    public double hitungOngkir(boolean isMember, int jarakKM){
        double tarifDasar = hitungOngkir();
        if (isMember){
            tarifDasar -= 0.1 * tarifDasar; // Diskon 10% untuk member
        }
        double surcharge = 500 * jarakKM; // Tambahan biaya berdasarkan jarak
        return tarifDasar + surcharge; // Total ongkir dengan surcharge jarak
    }

}
