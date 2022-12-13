package Hotel;

public class Kamar {
    private String nomorKamar;
    private String TipeKamar;
    private int harga;

    public Kamar(String nomorKamar, String TipeKamar, int harga){
        this.nomorKamar = nomorKamar;
        this.TipeKamar = TipeKamar;
        this.harga = harga;
    }

    public String getNomorKamar() {
        return this.nomorKamar;
    }

    public String getTipeKamar() {
        return this.TipeKamar;
    }

    public int getHarga() {
        return this.harga;
    }
}
