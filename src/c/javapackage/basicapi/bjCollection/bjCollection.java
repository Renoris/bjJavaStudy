package c.javapackage.basicapi.bjCollection;

import java.math.BigDecimal;
import java.sql.Statement;
import java.util.*;
import java.util.Map.Entry;
public class bjCollection {

    //컬렉션에는 여러가지가 있다
    //순서가 중요하지않은 목록 set
    //순서가 중요한 list
    //먼저들어온것이 먼저나가는 queue
    //키-값으로 저장되는 map

    //그리고 list를 상속받은 arraylist, linkedlist
    //Queue를 상속받은 linkedlist,priorityQueue-
    //Linked 리스트란? A,B,C가있을때 A는 B가 뒤에있는거 알고 B는 C는 뒤에 A는앞에있는거 알고 C는 B가 자신의 앞에있는것만암-메모리 효율증가
    //set을 상속받은 HashSet, treeSet
    //HashSet을상속받은 LinkedHashSet

    //Map을 상속받은
    //HashMap, treeMap
    //HashMap을상속받은 LinkedHashMap이잇다
    public void bjCollectionMethodArrayList(){
        //ArrayList
        ArrayList<Object> list1=new ArrayList<>(); //jdk6이상부터는 뒤에있는 <>는 안해도됨
        list1.add(new Object());
        ArrayList<Object> list2=new ArrayList<>(100); //리스트 초기 크기지정 default는 10이지만 10을넘어가면 늘리는 작업이 부하로 다가옴 그러니까 초기크기 알면 미리적자
        list2.add(4,new Object());
        Object asd=new Object();
        list2.toArray();//Object배열로 리턴
        list2.toArray(new String[0]);//String type으로 리턴-매개변수를 얼마나 넘겨주던 상관없는데 만약 크기가 넘치는걸 넘겨줄경우 남은거에다 null을 담아줌
        list2.remove(asd);//asd와 똑같은 첫번째 Object제거
        list2.remove(0); //0위치 제거
        
        //stack
        Stack<Object> stack1=new Stack<>();
        Object stackObject=new Object();
        stack1.empty();//비어잇는지확인
        stack1.peek();//맨위 데이터리턴
        stack1.pop();//맨위 데이터 지우고 리턴
        stack1.push(stackObject);//맨위 데이터 삽입
        stack1.search(stackObject);//넘어온 오브젝트 위치 리턴
        
        //Set-중복방지
        //Hashset-순서가 전혀 필요없는 데이터를 해시테이블에 저장-가장성능이좋음
        //treeset-저장된 데이터의 값에 따라서 정렬되는 set
        //LinkedSet-저장된 순서에따라서 값이 정렬

        //HashSet
        Object objecthashset=new Object();
        HashSet hashSet1=new HashSet();
        HashSet hashSet2=new HashSet(5,0.75f);//숫자만큼의 데이터저장공간과 0.75로드팩터를 갖는 객체 생성 0.75는 디폴트값이라 안적어줘도됨
        //로드팩터란? 데이터갯수/저장공간-데이터의 갯수가 로드팩터보다 커지면 저장공간크기증가하고 재정리함 로드팩터가 클수록 공간은 넉넉해지지만 데이터 찾는 시간 증가
        hashSet1.add("힌");//데이터추가
        hashSet1.clear();//데이터비우기
        hashSet1.clone();//해쉬셋 데이터 복제 리턴값 Object 다만 안의 내용은 복사하지않음
        hashSet1.contains(objecthashset);//이 객체가 있는지 확인;
        hashSet1.isEmpty();//데이터가 존재하는지 확인
        hashSet1.iterator();//데이터를 하나씩 꺼내기위해 Iterator객체 리턴
        hashSet1.remove(objecthashset);//제거
        hashSet1.size();//사이즈 리턴

        //LinkedList
        Object objectlinkedlist=new Object();
        LinkedList<Object> linkedList1=new LinkedList<>();
        //맨앞에추가
        linkedList1.addFirst(objectlinkedlist);//권장
        linkedList1.push(objectlinkedlist);
        linkedList1.offerFirst(objectlinkedlist);

        //맨뒤에추가
        linkedList1.add(objectlinkedlist);//이거나
        linkedList1.addLast(objectlinkedlist);//이거 권장
        linkedList1.offer(objectlinkedlist);
        linkedList1.offerLast(objectlinkedlist);
        //특정위치추가
        linkedList1.add(5,objectlinkedlist);

        linkedList1.set(5,objectlinkedlist);//위치 에있는거 변경
        linkedList1.getFirst();//맨앞 가져오기
        linkedList1.getLast();//맨뒤가져오기
        linkedList1.get(5);//그위치 가져오기
        linkedList1.contains(objectlinkedlist);//이객체가 있는지 확인
        linkedList1.indexOf(objectlinkedlist);//이 객체의 위치를 앞에서부터 확인
        linkedList1.lastIndexOf(objectlinkedlist);//이객체의 위치를 뒤에서부터 확인

        linkedList1.remove();//가장 앞에있는 객체 삭제하고 리턴 removeFirst도마찬가지
        linkedList1.removeLast();//가장 뒤에있는 객체 삭제하고 리턴
        
        linkedList1.remove(5);//그위치 데이터 제거하고 리턴
        linkedList1.remove(objectlinkedlist);//객체와 동일한 객체 앞에서부터 찾아서 처음발견된거 제거
        linkedList1.removeLastOccurrence(objectlinkedlist);//객체와 동일한 객체 뒤에서부터 찾아서 처음발견된거 제거

        HashMap<String, String> hmap=new HashMap<>();
        hmap.put("A","a");
        hmap.get("A");
        hmap.remove("A");// collection은 없는 값을 리턴하려고하면 에러가 뜨지만 맵은 null을 리턴한다
        Set<String>set=hmap.keySet();//키들을 리턴
        Collection<String> values=hmap.values();//값들을 리턴
        Set<Entry<String,String>> entries=hmap.entrySet();// 엔트리는 단하나의 키-값을 가짐- 이러한 방법도 있다
        hmap.containsKey("A");//있는지 확인
        hmap.containsValue("a");//마찬가지
        TreeMap<String,String> tmap=new TreeMap<>();//이건 숫자>알파벳 대문자>소문자>한글순으로정렬
        
        //properties-hashtable을 확장한 클래스
        Properties prop=System.getProperties();//
        //prop.load()
        //prop.loadFromXML();
        //뭐 여러가지있는데 모르것다...이건

        //date 객체
        Date date=new Date();
        long time1=date.getTime();
        date.setTime(time1);//객체의 시간을 매개변수로 맞춤
        //캘린더 객체//밑에 메소드로 확인
        Calendar cal=Calendar.getInstance();
        Calendar greCal=new GregorianCalendar();

        //컬렉션들의 도우미 Collections-static 메소드임
        //Collections.sort() 등등

        //배열의 도우미 Arrays
        Random random=new Random();
        random.nextInt();//랜덤으로 정수구함

        //문자열 자르기 StringTokenizer
        String test1="1, 2, 3, 훟 하 하하 나는야 천재";
        StringTokenizer stringTokenizer=new StringTokenizer(test1);

        //정확한 숫자계산 BigDicimal-double은 근사치를 제공해주지 완전 정확한값 제공안해줌 float도
        BigDecimal value=new BigDecimal("1.0");
        BigDecimal adding=new BigDecimal("0.1");
        value.add(adding);
        value.subtract(adding);
        value.multiply(adding);
        value.divide(adding);
    }

    public void checkArrayList3(){
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        String[] tempArray=new String[2];
        String[] strList=list.toArray(tempArray);

        for(String temp:strList){
            System.out.println(temp);
        }

        HashMap<String, String> hmap=new HashMap<>();
        hmap.put("A","a");
        hmap.put("A","d");
        hmap.get("A");
        System.out.println(hmap.get("A"));
        hmap.remove("A");// collection은 없는 값을 리턴하려고하면 에러가 뜨지만 맵은 null을 리턴한다
        System.out.println();

    }

    public void getproperties(){
        Properties prop=System.getProperties();
        Set<Object> keySet=prop.keySet();
        for(Object tempObject:keySet){
            System.out.println(tempObject+"="+prop.get(tempObject));
        }
    }

    public void Calender(){
        Calendar cal=Calendar.getInstance();
        Calendar greCal=new GregorianCalendar();

        int year=greCal.get(Calendar.YEAR);
        int month=greCal.get(Calendar.MONTH);//1월은 0부터시작
        int date=greCal.get(Calendar.DATE);

        String monthKorea=greCal.getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.KOREA);

        greCal.add(Calendar.DATE,5);// 캘린더 객체의 5일이 증가됨
        greCal.roll(Calendar.DATE,-6);//캘린더 객체의 5일이 증가되지만 만약 29,30,31일중 그냥 달이넘어갓을경우 그 달의 증감이없음=>2월 28일+5일=>2월 3일?

    }

    public void StringTokenizer(){
        String test1="1, 2, 3, 훟 하 하하 나는야 천재";
        StringTokenizer stringTokenizer1=new StringTokenizer(test1);

        while( stringTokenizer1.hasMoreElements()){
            String tempData= stringTokenizer1.nextToken();
            System.out.println(tempData);
        }

        StringTokenizer stringTokenizer2=new StringTokenizer(test1,",");
        while( stringTokenizer2.hasMoreElements()){
            String tempData= stringTokenizer2.nextToken();
            System.out.println(tempData);
        }
    }
    public static void main(String[] args){
        bjCollection bjCollection=new bjCollection();
        bjCollection.checkArrayList3();
    }
}
