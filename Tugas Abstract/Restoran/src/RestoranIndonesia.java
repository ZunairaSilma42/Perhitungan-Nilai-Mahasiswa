public class RestoranIndonesia extends Restoran {

    public RestoranIndonesia(String nama, String alamat) {
        super(nama, alamat, "Indonesia");
    }

    @Override
    public String getJenisMenu() {
        return "Menu Indonesia";
    }

    @Override
    public void cetakInfoRestoran() {
        System.out.println("Nama restoran: " + nama);
        System.out.println("Alamat restoran: " + alamat);
        System.out.println("Jenis restoran: " + jenisRestoran);
        System.out.println("Jenis menu: " + getJenisMenu());
    }
}
