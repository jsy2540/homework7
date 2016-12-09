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

    RadioButton RB1, RB2, RB3, RB4, RB5;
    Button B1, B2, B3, B4;
    Chronometer CM;
    TextView TV1, TV2, TV3, TV4, TV5, TV6, TV7, TV8;
    CalendarView CV;
    TimePicker TP;
    String date="";
    Switch SW;
    ImageView IV;
    EditText adult, teenager, child;
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CM = (Chronometer) findViewById(R.id.CM);
        SW = (Switch) findViewById(R.id.reserve_switch);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        RB1 = (RadioButton) findViewById(R.id.RB1);
        RB2 = (RadioButton) findViewById(R.id.RB2);
        RB3 = (RadioButton) findViewById(R.id.RB3);
        RB4 = (RadioButton) findViewById(R.id.RB4);
        RB5 = (RadioButton) findViewById(R.id.RB5);
        CV = (CalendarView) findViewById(R.id.CV);
        TP = (TimePicker) findViewById(R.id.TP);
        TV1 = (TextView) findViewById(R.id.TV1);
        TV2 = (TextView) findViewById(R.id.TV2);
        TV3 = (TextView) findViewById(R.id.TV3);
        TV4 = (TextView) findViewById(R.id.TV4);
        TV5 = (TextView) findViewById(R.id.TV5);
        TV6 = (TextView) findViewById(R.id.TV6);
        TV7 = (TextView) findViewById(R.id.TV7);
        TV8 = (TextView) findViewById(R.id.TV8);
        IV = (ImageView) findViewById(R.id.IV);
        adult = (EditText) findViewById(R.id.adult);
        teenager = (EditText) findViewById(R.id.teenager);
        child = (EditText) findViewById(R.id.child);
        LL = (LinearLayout) findViewById(R.id.LL);

        SW.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    CM.setBase(SystemClock.elapsedRealtime());
                    CM.start();
                    String strColor = "#FF3F51B5";
                    CM.setTextColor(Color.parseColor(strColor));
                    LL.setVisibility(View.VISIBLE);
                }
                else {
                    CM.setBase(SystemClock.elapsedRealtime());
                    CM.stop();
                    String strColor = "#FF3F51B5";
                    CM.setTextColor(Color.parseColor(strColor));
                    LL.setVisibility(View.INVISIBLE);
                    adult.setText("");
                    teenager.setText("");
                    child.setText("");
                }
            }
        });

        CalendarView calendarView = (CalendarView)findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                date = year + "년"+ month + "월" + dayOfMonth + "일";
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CM.stop();
                CM.setTextColor(Color.BLUE);
                String time =  TP.getCurrentHour() + "시" + TP.getCurrentMinute() + "분";
            }
        });
    }
}