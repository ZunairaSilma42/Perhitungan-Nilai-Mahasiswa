public class MainBangunDatar {

    public static void main(String[] args) {

        // Persegi
        Persegi persegi = new Persegi(10);
        System.out.println("\nLuas persegi dengan sisi 10 cm: " + persegi.getLuas());

        // Segitiga
        Segitiga segitiga = new Segitiga(5, 10);
        System.out.println("\nLuas segitiga dengan alas 5 cm dan tinggi 10 cm: " + segitiga.getLuas());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("\nLuas lingkaran dengan jari-jari 5 cm: " + lingkaran.getLuas());
    }
}
