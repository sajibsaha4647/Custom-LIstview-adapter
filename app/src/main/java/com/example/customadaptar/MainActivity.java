package com.example.customadaptar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private  String [] Countrynames;
    private  String [] Details;
    private  int [] Flags = {R.drawable.img1,R.drawable.img2,
            R.drawable.img14,R.drawable.img3,
            R.drawable.img13,R.drawable.img4,
            R.drawable.img12,R.drawable.img5,
            R.drawable.img11,R.drawable.img6,
            R.drawable.img10,R.drawable.img7,
            R.drawable.img9,R.drawable.img8,};

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listitemView);

        Countrynames = getResources().getStringArray(R.array.country_name);
        Details = getResources().getStringArray(R.array.details);



        Customadapter adapter = new Customadapter (this,Countrynames,Details,Flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String vlue = Countrynames[position];
                Toast.makeText(MainActivity.this,vlue,Toast.LENGTH_LONG).show();

            }
        });




    }
}