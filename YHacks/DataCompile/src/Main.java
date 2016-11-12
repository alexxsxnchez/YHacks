import java.io.*;


//THIS PROGRAM IS NOW NOT TO BE USED ANY LONGER

public class Main {

    public static void main(String[] args) {
        /*String fileIn = "src/ABBREV.txt";
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
                line = line.replaceAll("~", "");
                line = line.trim();
                String[] values = line.split("\\^");
                for (int i = 0; i < values.length; i++) {
                    switch(i) {
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 20:
                        case 25:
                        case 31:
                        case 32:
                        case 40:
                        case 42:
                        case 43:
                        case 47:
                            bw.write(values[i] + "_");
                    }
                }
                bw.newLine();

            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Can't read line");
            e.printStackTrace();
            return;
        }
*/
    }

}
