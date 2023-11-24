public class MainRestoran {

    public static void main(String[] args) {

        RestoranIndonesia restoranIndonesia = new RestoranIndonesia("Babi Guling Mang Engking", "Jl. Mangga Besar 09");
        System.out.println("\nInformasi restoran Indonesia:");
        restoranIndonesia.cetakInfoRestoran();

        RestoranAsia restoranAsia = new RestoranAsia("Aheng Chineese Food", "Jl. Cipete 11");
        System.out.println("\nInformasi restoran Asia:");
        restoranAsia.cetakInfoRestoran();

        RestoranWestern restoranWestern = new RestoranWestern("McDonald's", "Jl. Thamrin 101");
        System.out.println("\nInformasi restoran Western:");
        restoranWestern.cetakInfoRestoran();
    }
}

