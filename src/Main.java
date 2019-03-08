import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.*;

public class Main {

    static ArrayList<Token> tokens = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        var x = Load.loadRaw();
        Visitor visitor = new Visitor(x.length());
        var dictionary = Load.loadClasses();
        for (var i : dictionary) {
            var pattern = Pattern.compile((String) i.getValue());
            var matcher = pattern.matcher(x);
            while (matcher.find()) {
                if (visitor.isVisited(matcher.start()) == false) {
                    tokens.add(new Token((String) i.getKey(), matcher.group(), matcher.start()));
                    visitor.visit(matcher.start(), matcher.end());
                }
            }
        }
        Collections.sort(tokens);
        Save.saveTokens(tokens);
    }
}
