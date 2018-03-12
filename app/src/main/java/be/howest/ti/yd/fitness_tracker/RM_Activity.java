package be.howest.ti.yd.fitness_tracker;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import be.howest.ti.yd.fitness_tracker.Filter.MaxNumberFilter;
import be.howest.ti.yd.fitness_tracker.models.RM.RMInput;
import be.howest.ti.yd.fitness_tracker.models.RM.RMResult;

public class RM_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rm_);
        fillInExercises();
        initEditFields();

    }
    public void fillInExercises(){
        Spinner spinner = (Spinner) findViewById(R.id.exerciseSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exercise_array, android.R.layout.simple_spinner_item);
        // Specify the layout1 to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    public void initEditFields(){
        implementEditLimitFilter("editRep",8);
        implementEditLimitFilter("etWeight",250);
    }

    public void implementEditLimitFilter(String id,int max){
        Resources res = getResources();
        int resId = res.getIdentifier(id, "id", getPackageName());
        EditText editRep = (EditText)findViewById(resId);
        editRep.setFilters(new InputFilter[]{new MaxNumberFilter(0, max)});
    }

    public void showCalculationMax(View view){
        EditText editRep= (EditText) findViewById(R.id.editRep);
        EditText editWeight = (EditText) findViewById(R.id.etWeight);
        //get weight and reps values

        int reps = Integer.parseInt( editRep.getText().toString() );
        int weight = Integer.parseInt(editWeight.getText().toString());

        RMInput rmInput = new RMInput(reps,weight);
        RMResult rmResult = new RMResult(rmInput);

        //calculate 1 rm

        // formula =  weight / ( 1.0278 – 0.0278 × reps )

        // send 1rm to next activity
        Intent intent = new Intent(this,calculation_Max_Activity.class);
        intent.putExtra("maxWeight", rmResult.getResult());
        startActivity(intent);
    }





}
