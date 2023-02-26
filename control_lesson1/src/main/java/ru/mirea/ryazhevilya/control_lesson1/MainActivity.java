package ru.mirea.ryazhevilya.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button titanButton;
    private Button hunterButton;
    private Button warlockButton;
    private TextView tvMainInfo;
    private TextView tvWelcomeDesc;
    private TextView tvChooseInvite;
    private final String chooseInviteStartText = "Choose between Warlock, Hunter, or Titan.";
    private final String chooseInviteTitanText = "Titan. Strong and resilient frontline fighter." +
            "Crush your enemies with your rage and fists!";
    private final String chooseInviteHunterText = "Hunter. Cunning and quick saboteur. " +
            "Rupture enemy legions and deplete them!";
    private final String chooseInviteWarlockText = "Warlock. Intelligent and focused support. " +
            "Help your comrades and destroy enemies with Light!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMainInfo = findViewById(R.id.textViewMainInfo);
        tvWelcomeDesc = findViewById(R.id.textViewWelcomeDesc);
        tvChooseInvite = findViewById(R.id.textViewChooseInvite);
        tvMainInfo.setText("YOUR DESTINY AWAITS");
        tvWelcomeDesc.setText("               Rise up, Guardian. \n What class would you like to choose?");
        tvChooseInvite.setText(chooseInviteStartText);

        titanButton = findViewById(R.id.titan_button);
        hunterButton = findViewById(R.id.hunter_button);
        warlockButton = findViewById(R.id.warlock_button);

        titanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvChooseInvite.getText().equals(chooseInviteTitanText)) tvChooseInvite.setText(chooseInviteTitanText);
                else tvChooseInvite.setText(chooseInviteStartText);
            }
        });
        hunterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvChooseInvite.getText().equals(chooseInviteHunterText)) tvChooseInvite.setText(chooseInviteHunterText);
                else tvChooseInvite.setText(chooseInviteStartText);
            }
        });
        warlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvChooseInvite.getText().equals(chooseInviteWarlockText)) tvChooseInvite.setText(chooseInviteWarlockText);
                else tvChooseInvite.setText(chooseInviteStartText);
            }
        });
    }
}