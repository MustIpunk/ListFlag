package com.example.saiful.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.saiful.customlistview.MainActivity.dataList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int position = getIntent().getExtras().getInt("key");

        ImageView flagImage = (ImageView) findViewById(R.id.iv_activity_detail_img);
        TextView tvCountry = (TextView) findViewById(R.id.tv_activity_detail_country);

        flagImage.setImageResource(dataList.get(position).getmImg());
        tvCountry.setText(dataList.get(position).getmCountryName());

    }
}
