package com.example.a403.myapplication;
import android.content.DialogInterface;
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

import static com.example.a403.myapplication.R.id.radioButton;

public class MainActivity extends AppCompatActivity {
    Switch S1;
    LinearLayout L1;
    RadioGroup R1;
    RadioButton RB1, RB2, RB3;
    ImageView I1;
    Button B1, B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        S1 = (Switch) findViewById(R.id.switch1);
        L1 = (LinearLayout) findViewById(R.id.activity_main);
        R1 = (RadioGroup) findViewById(R.id.RG);
        RB1 = (RadioButton) findViewById(R.id.radioButton);
        RB2 = (RadioButton) findViewById(R.id.radioButton2);
        RB3 = (RadioButton) findViewById(R.id.radioButton3);
        I1 = (ImageView) findViewById(R.id.imageView);
        B1 = (Button) findViewById(R.id.button3);
        B2 = (Button) findViewById(R.id.button4);

        S1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                    L1.setVisibility(View.VISIBLE);
                else
                    L1.setVisibility(View.INVISIBLE);
            }
        });
        RB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    I1.setImageResource(R.drawable.jel);
            }
        });
        RB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    I1.setImageResource(R.drawable.kit);
            }
        });
        RB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    I1.setImageResource(R.drawable.rol);
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "종료합니다.", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                S1.setChecked(false);
                L1.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"처음으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
