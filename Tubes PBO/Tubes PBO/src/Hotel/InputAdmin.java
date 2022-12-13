package Hotel;

import java.util.Scanner;

public class InputAdmin {
    private String namaHotel;
    private String alamat;
    private String kategori;

    Scanner input = new Scanner(System.in);

    public void menuHotel() {
        DataKamar dt = new DataKamar();
        System.out.println("\n\t\t\t\t\t\t\t\t============================================================");
        System.out.println("\n\n\t\t\t\t\t\t\t\t====================================DAFTAR HOTEL====================================\t\t\t\t\t\t\t\t\t");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t1. ");
        dt.DelLuna.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t2. ");
        dt.Kayana.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t3. ");
        dt.FiveSeasons.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t4. ");
        dt.Amara.getMenu();
    }

    public void inputData() {

        System.out.print("\n\t\t\t\t\t\t\t\t\t\tNama Hotel    : ");
        namaHotel = input.nextLine();
        System.out.print("\t\t\t\t\t\t\t\t\t\tAlamat Hotel  : ");
        alamat = input.nextLine();
        System.out.print("\t\t\t\t\t\t\t\t\t\tKategori      : ");
        kategori = input.nextLine();

        System.out.print("\n\t\t\t\t\t\t\t\t\t\tJumlah Kamar yang akan diinput : ");
        int jumlahKamar = input.nextInt();

        int jml[] = new int[jumlahKamar];
        String nomorKamar[] = new String[jumlahKamar];
        String tipeKamar[] = new String[jumlahKamar];
        int harga[] = new int[jumlahKamar];

        for (int i = 0; i < jml.length; i++) {
            input.nextLine();
            System.out.print("\n\t\t\t\t\t\t\t\t\t\tNomor Kamar   : ");
            nomorKamar[i] = input.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\tTipe Kamar    : ");
            tipeKamar[i] = input.nextLine();
            System.out.print("\t\t\t\t\t\t\t\t\t\tHarga         : ");
            harga[i] = input.nextInt();
        }

        viewData();
        System.out.println(" ");
        input.nextLine();

        System.out.println("\n\t\t\t\t\t\t\t\t========================Daftar Kamar========================\n");
        for (int i=0; i<jml.length; i++)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t" + nomorKamar[i] + ": " + tipeKamar[i] + " - " + harga[i]);
        }
        menuHotel();
        System.out.println("\t\t\t\t\t\t\t\t\t\t5. " + namaHotel + " - " + alamat);
        System.out.println("\n\t\t\t\t\t\t\t\t===================================================================================\t\t\t\t\t\t\t\t\t");
    }

    public void viewData() {
        System.out.println("\n\t\t\t\t\t\t\t\t========================Daftar Hotel========================");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tNama Hotel : " + namaHotel);
        System.out.println("\t\t\t\t\t\t\t\t\t\tAlamat Hotel : " + alamat);
        System.out.println("\t\t\t\t\t\t\t\t\t\tKategori : " + kategori);
    }
}
