package synonyms;

import java.util.*;

public class SynonymsImpl implements Synonyms {
    Map<String, HashSet<String>> synonimsMap = new HashMap<>();

    @Override
    public boolean add(String word1, String word2) {

        if (synonimsMap.containsKey(word1) && synonimsMap.get(word1).contains(word2)) {
            if (!synonimsMap.containsKey(word2)) {
                synonimsMap.put(word2, new HashSet<String>(Arrays.asList(word1)));
            } else {
                synonimsMap.get(word2).add(word1);
            }
            return false;
        } else if (!synonimsMap.containsKey(word1)) {
            synonimsMap.put(word1, new HashSet<String>(Arrays.asList(word2)));
            if (!synonimsMap.containsKey(word2)) {
                synonimsMap.put(word2, new HashSet<String>(Arrays.asList(word1)));
            } else {
                synonimsMap.get(word2).add(word1);
            }
            return true;
        } else if (!synonimsMap.get(word1).contains(word2)) {
            synonimsMap.get(word1).add(word2);
            if (!synonimsMap.containsKey(word2)) {
                synonimsMap.put(word2, new HashSet<String>(Arrays.asList(word1)));
            } else {
                synonimsMap.get(word2).add(word1);
            }
            return true;
        }
        return false;
    }


    @Override
    public int count(String word) {
        if (synonimsMap.containsKey(word)) return synonimsMap.get(word).size();
        return 0;
    }

    @Override
    public boolean check(String word1, String word2) {
        return synonimsMap.get(word1).contains(word2);
    }

    @Override
    public int size() {
        return synonimsMap.size();
    }
}
