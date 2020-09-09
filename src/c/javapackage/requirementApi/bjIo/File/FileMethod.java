package c.javapackage.requirementApi.bjIo.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileMethod {
    public void methodlist(){
        File.listRoots();//jvm이 수행되는 os에서 사용중인 파일시스템의 루트 디렉터리목록을 File배열로 리턴
        String pathName="F:"+File.separator+"Desktop"+File.separator+"study"+File.separator+"javastudy"+File.separator+"text";
        File file=new File(pathName);
        
        file.list();//현재 디렉토리 하위에 있는 목록을 String배열로리턴
        FilenameFilter filenameFilter=new JPGFileNameFilter();//JPGFileNameFilter는 파일네임필터인터페이스를 내가 구현한 클래스
        file.list(filenameFilter);//현재 디렉토리 하위에 있는 목록증 매개변수로 넘어온 filter의 조건에 맞는 목록을 String 배열로 리턴


        FileFilter fileFilter=new JPGFileFilter();
        file.listFiles();//현재 디렉토리 하위에 있는 목록을 File배열로리턴
        file.listFiles(fileFilter);//현재 디렉토리 하위에 있는 목록중 Filefilter에 걸러진 것들을 File배열로리턴
        file.list(filenameFilter);//알거라 믿음

    }
}

