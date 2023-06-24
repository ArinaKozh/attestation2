import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class main {
    public static void main(String[] args) {
        Ui ui = new Ui();
        try {
            ui.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
