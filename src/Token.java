public class Token {
    private String type, value;
    public int start;

    public Token(String type, String value, int start) {
        this.type = type;
        this.value = value;
        this.start = start;
    }

    @Override
    public String toString() {
        return "<"+ type.toUpperCase() + ">:" + value+'\n';
    }
}
