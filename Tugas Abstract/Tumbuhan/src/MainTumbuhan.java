public class MainTumbuhan {

    public static void main(String[] args) {

        Pohon pohon = new Pohon("Pohon Beringin", "Pinus", 100);
        pohon.tumbuh();

        Rumput rumput = new Rumput("Rumput Gajah", "Poaceae", 50);
        rumput.tumbuh();

        Lumut lumut = new Lumut("Lumut Daun", "Bryophyta", 10);
        lumut.tumbuh();
    }
}
