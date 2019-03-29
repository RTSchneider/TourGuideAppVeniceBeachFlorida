package com.example.tourguideappvenicebeachflorida;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                             View rootView = inflater.inflate(R.layout.listitem_list, container, false);

    final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Hotel 1", getContext().getString(R.string.hotel1), " United States", "+1 ", "xxAM–xxPM", R.drawable.beachhotelpic1));
        listItems.add(new ListItem("Hotel 2", getContext().getString(R.string.hotel2), " USA", "+1 ", "xxAM–xPM", R.drawable.beachhotel2));
        listItems.add(new ListItem("Hotel 3", getContext().getString(R.string.hotel3), " USA", "+1 ", "xxAM–xxPM", R.drawable.beachhotel3));
        listItems.add(new ListItem("Hotel 4", getContext().getString(R.string.hotel4), " USA", "+1 ", "xxam–xxPM", R.drawable.beachhotel4));

    ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

    ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

}

}
