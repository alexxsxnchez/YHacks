import java.io.*;

public class Main {

    public static void main(String[] args) {
        String fileIn = "src/ABBREV.txt";
        String fileOut = "src/data.txt";
        BufferedReader br;
        BufferedWriter bw;
        try {
            br = new BufferedReader(new FileReader(fileIn));
        }
        catch(FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            e.printStackTrace();
            return;
        }
        try {
            bw = new BufferedWriter(new FileWriter(fileOut, true));
        } catch(IOException e) {
            System.out.println("Writer not working");
            e.printStackTrace();
            return;
        }
        String line;
        try {
            while ((line = br.readLine()) != null) {
                line = line.
                line = line.replaceAll("\\s+", " ");
                line = line.substring(1);
                String[] values = line.split("\\s");
                values =
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Can't read line");
            e.printStackTrace();
            return;
        }

    }

}
