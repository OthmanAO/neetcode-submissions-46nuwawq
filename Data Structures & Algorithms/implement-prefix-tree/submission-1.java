class PrefixTree {
    HashMap<String, List<String>> map;

    public PrefixTree() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0, i + 1);
            map.putIfAbsent(prefix, new ArrayList<>());
            map.get(prefix).add(word);
        }
    }

    public boolean search(String word) {
        return map.containsKey(word) && map.get(word).contains(word);
    }

    public boolean startsWith(String prefix) {
        return map.containsKey(prefix);
    }
}
