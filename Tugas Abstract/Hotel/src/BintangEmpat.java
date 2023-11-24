public class BintangEmpat extends Hotel {

    public BintangEmpat(String nama, String alamat) {
        super(nama, alamat, 4);
    }

    @Override
    public String getJenisHotel() {
        return "Hotel bintang empat";
    }

    @Override
    public double getTarifKamar() {
        return 750000;
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
