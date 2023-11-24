public class Bola extends BangunRuang {

    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * jariJari * jariJari * jariJari) / 3;
    }
}
