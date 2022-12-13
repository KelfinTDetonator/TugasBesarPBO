package Hotel;

public abstract class Info {
    private String username;
    private DataUser dataUser;

    public Info(String Username, DataUser infoDataUser) {
        username = Username;
        dataUser = infoDataUser;
    }

    public String getUsername() {
        return username;
    }

    public DataUser getDataUser() {
        return dataUser;
    }

    abstract public void tampil();
}
