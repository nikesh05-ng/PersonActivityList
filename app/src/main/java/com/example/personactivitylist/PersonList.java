package com.example.personactivitylist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class PersonList extends AppCompatActivity {

    String[] names = {"Sabin","John"};
    Spinner spinner = null;
    Button findButton = null;
    private ArrayAdapter<String> adaptor = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        //wire
        spinner = findViewById(R.id.spinner);
        findButton = findViewById(R.id.findButton);

        //make the spinners
        adaptor = new ArrayAdapter<String>( getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,names);
        spinner.setAdapter(adaptor);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int spinnerIndex = spinner.getSelectedItemPosition();
                String profName = names[spinnerIndex];

                Intent intent = new Intent(PersonList.this,PersonActivity.class);
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putSerializable("name",profName);
                intent.putExtras(bundle);
                //start activity
                startActivity(intent);


            }
        });

    }

}

