package generics;

import javax.xml.crypto.Data;

public class DataHolderDemo {
    public static void main(String[] args) {
        DataHolder stringDataHolder = new DataHolder(new String[]{"passwords", "card_numbers"});
        DataHolder integerDataHolder = new DataHolder(new Integer[]{1245454, 15454545, 15454});

        Object[] data = stringDataHolder.getData();
        for (Object datum : data) {
            if (datum instanceof String ){
                String stringDatum = (String) datum;
                System.out.println(stringDatum);
            }
        }

        DataHolder<String> stringDataHolder2 = new DataHolder<String>(new String[]{ "passwords", "names"});

        String[] data2 = stringDataHolder2.getData();
        for (String s : data2) {
            System.out.println(s);
        }
    }
}
