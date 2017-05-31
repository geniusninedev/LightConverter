package com.nineinfosys.lightconverter.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.nineinfosys.lightconverter.ConveterActivity.DigitalImageResolutionActivity;
import com.nineinfosys.lightconverter.ConveterActivity.FrequencyActivity;
import com.nineinfosys.lightconverter.ConveterActivity.IlluminationActivity;
import com.nineinfosys.lightconverter.ConveterActivity.LuminanceActivity;
import com.nineinfosys.lightconverter.ConveterActivity.LuminousIntensityActivity;
import com.nineinfosys.lightconverter.R;
import com.nineinfosys.lightconverter.Supporter.ItemObject;

import java.util.List;


/**
 * Created by AndriodDev5 on 18-04-2017.
 */

public class RecyclerViewLightAdapter extends RecyclerView.Adapter<RecyclerViewLightAdapter.RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewLightAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView countryName;
        public ImageView countryPhoto;


        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            countryName = (TextView)itemView.findViewById(R.id.country_name);
            countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);

        }

        @Override
        public void onClick(View view) {
            switch (getPosition())
            {
                case 0:
                    Intent i=new Intent(context,LuminanceActivity.class);
                    context.startActivity(i);
                    break;
                case 1:
                    Intent i1=new Intent(context,LuminousIntensityActivity.class);
                    context.startActivity(i1);
                    break;
                case 2:
                    Intent i2=new Intent(context,IlluminationActivity.class);
                    context.startActivity(i2);
                    break;
                case 3:
                    Intent i3=new Intent(context,DigitalImageResolutionActivity.class);
                    context.startActivity(i3);

                    break;
                case 4:
                    Intent i4=new Intent(context,FrequencyActivity.class);
                    context.startActivity(i4);

                    break;




            }


        }



    }
}