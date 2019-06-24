package com.nocholla.dagger.recyclerview.adapter;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nocholla.dagger.recyclerview.R;
import com.nocholla.dagger.recyclerview.model.StarWars;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<StarWars.People> data;
    private RecyclerViewAdapter.ClickListener clickListener;

    @Inject
    public RecyclerViewAdapter(ClickListener clickListener) {
        this.clickListener = clickListener;
        data = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(data.get(position).name);
        holder.txtBirthYear.setText("Birth Year : " + data.get(position).birthYear);
        holder.txtGender.setText("Gender : " + data.get(position).gender);
        holder.txtHeight.setText("Height : " + data.get(position).height);
        holder.txtMass.setText("Mass : " + data.get(position).mass);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtBirthYear;
        private TextView txtGender;
        private TextView txtHeight;
        private TextView txtMass;
        private ConstraintLayout constraintLayoutContainer;

        ViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtBirthYear = itemView.findViewById(R.id.txtBirthYear);
            txtGender = itemView.findViewById(R.id.txtGender);
            txtHeight = itemView.findViewById(R.id.txtHeight);
            txtMass = itemView.findViewById(R.id.txtMass);
            constraintLayoutContainer = itemView.findViewById(R.id.constraintLayout);

            constraintLayoutContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.launchIntent(data.get(getAdapterPosition()).films.get(0));
                }
            });
        }
    }

    public interface ClickListener {
        void launchIntent(String filmName);
    }

    public void setData(List<StarWars.People> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}

