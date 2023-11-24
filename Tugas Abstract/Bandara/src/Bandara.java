public abstract class Bandara {

    protected String nama;
    protected String kota;

    public Bandara(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    public abstract String getJenisBandara();

    public abstract void cetakInfoBandara();
}
