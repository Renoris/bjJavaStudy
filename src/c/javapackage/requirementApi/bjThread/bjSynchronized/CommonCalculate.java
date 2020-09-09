package c.javapackage.requirementApi.bjThread.bjSynchronized;

public class CommonCalculate {
    private int amount;

    public CommonCalculate(){
        amount=0;
    }

//    public void plus(int value) {
//        amount += value;
//    }
    public synchronized void plus(int value){
        amount+=value;
    }
    public void minus(int value){
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
