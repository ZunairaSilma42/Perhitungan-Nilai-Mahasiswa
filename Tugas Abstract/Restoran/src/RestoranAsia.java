public class RestoranAsia extends Restoran {

    public RestoranAsia(String nama, String alamat) {
        super(nama, alamat, "Asia");
    }

    @Override
    public String getJenisMenu() {
        return "Menu Asia";
    }

    @Override
    public void cetakInfoRestoran() {
        System.out.println("Nama restoran: " + nama);
        System.out.println("Alamat restoran: " + alamat);
        System.out.println("Jenis restoran: " + jenisRestoran);
        System.out.println("Jenis menu: " + getJenisMenu());
    }
}
