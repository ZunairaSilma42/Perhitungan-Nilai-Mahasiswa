public class RestoranWestern extends Restoran {

    public RestoranWestern(String nama, String alamat) {
        super(nama, alamat, "Western");
    }

    @Override
    public String getJenisMenu() {
        return "Menu Western";
    }

    @Override
    public void cetakInfoRestoran() {
        System.out.println("Nama restoran: " + nama);
        System.out.println("Alamat restoran: " + alamat);
        System.out.println("Jenis restoran: " + jenisRestoran);
        System.out.println("Jenis menu: " + getJenisMenu());
    }
}
