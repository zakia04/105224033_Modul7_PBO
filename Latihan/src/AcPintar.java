//no 1
public class AcPintar extends PerangkatPintar {
    @Override
    public void aktifkan() {
        super.aktifkan();
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }
    //no 4
    public void aturSuhu(int suhu) {
        System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat");
    }
}









