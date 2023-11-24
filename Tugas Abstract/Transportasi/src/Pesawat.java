public class Pesawat extends Transportasi {

    public Pesawat(String nama) {
        super(nama);
    }

    @Override
    public void jalan() {
        System.out.println("\nPesawat " + nama + " terbang dengan ketinggian 10.000 meter");
    }
}
