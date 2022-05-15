package app.easyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Mainlight extends AppCompatActivity {
private Switch dark;
private Button joinlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlight);
        this.dark=(Switch) findViewById(R.id.switch1);
        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homedark = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(homedark);

            }
        });
        this.joinlight=(Button) findViewById(R.id.joinlight);
        joinlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscription = new Intent(getApplicationContext(), inscription_light.class);
                startActivity(inscription);

            }
        });

    }
}
