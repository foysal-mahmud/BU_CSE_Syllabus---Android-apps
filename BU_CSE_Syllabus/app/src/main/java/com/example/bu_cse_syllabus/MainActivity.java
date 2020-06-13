package com.example.bu_cse_syllabus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfListView=(ListView) findViewById(R.id.myPDFList); //casting

        // String array for different names
        String[] pdfFiles={"1st Semester", "2nd Semester", "3rd Semester" ,"4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
            };

        //set array adapter for string list view
        pdfListView.setAdapter(adapter);

        // Onclick listener event generate
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                String item = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),PDfOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}
