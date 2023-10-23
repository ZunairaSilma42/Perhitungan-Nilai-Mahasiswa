import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private double nilaiTubes;
    private double nilaiQuiz;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai Tubes: ");
        nilaiTubes = scanner.nextDouble();
        System.out.print("Masukkan nilai Quiz: ");
        nilaiQuiz = scanner.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = scanner.nextDouble();

        scanner.close();
    }

    public double hitungTotalNilai() {
        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);
        return totalNilai;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + hitungTotalNilai() + "\n");

        //scanner.closed();
    }
}
