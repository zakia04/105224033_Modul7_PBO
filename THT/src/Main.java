//main class untuk menjalankan program ekspedisi
import java.util.ArrayList; //import ArrayList untuk menyimpan daftar layanan ekspedisi
public class Main {
    public static void main(String[] args)throws Exception{
        ArrayList<LayananEkspedisi> daftar = new ArrayList<>(); //membuat ArrayList untuk menyimpan objek layanan ekspedisi
        daftar.add(new LayananReguler("REG-11", 2, 50, 50, 50)); //menambahkan objek layanan reguler ke dalam daftar
        daftar.add(new LayananExpress("EXP-22", 5, 10, 10, 10)); //menambahkan objek layanan express ke dalam daftar
        daftar.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100)); //menambahkan objek layanan internasional ke dalam daftar
        //menghitung total pendapatan dari semua layanan ekspedisi dengan iterasi menggunakan for-each loop
        double totalPendapatan = 0.0;
        for (LayananEkspedisi i : daftar){
            i.cetakResi(); //mencetak nomor resi dan berat efektif untuk setiap layanan ekspedisi
            totalPendapatan += i.hitungOngkir(); //menambahkan ongkir dari setiap layanan ekspedisi ke total pendapatan
            if (i instanceof LayananReguler) { //jika objek i merupakan instance dari LayananReguler, maka lakukan casting untuk memanggil method hitungOngkir dengan parameter member dan jarak
                double hargaMember = ((LayananReguler) i).hitungOngkir(true, 25);
                System.out.println("Harga Member: Rp" + hargaMember); //mencetak harga member untuk layanan reguler dengan jarak 25 km
            } else if (i instanceof LayananExpress) { //jika objek i merupakan instance dari LayananExpress, maka lakukan casting untuk memanggil method klaimAsuransi dengan nilai barang 1500000
                ((LayananExpress) i).klaimAsuransi(1500000);
            } else { //jika objek i merupakan instance dari LayananInternasional, maka lakukan casting untuk memanggil method cetakManifest
                ((LayananInternasional) i).cetakManifest();
            }
            System.out.println("------------------------------");
        }
        System.out.println("Total Pendapatan: " + totalPendapatan); //mencetak total pendapatan dari semua layanan ekspedisi
    }
}

