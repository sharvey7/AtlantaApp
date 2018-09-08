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
public class AttractionsFragment extends ListFragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Atlanta> atlantas = new ArrayList<>();
        atlantas.add(new Atlanta(getString(R.string.coke), getString(R.string.cokeloc), R.drawable.coke));
        atlantas.add(new Atlanta(getString(R.string.CNN), getString(R.string.cnnloc), R.drawable.cnn));
        atlantas.add(new Atlanta(getString(R.string.Aquariaum), getString(R.string.aqualoc), R.drawable.aquarium));
        atlantas.add(new Atlanta(getString(R.string.Ponce), getString(R.string.tourdown), R.drawable.ponceimg));
        atlantas.add(new Atlanta(getString(R.string.Fox), getString(R.string.foxloc), R.drawable.fox));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}