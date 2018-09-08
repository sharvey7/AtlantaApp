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
public class TourFragment extends ListFragment {

    public TourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Atlanta> atlantas = new ArrayList<>();
        atlantas.add(new Atlanta(getString(R.string.coke), getString(R.string.tourdown),
                R.drawable.coke));
        atlantas.add(new Atlanta(getString(R.string.tourwalk), getString(R.string.tourdown),
                R.drawable.walking));
        atlantas.add(new Atlanta(getString(R.string.CNN), getString(R.string.tourdown),
                R.drawable.cnn));
        atlantas.add(new Atlanta(getString(R.string.tourcar), getString(R.string.tourdown),
                R.drawable.electric));
        atlantas.add(new Atlanta(getString(R.string.tourhome), getString(R.string.tourwalkLoc),
                R.drawable.iman));

        AtlantaAdapter adapter = new AtlantaAdapter((getActivity()), atlantas, R.color.colorAccent);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}