package com.example.fate.meritcalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText total,marks;
    Button calculate;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total=(EditText)findViewById(R.id.total);
        marks=(EditText)findViewById(R.id.marks);
        calculate=(Button)findViewById(R.id.calculate);
        String s;

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i,j;
                double k;
                i= Double.parseDouble(marks.getText().toString());
                j=Double.parseDouble(total.getText().toString());

                if(i>j)
                {
                    Toast.makeText(MainActivity.this, "MARKS OBTAINED should be less than TOTAL MARKS.", Toast.LENGTH_SHORT).show();
                }
               else {
                    k= (i / j * 100);
                    if ( k >=60){
                        Toast.makeText(MainActivity.this, "You Have Passed With FIRST DIVISION.", Toast.LENGTH_SHORT).show();
                    }else if(k>=40){
                        Toast.makeText(MainActivity.this, "You Have Passed With SECOND DIVISION.", Toast.LENGTH_SHORT).show();
                    }else if(k>=33){
                        Toast.makeText(MainActivity.this,"You Have Passed With THIRD DIVISION.", Toast.LENGTH_SHORT).show();
                    }else if (k<33&&k>0){
                        Toast.makeText(MainActivity.this, "You Failed.", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}
