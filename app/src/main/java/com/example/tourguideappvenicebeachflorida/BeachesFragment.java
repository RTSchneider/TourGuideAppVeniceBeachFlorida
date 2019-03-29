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

        listItems.add(new ListItem("Brohard  Paw Park", getContext().getString(R.string.beach1), "1600 Harbor Dr. S.", "+1 941-861-9830", "Dawn to Dusk", R.drawable.dogbeach));
        listItems.add(new ListItem("Caspersen Beach", getContext().getString(R.string.beach2), "", "+1 212-310-6600", "6AM–1AM", R.drawable.caspersenbeach));
        listItems.add(new ListItem("Venice Municipal Beach", getContext().getString(R.string.beach3), "350 5th Ave, New York, NY 10118, USA", "+1 212-736-3100", "8AM–2AM", R.drawable.venicemunicipalbeach));
        listItems.add(new ListItem("Nokomis Beach", getContext().getString(R.string.beach4), "Manhattan, NY 10036, USA", "+1 690-847-0982", "9AM–8PM", R.drawable.nokomisbeach));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
