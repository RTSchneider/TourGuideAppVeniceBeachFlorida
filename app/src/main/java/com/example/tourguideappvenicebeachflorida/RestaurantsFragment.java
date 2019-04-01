package com.example.tourguideappvenicebeachflorida;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.josephsdinerandpizza), getContext().getString(R.string.josephsdinerandpizza_description), getString(R.string.josephsdinerandpizza_address), getString(R.string.josephsdinerandpizza_phonenumber), getString(R.string.josephsdinerandpizza_hours), R.drawable.josephsdinerandpizza));
        listItems.add(new ListItem(getString(R.string.finsatsharkeys), getContext().getString(R.string.finsatsharkeys_description), getString(R.string.finsatsharkeys_address), getString(R.string.finsatsharkeys_phonenumber), getString(R.string.finsatsharkeys_hours), R.drawable.finsatsharkeys));
        listItems.add(new ListItem(getString(R.string.normajeanssportsgrill), getContext().getString(R.string.normajeanssportsgrill_description), getString(R.string.normajeanssportsgrill_address), getString(R.string.normajeanssportsgrill_phonenumber), getString(R.string.normajeanssportsgrill_hours), R.drawable.normajeans));
        listItems.add(new ListItem(getString(R.string.paradisegrill), getContext().getString(R.string.paradisegrill_description), getString(R.string.paradisegrill_address), getString(R.string.paradisegrill_phonenumber), getString(R.string.paradisegrill_hours), R.drawable.paradisegrill));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
