package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class Login extends AppCompatActivity {
    public Socket socket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button but = findViewById(R.id.button);
        String name = "a";
       // try {
          //  socket = IO.socket("http://192.168.0.113:3000/");
          //  socket.connect() ;
           // socket.emit("join",name);
     //   } catch (URISyntaxException e) {
      //      e.printStackTrace();
     //   }


        but.setOnClickListener((view)-> {
        //    TextView textView = findViewById(R.id.textView);
         //   int o = Integer.parseInt(textView.getText().toString());
          //  int l = Increment.double_value(o);
        //    textView.setText(Integer.toString(l));
           Intent go = new Intent(getApplicationContext(),MainActivity.class);
           startActivity(go);
          //  socket.emit("join",name);

        });
    }
}
