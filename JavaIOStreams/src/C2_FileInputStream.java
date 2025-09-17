import java.io.*;

public class c1_ByteInputStream {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\java programs\\Java\\JavaIOStreams\\Demo.txt");
        BufferedReader bf = new BufferedReader(file);
        FileOutputStream fis = new FileOutputStream(new File("D:\\java programs\\Java\\JavaIOStreams\\Demo.txt"));
        fis.write(65);
        String line;
        while ((line = bf.readLine()) != null){
            System.out.println(line);
        }

    }
}
