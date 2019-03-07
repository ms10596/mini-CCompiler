public class Token {
    private String type, value;

    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "<"+ type.toUpperCase() + ">:" + value;
    }
}
