package akunRec;

public class dbResepsionis {
    private akunKaryawan[] akun;

    public dbResepsionis(){
        akun = new akunKaryawan[2];
        akun[0] = new akunKaryawan(121, 222, "Fatmawati");
        akun[1] = new akunKaryawan(122, 101122, "Danang Kurniawan");
    }
    private akunKaryawan getAkun(int IDkaryawan){
        for (akunKaryawan activeAkun : akun){
            if(activeAkun.getAkunID() == IDkaryawan){
                return activeAkun;
            }
        }
        return null; //Jika akun tidak ada,return null
    }
    public boolean autentikasiAkun(int IDkaryawan, int pw) {
        akunKaryawan karyawan = getAkun(IDkaryawan);

        if (karyawan != null) {
            return karyawan.validasiPass(pw);
        } else {
            return false;
        }
    }
}package akunRec;

public class dbResepsionis {
    private akunKaryawan[] akun;

    public dbResepsionis(){
        akun = new akunKaryawan[2];
        akun[0] = new akunKaryawan(121, 222, "Fatmawati");
        akun[1] = new akunKaryawan(122, 101122, "Danang Kurniawan");
    }
    private akunKaryawan getAkun(int IDkaryawan){
        for (akunKaryawan activeAkun : akun){
            if(activeAkun.getAkunID() == IDkaryawan){
                return activeAkun;
            }
        }
        return null; //Jika akun tidak ada,return null
    }

    public boolean autentikasiAkun(int IDkaryawan, int pw) {
        akunKaryawan karyawan = getAkun(IDkaryawan);

        if (karyawan != null) {
            return karyawan.validasiPass(pw);
        } else {
            return false;
        }
    }

    public String getNamaKaryawan(int IDkaryawan){
        return getAkun(IDkaryawan).getNamaKaryawan();
    }
}

