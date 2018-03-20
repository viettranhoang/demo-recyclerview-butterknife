package com.vit.demorecyclerviewbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_rv_staffs) RecyclerView rvStaffs;
//    private RecyclerView rvStaffs;
    private List<Staff> mStaffs;
    StaffsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        rvStaffs = findViewById(R.id.main_rv_staffs);

        initStaffs();

        adapter = new StaffsAdapter(mStaffs);
        rvStaffs.setAdapter(adapter);
        rvStaffs.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initStaffs() {
        mStaffs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mStaffs.add(new Staff("B15DCCN647", "Trần Hoàng Việt", 21));
        }
    }
}
