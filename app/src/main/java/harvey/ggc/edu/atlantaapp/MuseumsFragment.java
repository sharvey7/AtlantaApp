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
        atlantas.add(new Atlanta("High Museum of Art", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Center for civil and human rights", "Downtown", R.drawable.cnn));
        atlantas.add(new Atlanta("Fernbank Museum of Natural Art", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Jimmy Carter Library and Museum", "Downtown", R.drawable.electric));
        atlantas.add(new Atlanta("Atlanta History Museum", "Downtown", R.drawable.electric));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListView.setAdapter(adapter);

        return rootView;
    }
}

