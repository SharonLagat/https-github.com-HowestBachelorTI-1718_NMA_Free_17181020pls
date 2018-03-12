package be.howest.ti.yd.fitness_tracker.models.RM;

/**
 * Created by Yanni on 12/03/2018.
 */

public class RMInput {
    private int reps;
    private int weight;

    public RMInput(int reps, int weight) {
        this.reps = reps;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
