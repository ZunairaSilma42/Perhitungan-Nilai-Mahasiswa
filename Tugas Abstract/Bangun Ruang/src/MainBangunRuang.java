public class MainBangunRuang {

    public static void main(String[] args) {

        Kubus kubus = new Kubus(10);
        System.out.println("\nVolume kubus dengan sisi 10 cm: " + kubus.getVolume());

        Bola bola = new Bola(5);
        System.out.println("\nVolume bola dengan jari-jari 5 cm: " + bola.getVolume());

        Tabung tabung = new Tabung(5, 10);
        System.out.println("\nVolume tabung dengan jari-jari 5 cm dan tinggi 10 cm: " + tabung.getVolume());
    }
}
