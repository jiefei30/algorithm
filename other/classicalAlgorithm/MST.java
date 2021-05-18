package other.classicalAlgorithm;

/**
 * @author Wangmingcan
 * @date 2021/5/12 18:01
 * @description Kruskal & Disjoint set
 */
public class MST {
    public static void main(String[] args) {

    }


}

class DisjointSet4MSI {
    public int n;
    int[] parent;
    int[] rank;

    public DisjointSet4MSI(int n) {
        this.n = n;
        this.parent = new int[n];
        this.rank = new int[n];
        init(parent);
    }

    public void init(int parent[]) {
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }
    public int find_root(int x, int[] parent) {
        int x_root = x;
        while (parent[x_root] != -1) {
            x_root = parent[x_root];
        }
        return x_root;
    }
    public boolean union_vertices(int x, int y, int[] parent, int[] rank) {
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