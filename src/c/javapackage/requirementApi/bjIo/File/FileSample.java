package c.javapackage.requirementApi.bjIo.File;

import java.io.File;
import java.io.IOException;

public class FileSample {
    public static void main(String []args){
        FileSample sample=new FileSample();
//        String pathName="F:\\Desktop\\study\\javastudy\\bjJavaStudy";
        String pathName="F:"+File.separator+"Desktop"+File.separator+"study"+File.separator+"javastudy"+File.separator+"text";
        sample.checkPath(pathName);
        sample.checkFile(pathName,"test.txt");
    }

    //디렉토리 만들고 체크
    private void checkPath(String pathName) {
        File file=new File(pathName);
        System.out.println("Make "+pathName+" result ="+file.mkdir());
        System.out.println(pathName+" is directory? - "+file.isDirectory());
        System.out.println(pathName+" is file? - "+file.isFile());
        System.out.println(pathName+" is hidden? - "+file.isHidden());
        System.out.println(pathName+" can read? - "+file.canRead());
        System.out.println(pathName+" can write? - "+file.canWrite());
        System.out.println(pathName+" can execute? - "+file.canExecute());
//        System.out.println("Delete "+pathName+" result = "+file.delete());

    }
    //파일만들고 체크
    public void checkFile(String pathName, String fileName){
        File file=new File(pathName,fileName);
        try {
            System.out.println("Create result = "+file.createNewFile());//파일메소드는 IOexception을 던짐

            System.out.println("Absolute path ="+file.getAbsolutePath()); //a에서 b디렉토리로 이동 했을때 C:\BJJavaStudy\a..\b
            System.out.println("Absolute file ="+file.getAbsoluteFile());

            System.out.println("Cononical path ="+file.getCanonicalPath());//a에서 b디렉토리로 이동 했을때 C:\BJJavaStudy\b
            System.out.println("Cononical file ="+file.getCanonicalFile());

            System.out.println("디렉토리 이름만 확인 = " +file.getParent());
            System.out.println("Name = "+file.getName());
            System.out.println("Path = "+file.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
