public class Pohon extends Tumbuhan {

    public Pohon(String nama, String jenis, int tinggi) {
        super(nama, jenis, tinggi);
    }

    @Override
    public void tumbuh() {
        System.out.println("\n" + nama + " tumbuh tinggi");
        System.out.println("Termasuk jenis tumbuhan " + jenis);
        System.out.println("Memiliki tinggi " + tinggi + " m");
    }
}
