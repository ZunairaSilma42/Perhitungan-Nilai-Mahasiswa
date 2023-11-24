public class MainBandara {

    public static void main(String[] args) {

        BandaraInternasional bandaraInternasional = new BandaraInternasional("Soekarno-Hatta", "Cengkareng");
        System.out.println("\nInformasi bandara internasional:");
        bandaraInternasional.cetakInfoBandara();

        BandaraDomestik bandaraDomestik = new BandaraDomestik("Kemayoran", "Jakarta Pusat");
        System.out.println("\nInformasi bandara domestik:");
        bandaraDomestik.cetakInfoBandara();

        BandaraMiliter bandaraMiliter = new BandaraMiliter("Adisutjipto", "Yogyakarta");
        System.out.println("\nInformasi bandara militer:");
        bandaraMiliter.cetakInfoBandara();
    }
}
