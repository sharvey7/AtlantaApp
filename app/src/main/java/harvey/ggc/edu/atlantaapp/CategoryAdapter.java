package harvey.ggc.edu.atlantaapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.Locale;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    //private static final String TAG =CategoryAdapter.class.getName() ;



    public CategoryAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //private String tabTitle[] = new String[]{};
    

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new TourFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.foodTitle);
        } else if (position == 2) {
            return mContext.getString(R.string.ArtPlace);

        } else {
            return mContext.getString(R.string.Tour);
        }

    }
}

       /* if(position == 0){
            return mContext.getString(R.string.attract);
        }
        else if(position == 1){
            String foodTitle=mContext.getString(R.string.foodTitle);
            Log.i(TAG,"This is the value for foodTitle:------------------------------------>"+foodTitle);
            return mContext.getString(R.string.foodTitle);
        }
        else if(position == 2){
            return mContext.getString(R.string.museumTitle);
            }
            else{
                return mContext.getString(R.string.tourTitle);
            }
        }*/
        //public String tabTitle[] = new String[]{mContext.getResources().getString(R.string.attract)};

