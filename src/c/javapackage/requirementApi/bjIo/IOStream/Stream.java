package c.javapackage.requirementApi.bjIo.IOStream;

import javax.sound.sampled.AudioInputStream;
import java.io.*;

public class Stream {
    public static void main(String[] args){

    }

    //인풋 스트림과 아웃풋스트림은 closeable이라는 인터페이스를 구현했는데 이것은 항상 작업이 끝나면 그걸 닫으라는 의미이다. 무조건!
    public void inputstream(){
        //인풋스트림은 abstract 클래스고 그걸 확장해서 구현한 클래스들이 있다
        //그리고 가장많이쓰는건 주석으로 설명적어놓음
//        AudioInputStream audioInputStream=new AudioInputStream();
//        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream();
//        FileInputStream fileInputStream=new FileInputStream();//파일을 읽는데 주로 씀//텍스트파일보다 이미지같은 바이트코드로 된 데이터
//        FilterInputStream filterInputStream=new FilterInputStream();//다른 입력스트림을 포괄
//        ObjectInputStream objectInputStream=new ObjectInputStream();//오브젝트 아우풋스트림으로 저장된 데이터읽을때 사용
//        PipedInputStream pipedInputStream=new PipedInputStream();
//        SequenceInputStream sequenceInputStream=new SequenceInputStream();
        //필터인풋스트림을 또 계승받은건 많이있고 진짜 abstract 메소드를 구현한것마다 다차이남
//
//        InputStream inputStream;
//        inputStream.available();//스트림에서 중단없이 읽을수 있는 바이트 갯수리턴
//        inputStream.mark();//스트림의 현재 위치를 표시해둔다
//        inputStream.reset();//현재 위치를 mark()메소드가 호출되었던 위치로 되돌린다
//        inputStream.markSupported();//mark나 reset메소드가 수행가능한지 확인
//        inputStream.read();//스트림에서 다음 바이트를 읽는다-유일한 abstract 메소드
//        inputStream.skip();//매게변수 long 길이만큼 데이터를 건너뛴다
//        inputStream.close();//스트림에서 작업중인 대상을 해제
    }
    
    public void outputstream(){
//        OutputStream outputStream;
//        outputStream.write();//매개변수로 받은 바이트배열을 저장 인트를 받을경우 실제저장되는것은 바이트로 저장
//        outputStream.flush();//저장을할때는 버퍼를 사용하는게 좋은데 이거는 버퍼에있는 내용을 저장하라는 메소드이다
//        outputStream.close();//알거라 믿음
    }
}
