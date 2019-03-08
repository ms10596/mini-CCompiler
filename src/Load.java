import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
public class Load {
    static String loadRaw() throws FileNotFoundException {
        File inputFile = new File("main.c");
        Scanner scan = new Scanner(inputFile);
        StringBuilder all= new StringBuilder();
        while(scan.hasNextLine()){
            all.append(scan.nextLine());
            all.append('\n');
        }
        System.out.println(all.toString());
        return all.toString();
    }
    public static ArrayList<Map.Entry> loadClasses() throws FileNotFoundException {
        ArrayList<Map.Entry> regexDictionary = new ArrayList<>();
        File inputFile = new File("dictionary.csv");
        Scanner scan = new Scanner(inputFile);
        while(scan.hasNext()){
            String[] line = scan.nextLine().split(" ");
            regexDictionary.add(Map.entry(line[0], line[1]));
        }
        System.out.println(regexDictionary);
        return regexDictionary;
    }
}
