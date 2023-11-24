public class MainHewan {

    public static void main(String[] args) {
        Sapi sapi = new Sapi("Sapi");
        System.out.println("\nSapi adalah hewan yang hidup di " + sapi.habitat + " dan mengeluarkan suara " + sapi.suara());

        Burung burung = new Burung("Burung");
        System.out.println("\nBurung adalah hewan yang hidup di " + burung.habitat + " dan mengeluarkan suara " + burung.suara());

        Ikan ikan = new Ikan("Ikan");
        System.out.println("\nIkan adalah hewan yang hidup di " + ikan.habitat + " dan mengeluarkan suara " + ikan.suara() + "\n");
    }
}
