public class RumahSakitJiwa extends RumahSakit {

    protected String spesialisasi;

    public RumahSakitJiwa(String nama, String alamat) {
        super(nama, alamat);
    }

    @Override
    public String berikanPelayanan() {
        return "Rumah sakit jiwa yang memberikan pelayanan gangguan kejiwaan";
    }
}
