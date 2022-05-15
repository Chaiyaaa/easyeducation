package app.easyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class connexion_light extends AppCompatActivity {
private TextView inscriptionlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion_light);
        this.inscriptionlight=(TextView)findViewById(R.id.Signuplight);
        inscriptionlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscription = new Intent(getApplicationContext(), inscription_light.class);
                startActivity(inscription);

            }
        });
    }
}
