public class BandaraInternasional extends Bandara {

    public BandaraInternasional(String nama, String kota) {
        super(nama, kota);
    }

    @Override
    public String getJenisBandara() {
        return "Bandara internasional";
    }

    @Override
    public void cetakInfoBandara() {
        System.out.println("Nama bandara: " + nama);
        System.out.println("Kota bandara: " + kota);
        System.out.println("Jenis bandara: " + getJenisBandara());
    }
}
