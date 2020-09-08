package c.javapackage.basicapi.bjString;

import java.io.UnsupportedEncodingException;

public class StringSample {
    public void constructor(){
        try{//getBytes 메소드중에서 String type 을 받는 메소드는 UnsupportedEncodingExcpetion을 발생시킬수 있음
            //존재하지않는 캐릭터셋을 사용할 경우 나타나는 현상임
            String str="한글";
            byte[] array1=str.getBytes();
            printByteArray(array1);
            String str1=new String(array1,"EUC-KR");//기본 charset//원랜 기본이지만 이 컴파일러는 utf-8인듯
            String str2=new String(array1,"UTF-8");//
            System.out.println(str1);
            System.out.println(str2);

            byte[] array2=str2.getBytes("EUC-KR");
            String str3=new String(array2,"EUC-KR");
            System.out.println(str3);
        }
        catch(UnsupportedEncodingException e){
            System.out.println("존재하지않는 캐릭터셋입니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public boolean nullCheck(String text){
//        int textLength=text.length();
//        System.out.println(textLength);
        if(text==null) return true;
        return false;
    }
    
    //문자열 비교
    public void compareCheck(){
        String text="하낫둘셋";
        System.out.println("문자열 비교 메소드들");
        System.out.println("text.length=문자열길이"); //문자열 길이
        System.out.println("text.isEmpty=문자열이 비었나"); // 문자열이 비엇니?
        //보통 String 이나 다른객체를 비교할경우 equals를 사용해야하지만 스트링의경우 constant pool이 있기 때문에 같은 내용을 쓰면
        //같은 객체로 취급한다 이걸 피하고싶으면 new String("내용 이래야 내용물만 같고 다른 객체이다")
        System.out.println("text(Object).eqauls=객체가 똑같은지-String의 경우 같은내용이면 같은객체가 되므로 ==시 true로 나옴new String(\"내용\")해서 다른객체로 만들어줘야 다른 객체가됨 해야함");//객체가 똑같니? String의 경우
        System.out.println("text(Object).eqaulsIgnoreCase=대소문자 구분x");//대소문자구문x
        System.out.println("text.compareTo=알파벳 순서비교");//알파뱃을 비교해서 앞에잇으면 양수 뒤에있으면 음수리턴
        //한글인데 여러개의 글자가 다르면 어케되는 구조인지 모르겟음
        System.out.println("text.compareToIgnoreCase=알파벳순서비교 대소문자구분 무시");
        System.out.println("text.contentEquals(CharSequence cs)=");
        System.out.println("text.contentEquals(StringBuffer sb)=");
        
        //문자열 찾는 메소드들
        System.out.println("문자열 find 메소드");
        System.out.println("text.startsWith(String prefix)=prefix라는 문자로 이문자열이 시작햇냐");
        System.out.println("text.endsWith(String suffix)=suffix라는 문자로 이문자열이 시작햇냐");
        System.out.println("text.contains(CharSequence s)=넘어온 문자열이 중간에 있냐");
        System.out.println("text.matches(String regex)=매개변수로 넘어오는 값이 정규표현식이여야함");
        System.out.println("text.regionMatches(boolean ignorceCase, int toffeset, String other, int ooffset, int len)=");
        System.out.println("ignorcase=대소문자무시, toffset=비교대상문자열의 확인시작 위치, other=존재하는지 확인할 문자열");
        System.out.println("ooffset=other의 시작위치, len=비교할 char갯수");
        System.out.println("text.indexOf()=인자의 위치출력, text.lastIndexOf=뒤에서부터");
        System.out.println("인자종류=(int ch),(int ch, int fromIndex), (String str), (String str, int fromIndex)");

        //문자열값 추출 메소드들
        System.out.println("문자열 추출 메소드들");
        System.out.println("text.charAt(int index)=인덱스위치 char추출");
        System.out.println("String.copyValue(char[]data)=char배열을 String 으로추출");
        //리턴타입이 static String이면 그 객체.메소드가 아니라 String.메소드() 라는거같음
        System.out.println("text.toCharArray()=char배열로 리턴");
        System.out.println("text.subString(int beginIndex)=begin index부터 끝까지 대상문자열을 잘라 리턴");
        System.out.println("text.subString(int beginIndex, int endIndex)=begin index부터 endIndex까지 대상문자열을 잘라 리턴");
        System.out.println("text.subSequence(int beginIndex, int endIndex)=charSequence타입으로 리턴");
        System.out.println("text.split(String regex,(int limit))=정규표현색대로 문자열을 잘라서 배열로 리턴 limit시 해당 크기를 넘지 않는다");

        //String 값을 바꾸는 메소드들
        System.out.println("String 값을 바꾸는 메소드들");
        System.out.println("trim()=맨앞과 맨뒤 공백제거");
        System.out.println("replace(char oldchar, char newChar)=찾아서 대체");
        System.out.println("format(String format, object... args)=format에 있는 문자열의 내용중 변환해야하는 부분을 args 내용으로 변경");
        System.out.println("text=제 이름은 %s입니다. 지금까지 %d의 책을 썻고 하루에 %f %%의 시간을 할애 하고있습니다");
        System.out.println("String.format(text,\"이름\",10,30.5)");
        System.out.println("text.toLowerCase()=소문자변경");
        System.out.println("String.valueOf()=문자열로 변경,객체가 null일때는 toString보다 이걸 추천");
        System.out.println("String.intern()=커넥션풀에 저장하지만 절때로 쓰지마라, 시스템성능저하온다");
    }   

    public void explain_StringBuffer_And_StringBulider(){
        //jdk5미만의 String은 +연산을하고 다시 그객체에 넣으면 이전객체가 변하는게 아닌 버려지고 새로운 객체가 만들어진다 이 클래스들은 그것들 보완하기 위해 만들어짐
        //jdk5이상부터는 +연산시 자동으로 StringBuffer연산이 적용되나 for 반복문은 적용안된다고함 jdk5기준인듯
        //이클래스들은 +연산대신 append 메소드로 연산함
        StringBuffer sbf=new StringBuffer(); //ThreadSafe
        StringBuilder sbi=new StringBuilder(); //ThreadNoSafe
    }

    public void printByteArray(byte[] array){
        for(byte data:array){
            System.out.print(data +"");
        }
        System.out.println();
    }


}
