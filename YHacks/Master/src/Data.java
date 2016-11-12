import java.io.*;
import java.util.*;

/**
 * Created by alexsanchez on 2016-11-12.
 */
public class Data {

    private static ArrayList<Food> data = new ArrayList<>();
    private static final File DATA_FILE = new File("../Resources/data.txt");

    public Data() {
        buildData();
        print();
    }

    private void buildData() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(DATA_FILE));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
            e.printStackTrace();
            return;
        }
        String line;
        try {
            while((line = br.readLine()) != null) {
                Food entry = new Food(line.split("_"));
                data.add(entry);
            }
        } catch (IOException e) {
            System.out.println("ERROR: could not read line.");
            e.printStackTrace();
            return;
        }
        Collections.sort(data, (f1, f2) -> f1.getCalories() > f2.getCalories() ? 1 : -1);
    }

    private void print() {
        for(Food food : data) {
            System.out.format("ID: %s\tName: %s\tCalories: %s\n", food.getID(), food.getName(), food.getCalories());
        }
    }
}

