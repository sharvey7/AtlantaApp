package harvey.ggc.edu.atlantaapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends ListFragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Atlanta> atlantas = new ArrayList<>();
        atlantas.add(new Atlanta(getString(R.string.Art), getString(R.string.artloc),
                R.drawable.highmuseum));
        atlantas.add(new Atlanta(getString(R.string.Civil), getString(R.string.civloc),
                R.drawable.newcivil));
        atlantas.add(new Atlanta(getString(R.string.Natural), getString(R.string.nalloc),
                R.drawable.fernbank));
        atlantas.add(new Atlanta(getString(R.string.Jimmy), getString(R.string.jimloc),
                R.drawable.jimmy));
        atlantas.add(new Atlanta(getString(R.string.History), getString(R.string.hisloc),
                R.drawable.history));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}