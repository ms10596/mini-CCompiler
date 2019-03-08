import java.util.Arrays;

public class Visitor {
    boolean[] visited;

    public Visitor(int n) {
        this.visited = new boolean[n];
        Arrays.fill(this.visited, false);
    }

    public boolean isVisited(int index) {
        return visited[index];
    }
    public void visit(int a, int b) {
        for (int i = a; i < b; i++) {
            visited[i] = true;
        }
    }
}
