package App;
import Form.*;

public class Main {
    public static void main(String[] args) {
        daftarHarga list = new daftarHarga();
        Data order = new Data();
        System.out.println("----------------------------------------------------------");
        System.out.println("|                HOTEL RAMAH BINTANG LIMA                |");
        System.out.println("----------------------------------------------------------");
        list.daftar();
        System.out.println();
        order.data();
        order.harga();
        order.output();
    }
}
