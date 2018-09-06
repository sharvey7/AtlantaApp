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
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourFragment extends ListFragment{


    public TourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Atlanta> atlantas = new ArrayList<>();
        atlantas.add(new Atlanta("Atlanta's Southern Food Tour", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Walking Dead Big Zombie Tour", "Downtown", R.drawable.cnn));
        atlantas.add(new Atlanta("CNN Atlanta Studio Tour", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Atlanta city tour by electric car", "Downtown", R.drawable.electric));
        atlantas.add(new Atlanta("Atlanta Historical Homes", "Downtown", R.drawable.electric));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListView.setAdapter(adapter);

        return rootView;
    }
}

