import java.io.*;

class WriteFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data/file.txt");

            writer.write("this is some data to write\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}