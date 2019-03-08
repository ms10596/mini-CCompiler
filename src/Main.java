import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.*;

public class Main {
    static ArrayList<Token> tokens = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        var x = Load.loadRaw();
        var dictionary = Load.loadClasses();
//        System.out.println(dictionary);
        for(var key:dictionary.keySet()) {
//            System.out.println(key);
            var pattern = Pattern.compile(dictionary.get(key));
            var matcher = pattern.matcher(x);
            while(matcher.find()){
                tokens.add(new Token(key,matcher.group(), matcher.start()));
            }
        }
        tokens.sort(Comparator.comparingInt(token -> token.start));
        System.out.println(tokens);
    }
}
