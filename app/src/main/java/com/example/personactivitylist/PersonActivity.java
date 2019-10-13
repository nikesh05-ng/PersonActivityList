package com.example.personactivitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonActivity extends AppCompatActivity {

    private TextView nameTextView = null;
    private Button moreButton = null;
    private ImageView personImageView = null;

    private PersonData data = new PersonData();
    String val= "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        // wire objects with widgets
        nameTextView = findViewById(R.id.textView1);
        moreButton   = findViewById(R.id.button);
        personImageView = findViewById(R.id.imageView);

        //get the pushed data
        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String profName = bundle.getString("name");
        String imageName = null;


        //call object persondata to set values in the bean
        data.setDataPerson(profName);

        //Toast.makeText(getApplicationContext(), profName,Toast.LENGTH_SHORT).show();
        // populate textview and image view with data
        nameTextView.setText(data.getData().getName());

        // remove the extension from the name
        imageName = data.getData().getImage();
        imageName = imageName.substring(0, imageName.indexOf("."));

        int imageId = this.getResources().getIdentifier(
                imageName,
                "drawable",
                this.getPackageName());

        personImageView.setImageResource(imageId);

        //deal with the button
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PersonActivity.this,DetailsActivity.class);
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putSerializable("data", data.getData());
                intent1.putExtras(bundle);
                //start activity
                startActivity(intent1);
            }
        });
    }
}
