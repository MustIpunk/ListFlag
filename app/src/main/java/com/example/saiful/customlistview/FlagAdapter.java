package com.example.saiful.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter {

    List<FlagType> userDataInfo = new ArrayList<FlagType>();


    public FlagAdapter(@NonNull Context context, List<FlagType> userDataInfo) {
        super(context, R.layout.item_flag, userDataInfo);
        this.userDataInfo = userDataInfo;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.item_flag, parent, false);

        ImageView flageImage = row.findViewById(R.id.iv_item_flag_img);
        TextView tvCountry = row.findViewById(R.id.tv_item_flag);

        flageImage.setImageResource(userDataInfo.get(position).getmImg());
        tvCountry.setText(userDataInfo.get(position).getmCountryName());

        return row;
    }


}

