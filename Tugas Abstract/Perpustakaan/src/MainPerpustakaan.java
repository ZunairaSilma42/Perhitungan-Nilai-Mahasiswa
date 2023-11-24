public class MainPerpustakaan {

    public static void main(String[] args) {
        PerpustakaanUmum pu = new PerpustakaanUmum("Perpustakaan Umum Bojongsoang");
        System.out.println("\n" + pu.nama + " beralamat di " + pu.alamat());

        PerpustakaanAnak pa = new PerpustakaanAnak("Perpustakaan Anak Bandung");
        System.out.println("\n" + pa.nama + " beralamat di " + pa.alamat());
        
        PerpustakaanSekolah ps = new PerpustakaanSekolah("Perpustakaan Sekolah Cimahi");
        System.out.println("\n" + ps.nama + " beralamat di " + ps.alamat());
    }
}