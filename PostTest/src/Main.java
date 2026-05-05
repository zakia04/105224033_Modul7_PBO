import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MetodePembayaran> Payment = new ArrayList<>();
        Payment.add(new Ewallet());
        Payment.add(new KartuKredit());

        for (MetodePembayaran p : Payment) {
            if (p instanceof Ewallet){
                ((Ewallet) p).bayar(100000);
                ((Ewallet) p).bayar(50000, "081234567890");
            } else if (p instanceof KartuKredit){
                ((KartuKredit) p).bayar(150000);
                ((KartuKredit) p).verifikasiPIN("329471");
            } else {
                p.bayar(200000);
            }
        }
    }
}
