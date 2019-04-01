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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                             View rootView = inflater.inflate(R.layout.listitem_list, container, false);

    final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.tropicalshoresbeachresort), getContext().getString(R.string.tropicalshoresbeachresort_description), getString(R.string.tropicalshoresbeachresort_address), getString(R.string.tropicalshoresbeachresort_phonenumber), getString(R.string.tropicalshoresbeachresort_hours), R.drawable.tropicalbeachresortshotel1));
        listItems.add(new ListItem(getString(R.string.home2suitesbyhilton), getContext().getString(R.string.home2suitesbyhilton_description), getString(R.string.home2suitesbyhilton_address), getString(R.string.home2suitesbyhilton_phonenumber), getString(R.string.home2suitesbyhilton_hours), R.drawable.home2hilton));
        listItems.add(new ListItem(getString(R.string.comfortsuitessarasotasiestakey), getContext().getString(R.string.comfortsuitessarasotasiestakey_description), getString(R.string.comfortsuitessarasotasiestakey_address), getString(R.string.comfortsuitessarasotasiestakey_phonenumber), getString(R.string.comfortsuitessarasotasiestakey_hours), R.drawable.comfortsuiteshotel3));
        listItems.add(new ListItem(getString(R.string.ramadabywyndham), getContext().getString(R.string.ramadabywyndham_description), getString(R.string.ramadabywyndham_address), getString(R.string.ramadabywyndham_phonenumber), getString(R.string.ramadabywyndham_hours), R.drawable.ramadahotel4));

    ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

    ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

}

}
