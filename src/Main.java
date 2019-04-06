public class Main {


    public static void main(String[] args) throws Exception {
        var sourceCode = Load.loadRaw();
        var tokens = Token.tokenize(sourceCode);
        System.out.println(tokens);
        Save.saveTokens(tokens);
    }
}
