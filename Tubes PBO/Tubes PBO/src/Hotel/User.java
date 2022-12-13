package Hotel;

public class User {
    private String username;
    private String password;
    private String nama;
    private String email;
    private String nohp;
    private int status;

    public User(String Username, String Nama, String Email, String Nohp, String Password, int Status) {
        username = Username;
        nama = Nama;
        email = Email;
        nohp = Nohp;
        password = Password;
        status = Status;
    }

    public boolean validasiPass(String userPassword) {
        if(userPassword.equals(password)) {
            return true;
        }else {
            return false;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNohp() {
        return nohp;
    }

    public String getUsername() {
        return username;
    }

    public int getStatus() {
        return status;
    }
}
