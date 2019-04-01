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
public class CoffeeFragment extends Fragment {


    public CoffeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.islandcoffee), getContext().getString(R.string.islandcoffee_description), getString(R.string.islandcoffee_address), getString(R.string.islandcoffee_phonenumber), getString(R.string.islandcoffee_hours), R.drawable.islandcoffeecoffee1));
        listItems.add(new ListItem(getString(R.string.coffeecafe), getContext().getString(R.string.coffeecafe_description), getString(R.string.coffeecafe_address), getString(R.string.coffeecafe_phonenumber), getString(R.string.coffeecafe_hours), R.drawable.coffeecafecoffee2));
        listItems.add(new ListItem(getString(R.string.menottiscoffeestop), getContext().getString(R.string.menottiscoffeestop_description), getString(R.string.menottiscoffeestop_address), getString(R.string.menottiscoffeestop_phonenumber), getString(R.string.menottiscoffeestop_hours), R.drawable.menottiscoffee3));
        listItems.add(new ListItem(getString(R.string.blackgoldcoffeeroasters), getContext().getString(R.string.blackgoldcoffeeroasters_description), getString(R.string.blackgoldcoffeeroasters_address), getString(R.string.blackgoldcoffeeroasters_phonenumber), getString(R.string.blackgoldcoffeeroasters_hours), R.drawable.blackgoldcoffeeroasterscoffee4));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
