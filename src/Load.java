import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load {
    public static void loadRaw() throws FileNotFoundException {
        File inputFile = new File("main.c");
        Scanner scan = new Scanner(inputFile);
        System.out.println(scan.next());
    }
}
