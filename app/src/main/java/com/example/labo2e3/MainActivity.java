package com.example.labo2e3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = findViewById(R.id.btn_r);
        g = findViewById(R.id.btn_g);
        b = findViewById(R.id.btn_b);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red[] = {R.color.red,R.color.red1,R.color.red2,R.color.red3,R.color.red4,R.color.red5};
                r.setTag(String.valueOf(((Integer.parseInt((String)r.getTag()))+1)%6));
                r.setBackgroundResource(red[Integer.parseInt((String)r.getTag())]);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int green[] = {R.color.green,R.color.green1,R.color.green2,R.color.green3,R.color.green4,R.color.green5};
                g.setTag(String.valueOf(((Integer.parseInt((String)g.getTag()))+1)%6));
                g.setBackgroundResource(green[Integer.parseInt((String)g.getTag())]);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int blue[] = {R.color.blue,R.color.blue1,R.color.blue2,R.color.blue3,R.color.blue4,R.color.blue5};
                b.setTag(String.valueOf(((Integer.parseInt((String)b.getTag()))+1)%6));
                b.setBackgroundResource(blue[Integer.parseInt((String)b.getTag())]);
            }
        });
    }
}
