package App;
import java.text.NumberFormat;

public class screen {
    public void tampilinPesan(String message){
        System.out.println(message);
    }

    public void messageLine(String message){
        System.out.println(message);
    }
    public void printHarga(long harga){
        System.out.println(" " + NumberFormat.getCurrencyInstance().format(harga));
    }
}
