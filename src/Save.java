import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

class Save {
    static void saveTokens(ArrayList<Token> tokens) throws Exception {
        PrintWriter printWriter = new PrintWriter(new File("main.tokens"));
        for (var token : tokens) {
            printWriter.write(token.toString());
        }
        printWriter.close();
    }
}
