package Hotel;

import java.util.Objects;

public class DataUser {
    private User[] users;

    private int count = 0;
    public DataUser() {
        users = new User[10];
        users[0] = new User("laila", "Dwy Laila Safitry", "laila@gmail.com", "081220029900", "user1",1);
        users[1] = new User("admin", "Badriyah Husnayah", "badriyah@gmail.com", "082134567890", "admin1",2);
//        users[2] = new User(111, "Husnayah", "badriyah@gmail.com", "082134567890", 11,1);
    }

    public void CreateAccount(String Username, String Nama, String Email, String Nohp, String Password, int Status)
    {
        users[AccountCount()] = new User(Username, Nama, Email, Nohp, Password, Status);
    }

    public int AccountCount()
    {
        while (users[count] != null)
            count+=1;
        return count;
    }

    private User getUser(String username) {
        for (User currentUser : users) {
            if (currentUser != null){
                if (Objects.equals(currentUser.getUsername(), username)){
                    return currentUser;
                }
            }
        }
        return null;
    }

    public boolean isLogin(String userUsername, String userPassword) {
        User userAccount = getUser(userUsername);
        if(userAccount != null) {
            return userAccount.validasiPass(userPassword);
        }else {
            return false;
        }
    }

    public String getNama(String Userusername) {
        return getUser(Userusername).getNama();
    }

    public String getEmail(String Userusername) {
        return getUser(Userusername).getEmail();
    }

    public String getNoHP(String Userusername) {
        return getUser(Userusername).getNohp();
    }

    public int getStatus(String Userusername) {
        return getUser(Userusername).getStatus();
    }
}
