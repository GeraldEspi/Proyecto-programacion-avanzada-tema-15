import java.io.*;

public class ReadingTextFile {

    public static void main(String args[])throws IOException {
        File doc = new File("persona.txt");
        doc.createNewFile();
        FileReader freader = new FileReader(doc);
        char [] i = new char[100];
        freader.read(i);
        for(char j : i)
            System.out.print(j);
        freader.close();
    }
}