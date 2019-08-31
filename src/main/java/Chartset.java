import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Chartset {

    public static String path = "C:\\Users\\it\\Desktop\\documents - 副本\\Markdown编写规范.md";

    public static String[] code = {"GBK", "ANSI", "UTF-16LE", "UTF-16BE", "UTF-8", "ASCII", "ISO-8859-1", "GB2312",
            "GB18030", "UTF-16"};

    public static void main(String[] args) {
        for (String co:
             code) {
            System.out.println(co + ":");
            System.out.println(load(co).toString());
        }

    }

    public static StringBuffer load(String code) {
        StringBuffer buffer = new StringBuffer("");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), code));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                buffer.append(temp);
            }
            br.close();
            return buffer;
        } catch (Exception e) {
            System.err.println("--读取文件-> [" + path + "] 失败!");
            e.printStackTrace();
        }
        return buffer; // buffer.length()==0
    }
}
