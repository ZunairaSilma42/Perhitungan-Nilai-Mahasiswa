import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMasukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        mahasiswa.inputNilai();

        System.out.println("\nHasil Perhitungan Nilai Mahasiswa:");
        mahasiswa.tampilkanInfo();

        scanner.close();
    }
}
