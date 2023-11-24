public class BintangLima extends Hotel {

    public BintangLima(String nama, String alamat) {
        super(nama, alamat, 5);
    }

    @Override
    public String getJenisHotel() {
        return "Hotel bintang lima";
    }

    @Override
    public double getTarifKamar() {
        return 1000000;
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
