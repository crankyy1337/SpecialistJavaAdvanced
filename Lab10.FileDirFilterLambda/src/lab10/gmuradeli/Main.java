package lab10.gmuradeli;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File dir = new File("../");
        try {
            System.out.println(dir.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File[] files = dir.listFiles( pathname-> pathname.isFile());

        for(File f : files)
            System.out.printf("%-20s %tF %tT\n", f.getName(), f.lastModified(), f.lastModified());

    }
}