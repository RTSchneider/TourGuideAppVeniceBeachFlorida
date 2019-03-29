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
public class CoffeeFragment extends Fragment {


    public CoffeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Island Coffee", getContext().getString(R.string.coffee1), "200 Miami Ave W, Venice, FL USA", "+1 941.485.6789", "7am-2pm", R.drawable.islandcoffeecoffee1));
        listItems.add(new ListItem("Coffee Cafe", getContext().getString(R.string.coffee2), "101 Capri Isles Blvd., Venice Fl, USA", "+1 941.484.4100", "7am-2pm", R.drawable.coffeecafecoffee2));
        listItems.add(new ListItem("Menotti's Coffee Stop", getContext().getString(R.string.coffee3), "56 Windward Ave., Venice Fl, 90291 USA", "+1 424-205-7014", "7am-6pm", R.drawable.menottiscoffee3));
        listItems.add(new ListItem("Black Gold Coffee Roasters", getContext().getString(R.string.coffee4), "Jacaranda Commons, 2385 E. Venice Ave., Venice Fl, 34292 USA", "+1 941.488.8242", "M-F:7am-6pm, Sat:8am-2pm, Sun:Closed", R.drawable.blackgoldcoffeeroasterscoffee4));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
