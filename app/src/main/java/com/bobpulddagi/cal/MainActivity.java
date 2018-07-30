package com.bobpulddagi.cal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 정의된 위젯변수에 xml의 위젯 ID를 가져와서 담아준다.
        btnCal = (Button) findViewById(R.id.btnCal);

        // 3. 변수(위젯)을 리스너에 달아준다.
        btnCal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btnCal:
                Intent intent = new Intent(this, CalculatorActivity.class);
                startActivity(intent);
                break;
        }
    }
}
