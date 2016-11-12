import java.util.*;
/**
 * Created by Michellew on 2016-11-12.
 */
public class Calculations {
    Data data;

    public Calculations(Data data) {
        this.data = data;

        //testing
        boolean female = true;
        int weight = 95;
        int height = 65;
        int age = 18;
        Activity_Level level = Activity_Level.LIGHTLY_ACTIVE;
        System.out.printf("%.0f", calculateCalories(female, weight, height, age, level));
    }

    public double calculateCalories(boolean female, int weight, int height, int age, Activity_Level level) {
        return calculateHR(calculateBMR(female, weight, height, age), level);
    }


    private double calculateBMR (boolean female, int weight, int height, int age){
        double constant;
        double weight_const;
        double height_const;
        double age_const;

        if (female) {
            constant = 655;
            weight_const = 4.35;
            height_const = 4.7;
            age_const = 4.7;
        }
        else {
            constant = 66;
            weight_const = 6.23;
            height_const = 12.7;
            age_const = 6.8;
        }
        return (constant + (weight_const * weight) + (height_const * height) - (age_const * age));
        }
    // Using Harris Benedit Equation
    // Very accurate in all but very muscular (under-estimate) and very fat (over-estimate)
    private double calculateHR (double bmr, Activity_Level level) {
        switch(level) {
            case SEDENTARY:
                bmr *= 1.2;
                break;
            case LIGHTLY_ACTIVE:
                bmr *= 1.375;
                break;
            case MODERATELY_ACTIVE:
                bmr *= 1.55;
                break;
            case VERY_ACTIVE:
                bmr *= 1.725;
                break;
            case EXTRA_ACTIVE:
                bmr *= 1.9;
                break;
        }
        return bmr;
    }
    private ArrayList<Food> calculateBestCombo() {
        for(Food food : data.getData()) {



        }
        return null;
    }
}