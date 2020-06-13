package com.example.bu_cse_syllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDfOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("1st Semester")){

            myPDFViewer.fromAsset("item 1.pdf").load();
        }

        if(getItem.equals("2nd Semester")){

            myPDFViewer.fromAsset("item 2.pdf").load();
        }

        if(getItem.equals("3rd Semester")){

            myPDFViewer.fromAsset("item 3.pdf").load();
        }

        if(getItem.equals("4th Semester")){

            myPDFViewer.fromAsset("item 4.pdf").load();
        }

        if(getItem.equals("5th Semester")){

            myPDFViewer.fromAsset("item 5.pdf").load();
        }

        if(getItem.equals("6th Semester")){

            myPDFViewer.fromAsset("item 6.pdf").load();
        }

        if(getItem.equals("7th Semester")){

            myPDFViewer.fromAsset("item 7.pdf").load();
        }

        if(getItem.equals("8th Semester")){

            myPDFViewer.fromAsset("item 8.pdf").load();
        }


    }
}
