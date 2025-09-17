import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class C1_FileOutputStream {

    public static void main(String[] args) throws IOException {


        File f = new File("D:\\java programs\\Java\\JavaIOStreams\\Files", "test.txt");
        f.createNewFile();
        try(FileWriter fos = new FileWriter(new File("D:\\java programs\\Java\\JavaIOStreams\\Demo.txt"), true)){
            fos.write("Hello");

            fos.flush();
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
