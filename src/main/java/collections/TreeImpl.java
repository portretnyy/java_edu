package collections;

public class TreeImpl implements Tree {

    String value;
    int level;
    TreeImpl(String value, int level) {
        this.value = value;
        this.level = level;
    }

    @Override
    public void add(String value) {

    }

    @Override
    public boolean contains(String value) {
        return false;
    }
}
