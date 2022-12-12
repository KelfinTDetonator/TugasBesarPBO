package akunRec;

public class akunKaryawan {
    private int IDkaryawan;
    private int passwordKaryawan;
    private String namaKaryawan;

    public akunKaryawan(int ID, int pw, String nama){
        this.IDkaryawan = ID;
        this.passwordKaryawan = pw;
        this.namaKaryawan = nama;
    }

    public boolean validasiPass(int pwKary){
        if(pwKary == passwordKaryawan) {
            return true;
        }
         else {return false;}
    }
    public int getAkunID(){return IDkaryawan;}
    public String getNamaKaryawan(){return namaKaryawan;}
}
