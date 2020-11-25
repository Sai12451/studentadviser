package com.studentadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentBookingActivity extends AppCompatActivity {
    TextView tv_advisor_name,tv_adv_department,tv_adv_campus_name,tv_adv_degination,tv_adv_location;
    Button btn_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_booking);

        getSupportActionBar().setTitle("Advisor Booking");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_advisor_name=(TextView)findViewById(R.id.tv_advisor_name);
        tv_adv_department=(TextView)findViewById(R.id.tv_adv_department);
        tv_adv_campus_name=(TextView)findViewById(R.id.tv_adv_campus_name);
        tv_adv_degination=(TextView)findViewById(R.id.tv_adv_degination);
        tv_adv_location=(TextView)findViewById(R.id.tv_adv_location);

        tv_advisor_name.setText("Name  :"+getIntent().getStringExtra("name"));
        tv_adv_department.setText("Department :"+getIntent().getStringExtra("department"));
        tv_adv_campus_name.setText("Campus Name :"+getIntent().getStringExtra("campus_name"));
        tv_adv_degination.setText("Designation :"+getIntent().getStringExtra("degisgnation"));
        tv_adv_location.setText("Location  :"+getIntent().getStringExtra("location"));



        btn_book=(Button)findViewById(R.id.btn_book);
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentBookingActivity.this, getIntent().getStringExtra("name")+" Advisor Booked Succussfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(StudentBookingActivity.this,StudentDashboardActivity.class));
                finish();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}