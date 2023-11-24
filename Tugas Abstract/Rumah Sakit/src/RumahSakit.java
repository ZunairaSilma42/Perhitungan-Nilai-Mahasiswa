public abstract class RumahSakit {

    protected String nama;
    protected String alamat;

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public abstract String berikanPelayanan();
}
