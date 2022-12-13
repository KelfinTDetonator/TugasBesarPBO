package Hotel;

import java.util.Scanner;

public class HotelApps {
    private boolean userLogin;
    public String currentUsername;
    public int currentStatus;
    private DataUser dataUser;

    Scanner input = new Scanner(System.in);

    public HotelApps() {
        userLogin = false;
        currentUsername = String.valueOf(0);
        dataUser = new DataUser();
    }

    public void haveAccount() {
        String akun;
        System.out.print("\n\n\n\n\t\t\t\t\tSudah punya akun? [Y/N] > ");
        akun = input.nextLine();
        if(akun.equalsIgnoreCase("Y")) {
            sessionLogin();
        }else if(akun.equalsIgnoreCase("N")) {
            CreateAccount();
            sessionLogin();
        }else {
            System.out.println("\t\t\t\t\tInvalid input!");
        }
    }

    public void sessionLogin() {
        while(true) {
            while(!userLogin) {
                System.out.println("\n\t\t\t\t\tAplikasi Hotel");
                isLogin();
            }
            currentStatus = dataUser.getStatus(currentUsername);
            if(currentStatus==1){
                menuTransaksi();
            }else if(currentStatus==2){
                menuAdmin();
            }
            userLogin = false;
            currentUsername = String.valueOf(0);
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTerima Kasih");
        }
    }

    private void isLogin() {
        System.out.print("\t\t\t\t\tUsername : ");
        String username = input.nextLine();
        System.out.print("\t\t\t\t\tPassword : ");
        String password = input.nextLine();

        userLogin = dataUser.isLogin(username, password);
        if(userLogin) {
            currentUsername = username;
        }else {
            System.out.println("\t\t\t\t\tUsername atau Password salah. Silahkan Coba lagi..");
        }
    }

    public void CreateAccount() {System.out.print("\t\t\t\t\tUsername : ");
        String username = input.nextLine();
        System.out.print("\t\t\t\t\tPassword : ");
        String password = input.nextLine();
        System.out.print("\t\t\t\t\tNama  : ");
        String nama = input.nextLine();
        System.out.print("\t\t\t\t\tEmail : ");
        String email = input.nextLine();
        System.out.print("\t\t\t\t\tNo Hp : ");
        String nohp = input.nextLine();
        int status = 1;
        dataUser.CreateAccount(username, nama, email, nohp, password, status);
    }

    public void menuHotel() {
        DataKamar dt = new DataKamar();
        System.out.println("\n\n\t\t\t\t\t\t\t\t===================================APLIKASI HOTEL===================================\t\t\t\t\t\t\t\t\t");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t1. ");
        dt.DelLuna.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t2. ");
        dt.Kayana.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t3. ");
        dt.FiveSeasons.getMenu();
        System.out.print("\t\t\t\t\t\t\t\t\t\t4. ");
        dt.Amara.getMenu();
        System.out.println("\t\t\t\t\t\t\t\t\t\t0. Keluar");
        System.out.println("\n\t\t\t\t\t\t\t\t===================================================================================\t\t\t\t\t\t\t\t\t");
    }
    public void menuTransaksi() {
        Reservasi reservasi = new Reservasi();
        DataKamar dt = new DataKamar();
        Info currentInfo = null;
        currentInfo = new InformasiUser(currentUsername, dataUser);
        String menu;
        String pilihMenu;
        do {
            menuHotel();
            System.out.print("\n\t\t\t\t\t\t\t\tPilih Menu [1/2/3/4] > ");
            menu = input.nextLine();
            if (menu.equalsIgnoreCase("1")) {
                dt.DelLuna.setKamar(dt.kamarDelLuna);
                dt.DelLuna.getInfo();
                reservasi.Transaksi();
                currentInfo.tampil();
                reservasi.cetakData();
            } else if (menu.equalsIgnoreCase("2")) {
                dt.Kayana.setKamar(dt.kamarKayana);
                dt.Kayana.getInfo();
                reservasi.Transaksi();
                currentInfo.tampil();
                reservasi.cetakData();
            } else if (menu.equalsIgnoreCase("3")) {
                dt.FiveSeasons.setKamar(dt.kamarFS);
                dt.FiveSeasons.getInfo();
                reservasi.Transaksi();
                currentInfo.tampil();
                reservasi.cetakData();
            } else if (menu.equalsIgnoreCase("4")) {
                dt.Amara.setKamar(dt.KamarAmara);
                dt.Amara.getInfo();
                reservasi.Transaksi();
                currentInfo.tampil();
                reservasi.cetakData();
            } else if (menu.equalsIgnoreCase("0")) {
                input.close();
                System.exit(0);
            } else {
                System.out.println("\t\t\t\t\t\t\t\tInvalid Menu");
            }
            System.out.print("\t\t\t\t\t\t\t\tKembali ke menu utama? [Y/N] > ");
            pilihMenu = input.nextLine();
        } while (pilihMenu.equalsIgnoreCase("Y"));
    }

    public void menuAdmin() {
        InputAdmin adminInput = new InputAdmin();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHi, Admin!");
        System.out.println("\n\t\t\t\t\t\t\t\t==================Tambahkan Data Hotel Baru=================");
        adminInput.inputData();
        input.close();
        System.exit(0);
    }
}
