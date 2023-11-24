public class Kapal extends Transportasi {

    public Kapal(String nama) {
        super(nama);
    }

    @Override
    public void jalan() {
        System.out.println("\nKapal " + nama + " berlayar dengan kecepatan 50 km/jam");
    }
}
