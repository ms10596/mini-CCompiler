import java.util.Arrays;

class Visitor {
    private boolean[] visited;

    Visitor(int n) {
        this.visited = new boolean[n];
        Arrays.fill(this.visited, false);
    }

    boolean isVisited(int index) {
        return visited[index];
    }

    void visit(int a, int b) {
        for (int i = a; i < b; i++) {
            visited[i] = true;
        }
    }
}
