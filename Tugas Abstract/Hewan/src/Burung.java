public class Burung extends Hewan {

    public Burung(String nama) {
        super(nama, "Udara");
    }

    @Override
    public String suara() {
        return "Chirrp Chirrp!";
    }
}
