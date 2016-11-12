/**
 * Created by alexsanchez on 2016-11-12.
 */
public class Food {
    private String[] data;

    public Food(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
    public String getID() {
        return data[0];
    }
    public String getName() {
        return data[1];
    }
    public double getCalories() {
        return Double.valueOf(data[2]);
    }
    public double getProtein() {
        return Double.valueOf(data[3]);
    }
    public double getFat() {
        return Double.valueOf(data[4]);
    }
    public double getCarbs() {
        return Double.valueOf(data[5]);
    }
}
