public abstract class Hotel {

    protected String nama;
    protected String alamat;
    protected int bintang;

    public Hotel(String nama, String alamat, int bintang) {
        this.nama = nama;
        this.alamat = alamat;
        this.bintang = bintang;
    }

    public abstract String getJenisHotel();

    public abstract double getTarifKamar();

    public abstract void cetakInfoHotel();
}
