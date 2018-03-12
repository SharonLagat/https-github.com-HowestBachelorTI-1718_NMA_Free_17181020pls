package be.howest.ti.yd.fitness_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculation_Max_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation__max_);
        // todo put in a function
        initResult();
    }

    public void initResult(){
        TextView tv_result = (TextView) findViewById(R.id.tv_result);
        Intent mIntent = getIntent();
        double maxWeight = mIntent.getDoubleExtra("maxWeight", 0);
        tv_result.setText("The result is: " + maxWeight);
    }


}
