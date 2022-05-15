package app.easyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class choose extends AppCompatActivity {
    private Button prof;
    private Button student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        this.prof=(Button) findViewById(R.id.prof);
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscription_prof = new Intent(getApplicationContext(), inscription.class);
                startActivity(inscription_prof);
            }
        });
        this.student=(Button) findViewById(R.id.student);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscription = new Intent(getApplicationContext(), inscription.class);
                startActivity(inscription);

            }
        });

    }
}
