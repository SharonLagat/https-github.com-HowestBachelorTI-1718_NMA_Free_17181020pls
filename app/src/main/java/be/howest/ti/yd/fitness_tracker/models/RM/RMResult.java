package be.howest.ti.yd.fitness_tracker.models.RM;

/**
 * Created by Yanni on 12/03/2018.
 */

public class RMResult {
    private RMInput rmInput;
    private double result;

    public RMResult(RMInput rmInput) {
        this.rmInput = rmInput;
        this.result = calculateResult();
    }

    public RMInput getRmInput() {
        return rmInput;
    }

    public void setRmInput(RMInput rmInput) {
        this.rmInput = rmInput;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double calculateResult(){
        // formula =  weight / ( 1.0278 – 0.0278 × reps )
        result = rmInput.getWeight() / (1.0278 - 0.0278 * rmInput.getReps());
        return result;
    }
}
