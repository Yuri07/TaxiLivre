package com.rseng.yuri.taxilivre.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.rseng.yuri.taxilivre.R;
import com.rseng.yuri.taxilivre.activity.MapsActivity;

public class DrawerFragment extends Fragment {


    private static final String [] NAV_ITEMS = {"Viagens", "Ajuda", "Configurações"};
    private ListView mListView;
    private NavCallback mCallback;

    public interface NavCallback{
        void onNavSelected(int position);
    }

    /**
     * Create a static method to return this fragment
     * @return - this fragment
     */
    public static DrawerFragment newInstance(){
        return new DrawerFragment();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        mCallback = (MapsActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_drawer, container, false);

        /*
            You can really use anything you want here but for simplicity lest assume ListView
         */
        //mListView = (ListView) view.findViewById(R.id.listViewNav);
        //mListView.setOnItemClickListener(ListListener);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Simple adapter, Also this is for simplicity and adapter can be used
       // mListView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, NAV_ITEMS));

    }

    private final AdapterView.OnItemClickListener ListListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            mCallback.onNavSelected(position);
        }
    };
}