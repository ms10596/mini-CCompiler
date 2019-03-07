import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Load {
    static String loadRaw() throws FileNotFoundException {
        File inputFile = new File("main.c");
        Scanner scan = new Scanner(inputFile);
        StringBuilder all= new StringBuilder();
        while(scan.hasNext()){
            all.append(scan.next());
            all.append("\n");
        }
        return all.toString();
    }
    public static void loadClasses() throws FileNotFoundException {
        File inputFile = new File("dictionary.csv");
        Scanner scan = new Scanner(inputFile);
        ArrayList<Token>tokens = new ArrayList<>();
        while(scan.hasNext()){
            String[] line = scan.nextLine().split(",");
           tokens.add(new Token());
        }
    }
}
