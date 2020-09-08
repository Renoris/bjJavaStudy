package c.javapackage.basicapi.bjString;

public class bjStringMain {
    public static void main(String [] args){
        StringSample stringSample=new StringSample();
        stringSample.constructor();
        System.out.println(stringSample.nullCheck(null));
        stringSample.compareCheck();
    }
}
