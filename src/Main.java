import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.*;

public class Main {

    static ArrayList<Token> tokens = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        var y = Map.entry("meat", "loaf");
        System.out.println(y);
        var x = Load.loadRaw();
        Visitor visitor = new Visitor(x.length());
        var dictionary = Load.loadClasses();
//        System.out.println(dictionary);
        for(var i:dictionary) {
//            System.out.println(key);
            var pattern = Pattern.compile((String) i.getValue());
            var matcher = pattern.matcher(x);
            while(matcher.find()){
                if (visited[matcher.start()] == false) {
                    tokens.add(new Token((String) i.getKey(),matcher.group(), matcher.start()));
                    visited[matcher.start()] = true;
                }
            }
        }
        tokens.sort(Comparator.comparingInt(token -> token.start));
        System.out.println(tokens);
    }
}
