public class Lumut extends Tumbuhan {

    public Lumut(String nama, String jenis, int tinggi) {
        super(nama, jenis, tinggi);
    }

    @Override
    public void tumbuh() {
        System.out.println("\n" + nama + " tumbuh di tempat lembap");
        System.out.println("Termasuk jenis tumbuhan " + jenis);
        System.out.println("Memiliki tinggi " + tinggi + " m");
    }
}
