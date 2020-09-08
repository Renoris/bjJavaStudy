package c.javapackage.basic;
public class bjtest2 {
    public void test1(bjitem titem1){
        String testing=titem1.getItem1();
        int testing2=titem1.getItem3();
        System.out.println(titem1.getItem3());
        System.out.println(testing2);
        titem1.setItem1("섹지핫지가아니야");
        testing2=5;
        System.out.println(testing2);
        System.out.println(titem1.getItem3());
        System.out.println(testing);
        System.out.println(titem1.getItem1());
    }
}