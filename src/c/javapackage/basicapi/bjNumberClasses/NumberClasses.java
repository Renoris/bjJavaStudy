package c.javapackage.basicapi.bjNumberClasses;

public class NumberClasses {
    public void Numberclasslist(){
        String value1="1";
        String value2="3";
        byte byte1=Byte.parseByte(value1);
        byte byte2=Byte.parseByte(value2);
        Byte byte3=Byte.valueOf(value1);
        Byte byte4=Byte.valueOf(value2);
        System.out.println(byte1+byte2);
        System.out.println(byte3+byte4);
        //int 대신 Interger
        //byte 대신 Byte를 사용할수잇으나
        //존재하는 이유는 참조자료형이 필요하고 기능을 제공하기 위해서임
        //그러나 이런 참조자료형을 기본자료형 처럼 사용해도 무방함
        //제공하는기능 
        //.parse--=기본자료형으로 리턴
        //.valueOf--=참조자료형으로 리턴
        //그리고 많은 매소드들이 있음
        System.out.println(Byte.MAX_VALUE+"-"+Byte.MIN_VALUE);
    }
}
