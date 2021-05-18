package other.classicalAlgorithm;

/**
 * @author Wangmingcan
 * @date 2021/5/12 16:55
 * @description
 */
public class DisjointSet {
    public static int n = 6;
    public static void main(String[] args) {
        int[] parent = new int[n];
        int[] rank = new int[n];
        int[][] edges = {{0,1}, {1,2}, {1,3}, {3,4},{2,5}, {4,5}};
        init(parent);
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            if (!union_vertices(x, y, parent, rank)) {
                System.out.println("Cycle detected!");
                return;
            }
        }
        System.out.println("No cycles found.");
    }

    public static void init(int parent[]) {
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }
    public static int find_root(int x, int[] parent) {
        int x_root = x;
        while (parent[x_root] != -1) {
            x_root = parent[x_root];
        }
        return x_root;
    }

    public static boolean union_vertices(int x, int y, int[] parent, int[] rank) {
        int x_root = find_root(x, parent);
        int y_root = find_root(y, parent);
        if (x_root == y_root) {
            return false;
        }
        if (rank[x_root] > rank[y_root]) {
            parent[y_root] = x_root;
        }else if (rank[x_root] < rank[y_root]){
            parent[x_root] = y_root;
        }else {
            parent[x_root] = y_root;
            rank[y_root]++;
        }
        return true;
    }
}
