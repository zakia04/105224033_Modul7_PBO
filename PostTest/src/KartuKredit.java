public class KartuKredit extends MetodePembayaran {
    @Override
    void bayar(double nominal){
        super.bayar(nominal);
        System.out.println("Memotong saldo Kartu Kredit sebesar RP" + nominal);
    }

    void verifikasiPIN(String pin){
        System.out.println("Memverifikasi PIN Kartu Kredit " + pin + " BERHASIL.");
    }
    
}
