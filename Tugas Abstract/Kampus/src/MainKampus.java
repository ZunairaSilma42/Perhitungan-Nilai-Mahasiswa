public class MainKampus {
    public static void main(String[] args) {
        System.out.println("\nFormulir Mahasiswa: ");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.Carabayar();
        mahasiswa.Tatatertib();

        System.out.println("\nFormulir Dosen: ");
        Dosen dosen = new Dosen();
        dosen.Carabayar();
        dosen.Tatatertib();

        System.out.println("\nFormulir Admin: ");
        Admin admin = new Admin();
        admin.Carabayar();
        admin.Tatatertib();

        
    }
    
}
