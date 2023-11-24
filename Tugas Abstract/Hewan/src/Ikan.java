public class Ikan extends Hewan {

    public Ikan(String nama) {
        super(nama, "Air");
    }

    @Override
    public String suara() {
        return "Bloop Bloop!";
    }
}
