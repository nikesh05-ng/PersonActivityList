package com.example.personactivitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView nameTextView, addressTextView, phoneTextView, urlTextView;
    private Button webButton = null;

    private Person data=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //wire the widgets
        nameTextView = findViewById(R.id.textView2);
        addressTextView = findViewById(R.id.textView3);
        phoneTextView = findViewById(R.id.textView4);
        urlTextView = findViewById(R.id.textView5);
        webButton = findViewById(R.id.button2);

        //get the pushed data
        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        data = (Person) bundle.getSerializable("data");

        //populate the fields with data
        nameTextView.setText(data.getName());
        addressTextView.setText(data.getAddress());
        phoneTextView.setText(data.getPhone());
        urlTextView.setText(data.getUrl());


        //deal with webButton
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make and intent to view the url
                //Intent intent1= new Intent(Intent.ACTION_VIEW, Uri.parse(data.getUrl()));
                Intent intent1 = new Intent(DetailsActivity.this,WebViewActivity.class);
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putSerializable("url", data.getUrl());
                intent1.putExtras(bundle);
                //start activity
                startActivity(intent1);
            }
        });
    }
}
