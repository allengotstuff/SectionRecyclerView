package com.pheth.hasee.sectionrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adapter.SectionRecyclerAdapter;
import Data.SectionObject;
import Data.TestDataGeneration;
import ViewHolder.FooterViewHolder;
import ViewHolder.HeaderViewHolder;
import ViewHolder.ItemViewHolder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        setupRecycler(recyclerView);
    }

    private void setupRecycler( RecyclerView  rc){
        ArrayList<SectionObject> datalist = TestDataGeneration.getTestData();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(), 2);

        ExampleSectionAdapter adapter = new ExampleSectionAdapter(datalist);
        rc.setLayoutManager(gridLayoutManager);
        adapter.setLayoutManager(gridLayoutManager);
        rc.setAdapter(adapter);
    }


    class ExampleSectionAdapter extends SectionRecyclerAdapter<RecyclerView.ViewHolder> {

        private List<SectionObject> datalist;


        public ExampleSectionAdapter(List<SectionObject> data) {
            datalist = data;
        }

        @Override
        public int getSectionCount() {
            return datalist.size();
        }

        @Override
        public int getItemCount(int section) {
            SectionObject sectionObject = datalist.get(section);

            return sectionObject.listOfObject.size();
        }

        @Override
        public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int section) {

            HeaderViewHolder headerViewHolder = (HeaderViewHolder)holder;
            headerViewHolder.textview.setText("Section: "+ section + " Header");
        }

        @Override
        public void onBindFooterViewHolder(RecyclerView.ViewHolder holder, int section) {

            FooterViewHolder footerViewHolder = (FooterViewHolder)holder;
            footerViewHolder.textview.setText("Section: "+ section + " Footer");
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int section, int relativePosition, int absolutePosition) {

            SectionObject sectionObject = datalist.get(section);

            ItemViewHolder itemViewHolder =(ItemViewHolder) holder;
            itemViewHolder.textView.setText(sectionObject.listOfObject.get(relativePosition).imageSource +"");
        }

        @Override
        public boolean isNeedFooter(int sectionPosition) {
            return false;
        }

        @Override
        public boolean setFullSpanItem(int section, int relativePositonInSection) {

            return false;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view;
            RecyclerView.ViewHolder myHolder = null;
            switch (viewType) {
                case SectionRecyclerAdapter.VIEW_TYPE_HEADER:
                    view = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.headerview, parent, false);
                    myHolder = new HeaderViewHolder(view);
                    break;

                case SectionRecyclerAdapter.VIEW_TYPE_ITEM:
                    view = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.itemview, parent, false);
                    myHolder = new ItemViewHolder(view);
                    break;

                case SectionRecyclerAdapter.VIEW_TYPE_FOOTER:
                    view = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.footerview, parent, false);
                    myHolder = new FooterViewHolder(view);
                    break;
            }

            return myHolder;
        }
    }
}
