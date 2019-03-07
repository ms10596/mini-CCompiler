import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Load.loadClasses().get("INT"));
    }
}
