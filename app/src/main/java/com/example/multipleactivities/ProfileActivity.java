package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
private Button signout;
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "Profile activity resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "Profile activity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "Profile activity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "Profile activity destroyed.");
    }
//denna är fel
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d("==>", "Profile activity created.");
        signout = findViewById(R.id.signout_button);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Sign out");
            }
        });
    }
}