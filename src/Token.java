public class Token implements Comparable<Token> {
    private String type, value;
    public int start;

    public Token(String type, String value, int start) {
        this.type = type;
        this.value = value;
        this.start = start;
    }

    @Override
    public String toString() {
        return "<" + type.toUpperCase() + ">:" + value + '\n';
    }

    @Override
    public int compareTo(Token token) {
        return Integer.compare(this.start, token.start);
    }
}
