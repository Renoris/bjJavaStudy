package c.javapackage.requirementApi.bjIo.File;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFileNameFilter implements FilenameFilter {
    //네임필터의 경우 파일의 이름만 구분해서 더 쉬워보이지만 애가 디렉토리인지 파일인지 구분못함
    @Override
    public boolean accept(File file, String fileName) {
        if(fileName.endsWith(".jpg")) return true;
        return false;
    }
}
