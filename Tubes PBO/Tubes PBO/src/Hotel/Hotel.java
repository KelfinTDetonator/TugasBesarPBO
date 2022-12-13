package Hotel;

import java.util.Scanner;

public class Hotel {
    private String namaHotel;
    private String alamat;
    private String kategori;
    private Kamar[] kamar;
    HotelApps menu = new HotelApps();
    Scanner input = new Scanner(System.in);

    public Hotel(String namaHotel, String alamat, String kategori) {
        this.namaHotel = namaHotel;
        this.alamat = alamat;
        this.kategori = kategori;
    }

    public void setKamar(Kamar[] kamar) {
        this.kamar = kamar;
    }

    public void getMenu() {
        System.out.println(this.namaHotel + " - " + this.alamat);
    }

    public void getInfo() {
        String pilih;
        System.out.println("\n\t\t\t\t\t\t\t\tNama Hotel   : " + this.namaHotel);
        System.out.println("\t\t\t\t\t\t\t\tAlamat       : " + this.alamat);
        System.out.println("\t\t\t\t\t\t\t\tKategori     : " + this.kategori);
        System.out.print("\n\t\t\t\t\t\t\t\tPress Y untuk melihat daftar kamar > ");
        pilih = input.nextLine();
        if(pilih.equalsIgnoreCase("Y")) {
            getInfoKamar();
        }else{
            menu.menuTransaksi();
        }
    }

    public void getInfoKamar() {
        // hitung jumlah kamar
        System.out.println("\n\t\t\t\t\t\t\t\t========================Daftar Kamar========================");
        int n = this.kamar.length;
        int i = 0; // counter
        while (i < n) {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t" + kamar[i].getNomorKamar() + ": " +
                    kamar[i].getTipeKamar() + " - " + kamar[i].getHarga());
            i++;
        }
        System.out.println("\n\t\t\t\t\t\t\t\t============================================================");
    }
}
