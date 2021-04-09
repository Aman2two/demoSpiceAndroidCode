package com.example.spiceapplauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import io.flutter.embedding.android.FlutterActivity;
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.btn_open_app)
        button.setOnClickListener {
            // launch flutter app
            try {
                startActivity(FlutterActivity.createDefaultIntent(this));
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show();
            }
        }
    }
}