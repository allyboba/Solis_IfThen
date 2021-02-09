package mcm.edu.ph.solis_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);
        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("You found yourself floating in space. \nYou don't remember how you got here. \nWill you check your oxygen supply?");



    }

    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtDecision);
        
        switch(view.getId()) {
            case R.id.btnDecision1:
                txtDecision.setText("You check your oxygen supply. It's at 41%. \nYou feel panic start to settle in.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("You decide to look around you. There is nothing but empty space \nas far as the eye can see. You feel panic start \nto settle in.");
                break;
        }
    }
}