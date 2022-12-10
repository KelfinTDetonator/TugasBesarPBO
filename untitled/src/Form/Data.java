package Form;

import java.util.Scanner;

public class Data extends awalData{
    private String nama;
    private String alamat;
    private String nohp;
    private int pil;
    private int harga;
    private String tgl;

    Scanner input = new Scanner(System.in);
    @Override
    public void data(){
        System.out.println("-------------- Masukkan Data Tamu --------------");
        System.out.println("Masukkan Nama Tamu      : ");
        nama = input.nextLine();
        System.out.println("Masukkan Alamat Tamu    : ");
        alamat = input.nextLine();
        System.out.println("Masukkan No.HP Tamu     : ");
        nohp = input.nextLine();
        System.out.println("Masukkan Tanggal Masuk  : ");
        tgl = input.nextLine();
        System.out.println("Masukkan Pilihan Kamar  : ");
        pil = input.nextInt();
    }
    @Override
    public void harga(){
        switch (pil){
            case 1:
                harga = 500000;
                System.out.println("Jenis kamar              : Suite");
                System.out.println("Harga kamar              : " +harga);
                System.out.println("Pembayaran setiap tanggal: " + tgl);
                break;
            case 2:
                harga = 400000;
                System.out.println("Jenis kamar              : Deluxe");
                System.out.println("Harga kamar              : " + harga);
                System.out.println("Pembayaran setiap tanggal: " + tgl);
                break;
            case 3:
                harga = 500000;
                System.out.println("Jenis kamar              : Classic");
                System.out.println("Harga kamar              : " + harga);
                System.out.println("Pembayaran setiap tanggal: " + tgl);
                break;
//            case 4:
//                harga = 500000;
//                System.out.println("Jenis kamar              : ");
//                System.out.println("Harga kamar              : ");
//                System.out.println("Pembayaran setiap tanggal: " + tgl);
//                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
        }
    }
    @Override
    public void output(){
        System.out.println("-------------- Bukti Pembayaran Reservasi Hotel --------------");
        System.out.println("Nama Pemesan: " + nama);
        System.out.println("Alamat Penyewa : " + alamat);
        System.out.println("Nomor HP       : " + nohp);
        harga();
    }

}
