package c.javapackage;

public class child extends parent{
    public child(){
        super(null);
        System.out.println("child 기본생성자");
    }

    public child(String asd){
        super(asd);
        System.out.println("child String 생성자");
    }

    public void testcase(String asd){
        System.out.println("child"+asd);
    }
    public void childtest(String asd){
        System.out.println("childtest"+asd);
    }
}
