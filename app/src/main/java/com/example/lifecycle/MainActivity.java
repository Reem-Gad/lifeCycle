package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"create",Toast.LENGTH_LONG).show();

    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this,"resume",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this,"pause",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this,"stop",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this, "restart", Toast.LENGTH_LONG).show();
    }

   @Override
   public void onDestroy() {
       super.onDestroy();
       Toast.makeText(this, "destroy", Toast.LENGTH_LONG).show();

   }
   public void Next(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

}
