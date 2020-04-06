package synonyms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SynonymsV2Impl implements Synonyms {
    private Map<String, Set<String>> data = new HashMap<>();

    @Override
    public boolean add(String word1, String word2) {
        boolean alreadyExists = data.containsKey(word1) && data.get(word1).contains(word2);
        if (!alreadyExists) {
            addOnePair(word1, word2);
            addOnePair(word2, word1);
        }
        return !alreadyExists;
    }

    private void addOnePair(String word1, String word2) {
        final Set<String> set = data.getOrDefault(word1, new HashSet<>());
        set.add(word2);
        data.putIfAbsent(word1,set);
    }

    @Override
    public int count(String word) {
        return data.containsKey(word)? data.get(word).size() : 0;
    }

    @Override
    public boolean check(String word1, String word2) {
        return data.containsKey(word1) && data.get(word1).contains(word2);
    }

    @Override
    public int size() {
        return data.size();
    }
}
