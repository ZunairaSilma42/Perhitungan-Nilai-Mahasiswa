public class BintangTiga extends Hotel {

    public BintangTiga(String nama, String alamat) {
        super(nama, alamat, 3);
    }

    @Override
    public String getJenisHotel() {
        return "Hotel bintang tiga";
    }

    @Override
    public double getTarifKamar() {
        return 500000;
    }

    @Override
    public void cetakInfoHotel() {
        System.out.println("Nama hotel: " + nama);
        System.out.println("Alamat hotel: " + alamat);
        System.out.println("Jumlah bintang: " + bintang);
        System.out.println("Jenis hotel: " + getJenisHotel());
        System.out.println("Tarif kamar: " + getTarifKamar());
    }
}
