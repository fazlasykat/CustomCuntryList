package com.example.laptop.customcuntrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView ListView;
    private String[] countryNames;
    private int[] flags = {R.drawable.afganisthan,R.drawable.argentina,R.drawable.austrila,
    R.drawable.bangladesh,R.drawable.brasil,R.drawable.canada,R.drawable.china,R.drawable.japan,
    R.drawable.koria,R.drawable.newzeland,R.drawable.pakistan,R.drawable.saodi_arobia,R.drawable.south_africa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        ListView = findViewById(R.id.listViewId);

        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        ListView.setAdapter(adapter);


    }
}
