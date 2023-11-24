public class Lingkaran extends BangunDatar {

    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
