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
        atlantas.add(new Atlanta("aria", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Mary Mac", "Downtown", R.drawable.cnn));
        atlantas.add(new Atlanta("Vortex", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Antico Pizza", "Downtown", R.drawable.electric));
        atlantas.add(new Atlanta("Cakes and Ale", "Downtown", R.drawable.electric));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListView.setAdapter(adapter);

        return rootView;
    }
}



