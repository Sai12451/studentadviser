package com.studentadvisor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

public class AdvisorsAdapter extends BaseAdapter {
    ProgressDialog progressDialog;
    List<AdvisorsPojo> advisorsPojos;
    Context cnt;
    public AdvisorsAdapter(List<AdvisorsPojo> ar, Context cnt)
    {
        this.advisorsPojos=ar;
        this.cnt=cnt;
    }
    @Override
    public int getCount() {
        return advisorsPojos.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int pos, View view, ViewGroup viewGroup)
    {
        LayoutInflater obj1 = (LayoutInflater)cnt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View obj2=obj1.inflate(R.layout.list_view_advisors,null);

        TextView tv_advisor_name=(TextView)obj2.findViewById(R.id.tv_advisor_name);
        tv_advisor_name.setText("Advisor Name :"+advisorsPojos.get(pos).getAdvisor_name());

        TextView tv_adv_department=(TextView)obj2.findViewById(R.id.tv_adv_department);
        tv_adv_department.setText("Advisor Department :"+advisorsPojos.get(pos).getDepartment());


        CardView card_view=(CardView)obj2.findViewById(R.id.card_view);
        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cnt,StudentBookingActivity.class);
                intent.putExtra("name",advisorsPojos.get(pos).getAdvisor_name());
                intent.putExtra("campus_name",advisorsPojos.get(pos).getCampus_name());
                intent.putExtra("department",advisorsPojos.get(pos).getDepartment());
                intent.putExtra("degisgnation",advisorsPojos.get(pos).getDesignation());
                intent.putExtra("location",advisorsPojos.get(pos).getLocation());
                cnt.startActivity(intent);
                //((Activity)cnt).finish();

            }
        });



        return obj2;
    }

}