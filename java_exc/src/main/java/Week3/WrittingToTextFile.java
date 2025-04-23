package Week3;

import java.io.*;

public class WrittingToTextFile {

    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");
            writer.write("\nI would like to add more into this file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
