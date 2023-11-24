public class MainRumahSakit {

    public static void main(String[] args) {

        RumahSakitUmum rsu = new RumahSakitUmum("Iskak", "Jl. Jendral Sudirman No. 10");
        System.out.println("\n" + rsu.nama + " adalah " + rsu.berikanPelayanan() );
        System.out.println("Alamat: " + rsu.alamat);
        
        RumahSakitJiwa rsj = new RumahSakitJiwa("Pelita Harapan", "Jl. Letjend Suprapto No. 101");
        System.out.println("\n" + rsj.nama + " adalah " + rsj.berikanPelayanan() );
        System.out.println("Alamat: " + rsj.alamat);
    }
}
