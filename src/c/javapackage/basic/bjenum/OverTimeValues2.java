package c.javapackage.basic.bjenum;

public enum OverTimeValues2 {
    THREE_HOUR2(18000),
    FIVE_HOUR2(30000),
    WEEKEND_FOUR_HOUR2(40000),
    WEEKEND_EIGHT_HOUR2(60000);

    private final int amount;

    OverTimeValues2(int amount) {
        this.amount = amount;
    }

    public int getAmount () {
            return amount;
    }

}
