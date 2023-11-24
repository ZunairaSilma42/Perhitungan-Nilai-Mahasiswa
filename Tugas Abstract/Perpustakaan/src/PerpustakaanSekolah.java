class PerpustakaanSekolah extends Perpustakaan {

    public PerpustakaanSekolah(String nama) {
        super(nama);
    }

    @Override
    public String alamat() {
        return "Jl. Gatot Subroto No. 50";
    }
}