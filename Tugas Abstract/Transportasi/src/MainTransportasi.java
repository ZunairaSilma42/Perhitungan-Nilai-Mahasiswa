public class MainTransportasi {

    public static void main(String[] args) {

        Mobil mobil = new Mobil("Toyota");
        mobil.jalan();

        Pesawat pesawat = new Pesawat("Air Asia 107U");
        pesawat.jalan();

        Kapal kapal = new Kapal("Going Merry");
        kapal.jalan();
    }
}
