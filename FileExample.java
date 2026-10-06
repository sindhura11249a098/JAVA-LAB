import java.io.*;

class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("data.txt");
            w.write("Hello Java");
            w.close();

            FileReader r = new FileReader("data.txt");
            int c;
            while ((c = r.read()) != -1)
                System.out.print((char)c);
            r.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}