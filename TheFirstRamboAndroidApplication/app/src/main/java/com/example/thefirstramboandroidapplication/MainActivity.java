package com.example.thefirstramboandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button greetingsButton;
    private TextView greetingText, ramboText;
    private EditText editPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       setContentView will set the user interface. is going to get the activity main.xml and show it to the user.

        greetingsButton = findViewById(R.id.greetingsButton);
        greetingText = findViewById(R.id.greetingId);
        editPersonName = findViewById(R.id.editPersonName);
        ramboText = findViewById(R.id.ramboId);

        greetingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editPersonName.getText().toString();
                String rambo ="Morning 1st Lieutenant!";
                if (name.isEmpty()) {
                    greetingText.setText(" ");
                }
                if (name.equals("Rambo")) {
                    ramboText.setText(rambo);
                    greetingText.setText("Back there I could fly a gunship, I could drive a tank, I was in charge of million dollar equipment, back here I can't even hold a job parking cars! ");
                } else {
                    greetingText.setText("Morning " + name);
                }
            }
        });

    }
}