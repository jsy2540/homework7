package com.example.a403.myapplication;
import android.content.DialogInterface;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.CalendarView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    RadioButton RB1, RB2;
    Button B1, B2;
    Chronometer CM;
    TextView TV;
    CalendarView CV;
    TimePicker TP;
    String date="";
    Switch SW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CM = (Chronometer) findViewById(R.id.chronometer);
        SW = (Switch) findViewById(R.id.reserve_switch);


    }
}