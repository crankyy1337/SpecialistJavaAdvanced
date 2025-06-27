package lab9.gmuradeli;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File dir = new File("../");
        System.out.println(dir.getCanonicalPath());

        int days = 1;

        File[] files = dir.listFiles( new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });


        for(File f : files)
            System.out.printf("%s %tF\n", f.getName(), f.lastModified());

    }
}