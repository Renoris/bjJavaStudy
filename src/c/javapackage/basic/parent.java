package c.javapackage.basic;

public class parent {
//    public parent(){
//        System.out.println("parent! 기본생성자!");
//    }
    
    public parent(String name){
        System.out.println("parent! String매개변수 생성자");
    }


    public void testcase(String asd){
        System.out.println("parent"+asd);
    }

    public void parenttest(String asd){
        System.out.println("parenttest"+asd);
    }
}
