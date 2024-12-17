package com.example.infinity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the TextView
        welcomeText = findViewById(R.id.welcomeText);

        // Set an OnClickListener to the TextView
        welcomeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to go to SignUpActivity
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);  // Start the SignUpActivity
            }
        });
    }
}
