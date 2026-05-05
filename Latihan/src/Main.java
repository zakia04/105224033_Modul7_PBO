import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PerangkatPintar> daftar = new ArrayList<>();
        daftar.add(new LampuPintar());
        daftar.add(new AcPintar());
        for (PerangkatPintar p : daftar) {
            p.aktifkan();
            //no 4
            if (p instanceof AcPintar){
                ((AcPintar) p).aturSuhu(22);
            }
            
        }

        PerangkatPintar alat1 = new LampuPintar();
        LampuPintar alat2 = (LampuPintar) alat1; //perbaikan kode menggunakan downcasting
        alat2.aturKecerahan(75, "Putih"); //outputnya akan menjadi level 75 dan warna cahaya putih
        
    }
}



/* no 3 =
karena dalam perulangannya objek yang di buat dari subclass dengan menggunakan tipe data 
dari superclassnya, sehingga ketika di jalankan maka hasil yang keluar berdasarkan dari objek yang di deklarasi kan.
karena dari superclassnya yaitu PerangkatPintar hanya memiliki method aktifkan() yang di override oleh subclassnya, maka hasil yang keluar ketika di jalankan adalah hasil dari method aktifkan() yang di override oleh subclassnya yaitu LampuPintar dan AcPintar.

no 5 =
karena method aturKecerahan() yang di deklarasi kan dalam class LampuPintar tidak ada dalam class PerangkatPintar, sehingga ketika di jalankan maka hasil yang keluar adalah error karena method aturKecerahan() tidak dapat di akses melalui objek dengan tipe data PerangkatPintar.   
*/

