package com.example.cassandre.dansmavalise.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cassandre.dansmavalise.Model.Voyage;
import com.example.cassandre.dansmavalise.R;
import com.google.android.gms.vision.text.Text;

import java.util.ArrayList;

/**
 * Created by aschaal on 04/04/2017.
 */

public class MainVoyageAdapter extends RecyclerView.Adapter<MainVoyageAdapter.ViewHolder> {
    private ArrayList<Voyage> datas;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View container;
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            container = v;
            textView = (TextView) v.findViewById(R.id.main_voyage_cardview_destination);
            imageView = (ImageView) v.findViewById(R.id.main_voyage_imageview);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MainVoyageAdapter(Context context, ArrayList<Voyage> myDataset) {
        this.context = context;
        this.datas = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MainVoyageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_voyage_cardview, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(datas.get(position).getDestination().getNom());
        holder.imageView.setImageDrawable(
            context.getDrawable(
                    datas.get(position).getDestination().getDrawable()
            )
        );
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return datas.size();
    }
}