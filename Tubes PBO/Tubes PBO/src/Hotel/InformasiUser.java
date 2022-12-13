package Hotel;

public class InformasiUser extends Info {
    public InformasiUser(String username, DataUser infoDataUser) {
        super(username, infoDataUser);

    }

    public void tampil() {
        DataUser dataUser = getDataUser();

        String currentNama = dataUser.getNama(getUsername());
        String currentEmail = dataUser.getEmail(getUsername());
        String currentNoHP = dataUser.getNoHP(getUsername());

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tNama : "+currentNama);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tEmail : "+currentEmail);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tNo HP : "+currentNoHP);
    }
}
