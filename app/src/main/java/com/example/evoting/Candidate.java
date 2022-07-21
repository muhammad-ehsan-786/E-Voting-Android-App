package com.example.evoting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class Candidate extends AppCompatActivity {

    GridView candidateGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);

        getSupportActionBar().setTitle("Select candidate to Vote");

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF6200EE"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        candidateGridView = findViewById(R.id.grid);

        ArrayList<CandidateModel> candidateModelArrayList = new ArrayList<CandidateModel>();
        candidateModelArrayList.add(new CandidateModel("Ehsan","UIIT Student", R.drawable.vector));
        candidateModelArrayList.add(new CandidateModel("Rizwan","UIIT Student", R.drawable.vector));
        candidateModelArrayList.add(new CandidateModel("Ahmed","UIIT Student", R.drawable.vector));
        candidateModelArrayList.add(new CandidateModel("Ali","UIIT Student", R.drawable.vector));


        CandidateAdapter adapter = new CandidateAdapter(this, candidateModelArrayList);
        candidateGridView.setAdapter(adapter);

        candidateGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Candidate.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.customdialog, viewGroup, false);
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
}