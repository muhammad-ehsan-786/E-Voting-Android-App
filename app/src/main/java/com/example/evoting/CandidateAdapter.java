package com.example.evoting;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class CandidateAdapter extends ArrayAdapter<CandidateModel> {
    public CandidateAdapter(Activity context, ArrayList<CandidateModel> candidateModelArrayList) {
        super(context, 0, candidateModelArrayList);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listitemView = convertView;

        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }
        CandidateModel candidateModel = getItem(position);
        TextView candidateName = listitemView.findViewById(R.id.candidateName);
        TextView candidateDetails = listitemView.findViewById(R.id.candidateDetail);
        ImageView candidateImage = listitemView.findViewById(R.id.candidateImage);
        candidateImage.setImageResource(candidateModel.getImageId());
        candidateName.setText(candidateModel.getCandidateName());
        candidateDetails.setText(candidateModel.getCandidateDetails());

        return listitemView;
    }
}
