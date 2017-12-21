package com.example.snaheel.hdwc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    SpinnerAdapter adap;
    Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=(Spinner)findViewById(R.id.spinner1);
        editText=(EditText)findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String choice=spinner1.getSelectedItem().toString() ;
                String num=editText.getText().toString() ;
                Bundle tosend=new Bundle();
                tosend.putString("choice",choice);
                tosend.putString("number",num);
                Intent intent=new Intent(getBaseContext(),MainActivity2.class);
                intent.putExtras(tosend);
                startActivity(intent);
            }
        });

    }


}
