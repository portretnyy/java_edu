package polymorphism;

import java.util.Arrays;

public class MoneyComparisonDemo {
    public static void main(String[] args) {
        Money myMoney = new Money(100000, "rub");
        Money bankMoney = new Money(1000000000, "rub");
        Money mobMoney = new Money(10000000,"euro");

        Money[] moneyList = {myMoney, bankMoney, mobMoney, new Money(0, "rub")};
        Arrays.sort(moneyList);

        Object o = mobMoney;

//        o = "test";
        if (o instanceof Money) {
            Money money = (Money) o;
        }
//        sort(moneyList);
        System.out.println();
    }

    public static void sort(Money[] moneyList) {
        for (int i = 0; i < moneyList.length - 1; i++) {
            for (int j = i + 1; j < moneyList.length; j++) {
                if (moneyList[i].compareTo(moneyList[i+1]) > 0) {//moneyList[i] > moneyList[i+1]
                    Money temp = moneyList[i];
                    moneyList[i] = moneyList[i+1];
                    moneyList[i+1] = temp;
                }
            }
        }
    }

    public void doIt(Object o) {
        Moveable moveable = null;
        if (o instanceof Moveable) {
            moveable = (Moveable) o;
        }
    }
}
