package com.example.retrofit_one;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Androidver> android;

    public DataAdapter(ArrayList<Androidver>android){
        this.android=android;
    }


    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.androidver,viewGroup,false);

       // can be also written as  View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.androidver,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.name.setText(android.get(i).getName());
        viewHolder.api.setText(android.get(i).getApi());
        viewHolder.version.setText(android.get(i).getVer());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView version;
        private TextView api;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.namexml);
            version=itemView.findViewById(R.id.verxml);
            api=itemView.findViewById(R.id.apixml);
        }
    }
}
