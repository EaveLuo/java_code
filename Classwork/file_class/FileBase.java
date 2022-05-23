import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileBase {
    public static void main(String[] args) throws IOException {
        String path = "/usr/coding/java_code/Classwork/file_class/";
        File f = new File(path, "test.txt");
        System.out.println("文件是否存在:" + (f.exists() ? "存在" : "不存在"));
        System.out.println("文件是否创建成功：" + (f.createNewFile() ? "创建成功" : "文件已存在，创建失败"));
        System.out.println("文件名称：" + f.getName());
        System.out.println("文件的相对路径：" + f.getPath());
        System.out.println("文件的绝对路径：" + f.getAbsolutePath());
        System.out.println("文件的父路径：" + f.getParent());
        System.out.println(f.isAbsolute() ? "是绝对路径" : "不是绝对路径");
        System.out.println("是否隐藏：" + (f.isHidden() ? "是隐藏文件" : "不是隐藏文件"));
        System.out.println(f.isFile() ? "是一个文件" : "不是一个文件");
        System.out.println(f.isDirectory() ? "是一个目录" : "不是一个目录");
        System.out.println(f.canRead() ? "可读取" : "不可读取");
        System.out.println(f.canWrite() ? "可写入" : "不可写入");
        System.out.println("最后修改日期为：" + new Date(f.lastModified()));
        System.out.println("文件大小：" + f.length());
    }
}
