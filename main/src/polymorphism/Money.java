package polymorphism;

public class Money implements Comparable<Money> {
    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public int compareTo(Money other) {
        if (this.amount > other.amount) {
            return 1;
        }
        else if (this.amount < other.amount) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
