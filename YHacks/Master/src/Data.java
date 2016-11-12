import java.io.*;
import java.util.*;

/**
 * Description: This class takes in the nutrition data from "data.txt" in the "Resources" directory and organizes it
 *      into an arraylist sorted by calories (ascending)
 *
 * Author: Created by alexsanchez on 2016-11-12.
 */
public class Data {

    private static ArrayList<Food> data = new ArrayList<>();
    private static final File DATA_FILE = new File("../Resources/data.txt");
    private static final String DIVIDER = "_"; // divider used to differentiate data entries in "data.txt"

    public Data() {
        buildData();
        print();
        System.out.println(data.get(0).getData().length);
        System.out.println(data.get(0).getData()[21]);
    }

    private void buildData() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(DATA_FILE));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
            e.printStackTrace();
            return;
        }
        String line;
        try {
            while((line = reader.readLine()) != null) {
                Food entry = new Food(line.split(DIVIDER));
                data.add(entry);
            }
        } catch (IOException e) {
            System.out.println("ERROR: could not read line.");
            e.printStackTrace();
            return;
        }
        Collections.sort(data, (f1, f2) -> f1.getCalories() > f2.getCalories() ? 1 : -1);
    }
    // for testing
    private void print() {
        for(Food food : data) {
            System.out.format("ID: %s\t\tName: %s\t\tCalories: %s\n", food.getID(), food.getName(), food.getCalories());
        }
    }

    public ArrayList<Food> getData() {
        return data;
    }
}

