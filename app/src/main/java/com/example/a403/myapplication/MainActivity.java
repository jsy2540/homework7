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
import static com.example.a403.myapplication.R.id.radioButton;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;
    RadioGroup RG;
    RadioButton RB1, RB2;
    Button B1, B2;
    Chronometer CM;
    TextView TV;
    CalendarView CV;
    TimePicker TP;
    String date="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button) findViewById(R.id.button);
        B2 = (Button) findViewById(R.id.button2);
        RB1 = (RadioButton) findViewById(R.id.radioButton);
        RB2 = (RadioButton) findViewById(R.id.radioButton2);
        CV = (CalendarView) findViewById(R.id.calendarView);
        TP = (TimePicker) findViewById(R.id.timePicker);
        TV = (TextView) findViewById(R.id.textView);
        CM = (Chronometer) findViewById(R.id.chronometer);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CM.setBase(SystemClock.elapsedRealtime());
                CM.start();
                CM.setTextColor(Color.RED);
            }
        });
        RB1.setChecked(true);
        RB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CV.setVisibility(View.VISIBLE);
                TP.setVisibility(View.INVISIBLE);
            }
        });
        RB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CV.setVisibility(View.INVISIBLE);
                TP.setVisibility(View.VISIBLE);
            }
        });

        CalendarView calendarView = (CalendarView)findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                date = year + "년"+ month + "월" + dayOfMonth + "일";
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CM.stop();
                CM.setTextColor(Color.BLUE);
                String time =  TP.getCurrentHour() + "시" + TP.getCurrentMinute() + "분";
                TV.setText( date + time +"예약됨");
            }
        });
    }
}