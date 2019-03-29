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

        listItems.add(new ListItem("Tropical Shores Beach Resort", getContext().getString(R.string.hotel1), "6717 Sarasea Cir, Siesta Key, Fl", "+1 941.349.3330", "8am–10pm", R.drawable.tropicalbeachresortshotel1));
        listItems.add(new ListItem("Home2 Suites by Hilton", getContext().getString(R.string.hotel2), "227 Albee Rd W, Nokomis, Fl", "+1 941.412.0064", "open 24 hours", R.drawable.home2hilton));
        listItems.add(new ListItem("Comfort Suites Sarasota Siesta Key", getContext().getString(R.string.hotel3), "5690 Honore Ave, Sarasota, Fl", "+1 941.554.4475 ", "open 24 hours", R.drawable.comfortsuiteshotel3));
        listItems.add(new ListItem("Ramada by Wyndham", getContext().getString(R.string.hotel4), "455 41 Bypass, Venice, Fl", "+1 800.252.1709", "open 24 hours", R.drawable.ramadahotel4));

    ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

    ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

}

}
