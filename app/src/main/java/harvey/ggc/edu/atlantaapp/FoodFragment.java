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
public class FoodFragment extends ListFragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Atlanta> atlantas = new ArrayList<>();
        atlantas.add(new Atlanta(getString(R.string.Aria), getString(R.string.ariaLoc),
                R.drawable.aria));
        atlantas.add(new Atlanta(getString(R.string.Mary), getString(R.string.tourdown),
                R.drawable.food));
        atlantas.add(new Atlanta(getString(R.string.Vortex), getString(R.string.vorLoc),
                R.drawable.vortex));
        atlantas.add(new Atlanta(getString(R.string.Antico), getString(R.string.ariaLoc),
                R.drawable.pizza));
        atlantas.add(new Atlanta(getString(R.string.Paolo), getString(R.string.gelLoc),
                R.drawable.gelato));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}