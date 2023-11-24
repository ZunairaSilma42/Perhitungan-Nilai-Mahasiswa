public class BandaraMiliter extends Bandara {

    public BandaraMiliter(String nama, String kota) {
        super(nama, kota);
    }

    @Override
    public String getJenisBandara() {
        return "Bandara militer";
    }

    @Override
    public void cetakInfoBandara() {
        System.out.println("Nama bandara: " + nama);
        System.out.println("Kota bandara: " + kota);
        System.out.println("Jenis bandara: " + getJenisBandara());
    }
}
