class Solution {
    public boolean validTree(int n, int[][] edges) {
        // Condition 1: must have exactly n-1 edges
        if (edges.length != n - 1) return false;

        // Build graph (adjacency list)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        // DFS to check connectivity
        HashSet<Integer> visited = new HashSet<>();
        dfs(0, graph, visited);

        // Condition 2: must visit all nodes
        return visited.size() == n;
    }

    private void dfs(int node, List<List<Integer>> graph, HashSet<Integer> visited) {
        if (visited.contains(node)) return;

        visited.add(node);

        for (int neighbor : graph.get(node)) {
            dfs(neighbor, graph, visited);
        }
    }
}