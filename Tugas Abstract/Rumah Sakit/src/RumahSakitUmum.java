public class RumahSakitUmum extends RumahSakit {

    public RumahSakitUmum(String nama, String alamat) {
        super(nama, alamat);
    }

    @Override
    public String berikanPelayanan() {
        return "Rumah sakit umum yang memberikan pelayanan umum";
    }
}
