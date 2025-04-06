package src;

import java.io.*;

public class Main {
    public static String fileName = "src/sometext.txt";

    public static void main(String[] args) {
        // try with resources ავტომატურად ხურავს რესურსებს
        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write("Here is some text\n");
            fileWriter.write("Here is other text\n");
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
