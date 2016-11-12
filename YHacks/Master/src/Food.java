/**
 * Created by alexsanchez on 2016-11-12.
 */
public class Food {
    private String[] data;
    private int id;
    private String name;
    private double calories;

    public Food(String[] data) {
        this.data = data;
        this.id = Integer.parseInt(data[0]);
        this.name = data[1];
        this.calories = Double.valueOf(data[2]);
    }

    public String[] getData() {
        return data;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCalories() {
        return calories;
    }
}
