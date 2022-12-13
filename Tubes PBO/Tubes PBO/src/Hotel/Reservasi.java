package Hotel;

import java.util.Scanner;
import java.util.Random;

public class Reservasi {
    private int lama;
    private int harga;
    private int total;
    private String checkin;
    private String checkout;
    private String pilihKamar;
    private User user;
    private Hotel hotel;
    private Kamar[] kamar;
    Scanner input = new Scanner(System.in);
    DataKamar dt = new DataKamar();

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void Transaksi() {
        System.out.print("\n\t\t\t\t\t\t\t\tPilih Kamar : ");
        pilihKamar = input.nextLine();
        if(pilihKamar.equalsIgnoreCase("103")){
            harga = dt.d103.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("104")) {
            harga = dt.d104.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("505")) {
            harga = dt.f505.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("506")) {
            harga = dt.f506.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("401")) {
            harga = dt.f401.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("302")) {
            harga = dt.k302.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("203")) {
            harga = dt.k203.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("112")) {
            harga = dt.a112.getHarga();
        }else if(pilihKamar.equalsIgnoreCase("114")) {
            harga = dt.a114.getHarga();
        }else{
            System.out.println("Kamar tidak ada!!!");
        }
        System.out.print("\n\t\t\t\t\t\t\t\tLama Menginap : ");
        lama = input.nextInt();
        input.nextLine();
        System.out.print("\n\t\t\t\t\t\t\t\tTanggal Check In (DD/MM/YYYY): ");
        checkin = input.nextLine();
        System.out.print("\n\t\t\t\t\t\t\t\tTanggal Check Out (DD/MM/YYYY) : ");
        checkout = input.nextLine();
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t=========================INFORMASI RESERVASI====================\t\t\t\t\t\t\t\t\t");
    }

    public void hitungTotalHarga() {
        total = this.harga * this.lama;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t---------Total Pembayaran : " + total + "---------");
    }

    public void kodeReservasi() {
        Random rnd = new Random();
        int kodeRes = 10000000 + rnd.nextInt(90000000);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tKode Reservasi " + kodeRes);
        System.out.println("\n\t\t\t\t\t\t\t\t\t==============================================================\t\t\t\t\t\t\t\t\t");
        System.out.println("\n");
    }

    public void cetakData() {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tNomor Kamar " + pilihKamar);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tCheck In " + checkin);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tCheck Out " + checkout);
        hitungTotalHarga();
        kodeReservasi();
    }

}
