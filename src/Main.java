import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        String x = Load.loadRaw();
        for (int i = 0; i <x.length() ; i++) {
            System.out.println((int)x.charAt(i));
        }
    }
}
