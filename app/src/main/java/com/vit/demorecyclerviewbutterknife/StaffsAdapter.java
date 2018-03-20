package com.vit.demorecyclerviewbutterknife;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 20/3/2018.
 */

public class StaffsAdapter extends RecyclerView.Adapter<StaffsAdapter.ViewHolder>{

    private List<Staff> mStaffs;

    public StaffsAdapter(List<Staff> staffs) {
        this.mStaffs = staffs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View staffView = inflater.inflate(R.layout.item_staff, parent, false);

        return new ViewHolder(staffView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Staff staff = mStaffs.get(position);

        holder.id.setText(staff.getId());
        holder.name.setText(staff.getName());
        holder.age.setText(String.valueOf(staff.getAge()));
    }

    @Override
    public int getItemCount() {
        return mStaffs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView id, name, age;
        @BindView(R.id.item_id) TextView id;
        @BindView(R.id.item_name) TextView name;
        @BindView(R.id.item_age) TextView age;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

//            id = itemView.findViewById(R.id.item_id);
//            name = itemView.findViewById(R.id.item_name);
//            age = itemView.findViewById(R.id.item_age);
        }
    }
}
