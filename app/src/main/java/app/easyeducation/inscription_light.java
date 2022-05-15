package app.easyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inscription_light extends AppCompatActivity {
private TextView connexiontionlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_light);
        this.connexiontionlight=(TextView) findViewById(R.id.signinlight);
        connexiontionlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connexion = new Intent(getApplicationContext(), connexion_light.class);
                startActivity(connexion);

            }
        });

    }
}
