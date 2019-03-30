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

        listItems.add(new ListItem("Joseph's Diner and Pizza", getContext().getString(R.string.restaurant1), "625 N. Tamiami Trail, Nokomis, FL 34275", "+1 941.480.0095", "Mon-Sat:11am-9pm | Sun:Closed", R.drawable.josephsdinerandpizza));
        listItems.add(new ListItem("Fins at Sharkey's", getContext().getString(R.string.restaurant2), "1600 Harbor Dr S, Venice, FL 34825", "+1 941.999.3467", "12pm-10pm", R.drawable.finsatsharkeys));
        listItems.add(new ListItem("Norma Jean's Sports Grill", getContext().getString(R.string.restaurant3), "1272 S Tamiami Trl, Osprey, FL 34229", "+1 941.786.1834", "11am-11pm", R.drawable.normajeans));
        listItems.add(new ListItem("Paradise Grill", getContext().getString(R.string.restaurant4), "1097 N Tamiami Trl., Publix Shopping Plaza, Nokomis, Fl 34275", "+1 941.786.1524", "7:30am-11pm", R.drawable.paradisegrill));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
