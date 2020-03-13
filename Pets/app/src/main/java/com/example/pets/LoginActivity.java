package com.example.pets;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // Toast.makeText(this, "", Toast.LENGTH_LONG).show();

    }

    @Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        return super.onCreatePanelView(featureId);
    }

    public void Btn_Login(View view){
        Toast.makeText(this, "You have pressed login button", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,InboxActivity.class);
        startActivity(intent);
    }
    public void Btn_Signupe (View view){
        Toast.makeText(this, "You have preseed sing up button", Toast.LENGTH_SHORT).show();
    }
}
/*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "The app has started", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "The app is on your screen", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "the app has been paused ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "the app has bee stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "the app has benn restarted", Toast.LENGTH_SHORT).show();
    }

}
*/