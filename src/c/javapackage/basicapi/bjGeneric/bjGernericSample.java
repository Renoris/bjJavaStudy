package c.javapackage.basicapi.bjGeneric;

public class bjGernericSample {
    public static void main(String []args){
        bjGernericSample sample =new bjGernericSample();
        sample.checkCastingDTO();
        sample.checkGenericDTO();
    }
//제너릭을 사용하지 않았을때
    public void checkCastingDTO(){
        CastingDTO dto1=new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2=new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3=new CastingDTO();
        dto3.setObject(new StringBuilder());

        String temp1=(String)dto1.getObject();
        StringBuffer temp2=(StringBuffer)dto2.getObject();
        StringBuilder temp3=(StringBuilder)dto3.getObject();
        //이렇게 했을때 만약 dto1이 어떤거고 dto2가 어떤건지 잊어먹엇을때 어떤게 버퍼고 스트링이고 빌더인지 어케앎?
        // - instanceOf 이란게 잇지만 이걸 계속해서 넣어줘야됨?
        //그리고 계속해서 형변환을 해줘야하는데?-리턴타입이 오브젝트니까
        //즉 이런걸 방지하기위해 미리 제네릭이라고 선언하는거임 - 어디에? CastingDTO에!
    }

    public void checkGenericDTO(){
        CastingGenericDTO<String> dto1=new CastingGenericDTO<String>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2=new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3=new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        String temp1=dto1.getObject();
        StringBuffer temp2=dto2.getObject();
        StringBuilder temp3=dto3.getObject();
        //형변환을 안해줘도됨!
    }
}
