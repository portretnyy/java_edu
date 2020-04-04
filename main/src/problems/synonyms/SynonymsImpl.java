package problems.synonyms;

import java.util.*;

public class SynonymsImpl implements Synonyms {
    Map<String, ArrayList<String>> synonimsMap = new HashMap<>();

    @Override
    public boolean add(String word1, String word2) {

        /* First attempt - messed up with return statements
        if (synonimsMap.containsKey(word1)) {
            if (synonimsMap.get(word1).contains(word2)) {
                return false;
            } else {
                synonimsMap.get(word1).add(word2);
                return true;
            }
        } else {
            synonimsMap.put(word1, new ArrayList<String>(Arrays.asList(word2)));
            return true;
        }
        if (synonimsMap.containsKey(word2)) {
            if (synonimsMap.get(word2).contains(word1)) {
                return false;
            } else {
                synonimsMap.get(word2).add(word1);
                return true;
            }
        } else {
            synonimsMap.put(word2, new ArrayList<String>(Arrays.asList(word1)));
        }
         */
        if (synonimsMap.containsKey(word1)) {
            if (synonimsMap.get(word1).contains(word2)) {
                return false;
            } else {
                synonimsMap.get(word1).add(word2);
                return true;
            }
        } else {
            synonimsMap.put(word1, new ArrayList<String>(Arrays.asList(word2)));
            return true;
        }
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
