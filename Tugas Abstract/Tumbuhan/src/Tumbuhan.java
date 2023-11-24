public abstract class Tumbuhan {

    protected String nama;
    protected String jenis;
    protected int tinggi;

    public Tumbuhan(String nama, String jenis, int tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    public abstract void tumbuh();
}
