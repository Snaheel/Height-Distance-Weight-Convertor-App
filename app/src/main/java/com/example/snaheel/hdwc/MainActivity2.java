package com.example.snaheel.hdwc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Float.parseFloat;

public class MainActivity2 extends AppCompatActivity {

    EditText text1,text2;
    Spinner spinner3,spinner2;
    SpinnerAdapter spinneradapter;
    Button value;
    float num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        /*String output= "choice= "+bundle.getString("choice");
        output=output + "\nnumber= "+bundle.getString("number");
        TextView tv=new TextView(this);
        tv.setText(output);
        setContentView(tv);*/
        text1=(EditText)findViewById(R.id.text1);
        text2=(EditText)findViewById(R.id.text2);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner3=(Spinner)findViewById(R.id.spinner3);
        value =(Button)findViewById(R.id.value);

        text1.setText(bundle.getString("number"));
        String n=bundle.getString("number");
        num=parseFloat(n);

        if((bundle.getString("choice")).equals("weight")) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("killogram");
            list.add("gram");
            list.add("milligram");
            list.add("tonne");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
            spinner3.setAdapter(dataAdapter);

        }
        if((bundle.getString("choice")).equals("distance")) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("kilometer");
            list.add("meter");
            list.add("centimeter");
            list.add("millimeter");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
            spinner3.setAdapter(dataAdapter);

        }
        if((bundle.getString("choice")).equals("currency")) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("rupee");
            list.add("dollar");
            list.add("pound");
            list.add("yen");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
            spinner3.setAdapter(dataAdapter);

        }
        if((bundle.getString("choice")).equals("height")){
            ArrayList<String> list = new ArrayList<String>();
            list.add("feet");
            list.add("inch");
            list.add("meter");
            list.add("centimeter");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
            spinner3.setAdapter(dataAdapter);

        }
        value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float no=0;
                if((spinner2.getSelectedItem().toString()).equals("killogram"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("killogram"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("gram"))
                    {
                        no=num*1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("milligram"))
                    {
                        no=(float)num*1000000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("tonne"))
                    {
                        no=num/(1000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("gram"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("gram"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("killogram"))
                    {
                        no=num/1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("milligram"))
                    {
                        no=num*1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("tonne"))
                    {
                        no=num/(1000000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("tonne"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("tonne"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("killogram"))
                    {
                        no=num*1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("milligram"))
                    {
                        no=num*1000000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("milligram"))
                    {
                        no=num*(1000000000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("milligram"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("milligram"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("killogram"))
                    {
                        no=num/1000000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("gram"))
                    {
                        no=num/1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("tonne"))
                    {
                        no=num/(1000000000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("kilometer"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("kilometer"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=num*1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        no=num*100000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("millimeter"))
                    {
                        no=num*(1000000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("meter"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("kilometer"))
                    {
                        no=num/1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        no=num*100;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("millimeter"))
                    {
                        no=num*(1000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("centimeter"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=num/100;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("kilometer"))
                    {
                        no=num/100000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("millimeter"))
                    {
                        no=num*(10);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("millimeter"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("millimeter"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=num/1000;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        no=num/10;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("kilometer"))
                    {
                        no=num/(1000000);
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("rupee"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("rupee"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("dollar"))
                    {
                        no=(float)(num/(64.35));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("pound"))
                    {
                        no=(float)(num/(81.82));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("yen"))
                    {
                        no=(float)(num*(1.71));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("dollar"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("dollar"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("rupee"))
                    {
                        no=(float)(num*(64.35));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("pound"))
                    {
                        no=(float)(num/(1.27));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("yen"))
                    {
                        no=(float)(num*(110.36));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("pound"))
                {
                    if((spinner2.getSelectedItem().toString()).equals("pound"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("dollar"))
                    {
                        no=(float)(num*(1.27));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("rupee"))
                    {
                        no=(float)(num*(81.84));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("yen"))
                    {
                        no=(float)(num*(140.37));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("yen"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("yen"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("rupee"))
                    {
                        no=(float)(num/(1.71));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("pound"))
                    {
                        no=(float)(num/(140.37));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("dollar"))
                    {
                        no=(float)(num/(110.36));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("feet"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("feet"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("inch"))
                    {
                        no=num*12;
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=(float)(num*0.3048);
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        no=(float)(num*(30.48));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("inch"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("inch"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("feet"))
                    {
                        no=(float)(num*(0.0833333));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=(float)(num*0.0254);
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter")) {
                        no = (float) (num * (2.54));
                        text2.setText("" + no);

                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("meter"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("feet"))
                    {
                        no=(float)(num*(3.28084));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("inch"))
                    {
                        no=(float)(num*39.3701);
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        no=(float)(num*(100));
                        text2.setText(""+no);
                    }

                }
                if((spinner2.getSelectedItem().toString()).equals("centimeter"))
                {
                    if((spinner3.getSelectedItem().toString()).equals("centimeter"))
                    {
                        text2.setText(""+num);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("feet"))
                    {
                        no=(float)(num*(0.0328084));
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("inch"))
                    {
                        no=(float)(num*0.393701);
                        text2.setText(""+no);
                    }
                    if((spinner3.getSelectedItem().toString()).equals("meter"))
                    {
                        no=(float)(num*(0.01));
                        text2.setText(""+no);
                    }

                }
            }
        });
    }

}
