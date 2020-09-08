package c.javapackage.basic.bjenum;

public class bjEnumMain {

    public int findEnumValue1(OverTimeValues values){
        switch(values){
            case THREE_HOUR:
                return 18000;
            case FIVE_HOUR:
                return 30000;
            case WEEKEND_FOUR_HOUR:
                return 40000;
            case WEEKEND_EIGHT_HOUR:
                return 60000;
            default:
                return 0;

        }
    }


    public static void main(String [] args){
        OverTimeValues iworkfive=OverTimeValues.FIVE_HOUR;
        int pay1=new bjEnumMain().findEnumValue1(iworkfive);
        OverTimeValues2 iworkthree=OverTimeValues2.THREE_HOUR2;
        System.out.println("overtimevalue1 : "+pay1);
        System.out.println("overtimevalue2 : "+iworkthree);
        System.out.println("overtimevalue2 : "+iworkthree.getAmount());
    }

}
