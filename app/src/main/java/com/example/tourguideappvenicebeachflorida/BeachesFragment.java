package com.example.tourguideappvenicebeachflorida;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

        listItems.add(new ListItem(getString(R.string.brohardpawpark), getContext().getString(R.string.brohardpawpark_description), getString(R.string.brohardpawpark_address), getString(R.string.brohardpawpark_phonenumber), getString(R.string.brohardpawpark_hours), R.drawable.dogsonbeach));
        listItems.add(new ListItem(getString(R.string.caspersenbeach), getContext().getString(R.string.caspersenbeach_description), getString(R.string.caspersenbeach_address), getString(R.string.caspersenbeach_phonenumber), getString(R.string.caspersenbeach_hours), R.drawable.caspersenbeach));
        listItems.add(new ListItem(getString(R.string.venicemunicipalbeach), getContext().getString(R.string.venicemunicipalbeach_description), getString(R.string.venicemunicipalbeach_address), getString(R.string.venicemunicipalbeach_phonenumber), getString(R.string.venicemunicipalbeach_hours), R.drawable.venicemunicipalbeach));
        listItems.add(new ListItem(getString(R.string.nokomispublicbeach), getContext().getString(R.string.nokomispublicbeach_description), getString(R.string.nokomispublicbeach_address), getString(R.string.nokomispublicbeach_phonenumber), getString(R.string.nokomispublicbeach_hours), R.drawable.nokomisbeach));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
