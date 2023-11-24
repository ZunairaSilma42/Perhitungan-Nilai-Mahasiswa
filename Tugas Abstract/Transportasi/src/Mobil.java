public class Mobil extends Transportasi {

    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void jalan() {
        System.out.println("\nMobil " + nama + " berjalan dengan kecepatan 100 km/jam");
    }
}
