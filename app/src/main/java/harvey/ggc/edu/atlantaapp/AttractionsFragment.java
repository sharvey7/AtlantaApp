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
        atlantas.add(new Atlanta("Coke Factory", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("CNN", "Downtown", R.drawable.cnn));
        atlantas.add(new Atlanta("Piedmont Park", "Downtown", R.drawable.coke));
        atlantas.add(new Atlanta("Ponce City Market", "Downtown", R.drawable.electric));
        atlantas.add(new Atlanta("Fox Theatre", "Downtown", R.drawable.electric));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListView.setAdapter(adapter);

return rootView;
    }
}
