public abstract class Restoran {

    protected String nama;
    protected String alamat;
    protected String jenisRestoran;

    public Restoran(String nama, String alamat, String jenisRestoran) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisRestoran = jenisRestoran;
    }

    public abstract String getJenisMenu();

    public abstract void cetakInfoRestoran();
}
