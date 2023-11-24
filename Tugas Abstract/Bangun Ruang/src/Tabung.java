public class Tabung extends BangunRuang {

    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
