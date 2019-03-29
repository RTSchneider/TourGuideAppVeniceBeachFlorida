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
 * {@link Fragment} that displays the list of beaches.
 */
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem("Brohard  Paw Park", getContext().getString(R.string.beach1), "1600 Harbor Dr. S. Venice, Fl 34285", "+1 941.861.9830", "Dawn to Dusk", R.drawable.dogbeach));
        listItems.add(new ListItem("Caspersen Beach", getContext().getString(R.string.beach2), "4100 Harbor Dr, Venice, Fl 34295", "+1 941.861.5000", "Dawn to Dusk", R.drawable.caspersenbeach));
        listItems.add(new ListItem("Venice Municipal Beach", getContext().getString(R.string.beach3), "101 The Esplanade S., Venice, Fl 34285", "+1 941.861.5000 ", "Dawn to Dusk", R.drawable.venicemunicipalbeach));
        listItems.add(new ListItem("Nokomis Public Beach", getContext().getString(R.string.beach4), "115 S. Casey Key Rd., Nokomis, Fl 34275", "+1 941.861.5000", "Dawn to Dusk", R.drawable.nokomisbeach));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
