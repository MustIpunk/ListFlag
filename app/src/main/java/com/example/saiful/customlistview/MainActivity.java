package com.example.saiful.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static  List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvFlagList = (ListView) findViewById(R.id.lv_activity_main_list);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.afganistan,"Afganistan"));
        dataList.add(new FlagType(R.drawable.aljazair, "Aljazair"));
        dataList.add(new FlagType(R.drawable.arabsaudi, "Arab Saudi"));
        dataList.add(new FlagType(R.drawable.bangladesh, "Bangladesh"));


        FlagAdapter adapter = new FlagAdapter(getApplicationContext(), dataList);
        lvFlagList.setAdapter(adapter);

        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("key", position);
                startActivity(intent);
            }
        });
    }
}
