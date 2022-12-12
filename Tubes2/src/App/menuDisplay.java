package App;
import java.util.Scanner;
import akunRec.*;

public class menuDisplay {
    public class Input{
        private Scanner input = new Scanner(System.in);
        public int getInput(){
            return input.nextInt();
        }
    }
    private boolean autentikasiKaryawan;
    private int IDkaryawan;
    public screen Screen;
    public Input input;
    public dbResepsionis DBresepsionis;

    public menuDisplay(){
        autentikasiKaryawan = false;
        IDkaryawan = 0;
        Screen = new screen();
        input = new Input();
        DBresepsionis = new dbResepsionis();
    }

    public void run() {
        while (true) {
            while (!autentikasiKaryawan) {
                Screen.messageLine("\n Selamat Datang!");
                setAutentikasiKaryawan();

            }
            String namaKry = DBresepsionis.getNamaKaryawan(this.IDkaryawan);
            System.out.println("Resepsionis " + namaKry + " telah berhasil masuk!");
            autentikasiKaryawan = false;
            IDkaryawan = 0;
            System.out.println("Goodbye!");
        }
    }
    private void setAutentikasiKaryawan(){
        Screen.tampilinPesan("\nMasukkan ID Karyawan: ");
        int ID = input.getInput(); //Input ID
        Screen.tampilinPesan("\nMasukkan Password Anda");
        int pw = input.getInput(); //Input password

        autentikasiKaryawan = DBresepsionis.autentikasiAkun(ID, pw);

        if (autentikasiKaryawan){
            IDkaryawan = ID;
        }
         else {
            Screen.messageLine("Pastikan ID Karyawan dan Password Anda benar lalu coba lagi");
         }
    }
}
