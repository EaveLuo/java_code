import java.io.File;

public class FileTravel {

    public static void main(String[] args) {
        File file = new File("/usr/coding/java_code/");
        File[] files = file.listFiles();
        readfile(files);

    }

    public static void readfile(File[] files) {
		if (files == null) { 
            return;  
        } 
		for(File f:files) {
			if(f.isFile()) {
				System.out.println(f.getAbsolutePath());
			}
			else if(f.isDirectory()) {
				readfile(f.listFiles());
			}
		}
    }

}
