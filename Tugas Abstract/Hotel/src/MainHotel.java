public class MainHotel {

    public static void main(String[] args) {

        BintangLima hotelBintangLima = new BintangLima("The Ritz-Carlton, Jakarta", "Jl. MH Thamrin, Jakarta Pusat");
        System.out.println("\nInformasi hotel bintang lima:");
        hotelBintangLima.cetakInfoHotel();

        BintangEmpat hotelBintangEmpat = new BintangEmpat("Four Seasons Hotel Jakarta", "Jl. Jend. Gatot Subroto, Jakarta Selatan");
        System.out.println("\nInformasi hotel bintang empat:");
        hotelBintangEmpat.cetakInfoHotel();

        BintangTiga hotelBintangTiga = new BintangTiga("Amaris Hotel Jakarta", "Jl. Sabang, Jakarta Pusat");
        System.out.println("\nInformasi hotel bintang tiga:");
        hotelBintangTiga.cetakInfoHotel();
    }
}
