public abstract class Hewan {

    protected String nama;
    protected String habitat;

    public Hewan(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    public abstract String suara();
}
