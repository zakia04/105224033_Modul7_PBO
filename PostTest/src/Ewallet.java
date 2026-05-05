public class Ewallet extends MetodePembayaran {
    @Override
    void bayar(double nominal){
        super.bayar(nominal);
        System.out.println("Memotong saldo E-Wallet sebesar RP" + nominal);
    }

    void bayar(double nominal, String nomorHP){
        System.out.println("Memotong saldo E-Wallet sebesar RP" + nominal + " dari nomor HP " + nomorHP);
    }
}