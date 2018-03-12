package be.howest.ti.yd.fitness_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void showLogActivity(View view){
        Intent intent = new Intent(this,Log_Activity.class);
        startActivity(intent);
    }

    public void showRMActivity(View view){
        Intent intent = new Intent(this,RM_Activity.class);
        startActivity(intent);
    }

    public void showRoutineActivity(View view){
        Intent intent = new Intent(this,Routines_Activity.class);
        startActivity(intent);
    }

}
