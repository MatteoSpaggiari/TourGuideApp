package it.matteospaggiari.tourguideapp.ui.palaces;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link AndroidViewModel} that prepare and manage the data for a PalacesFragment.
 * Android ViewModel, compared to ViewModel, provides a reference to the application used to recover resources
 */
public class PalaceViewModel extends AndroidViewModel {

    /* Array of palaces */
    private Palace[] mPalaces = new Palace[4];

    public PalaceViewModel(Application application) {
        super(application);
        /* Create palaces by recovering data from resources */
        mPalaces[0] = new Palace(R.drawable.palazzo_te, application.getResources().getString(R.string.palace_te_name),application.getResources().getString(R.string.palace_te_website),application.getResources().getString(R.string.palace_te_phone),application.getResources().getString(R.string.palace_te_position));
        mPalaces[1] = new Palace(R.drawable.palazzo_ducale, application.getResources().getString(R.string.palace_ducale_name),application.getResources().getString(R.string.palace_ducale_website), application.getResources().getString(R.string.palace_ducale_phone), application.getResources().getString(R.string.palace_ducale_position));
        mPalaces[2] = new Palace(R.drawable.palazzo_bonacolsi, application.getResources().getString(R.string.palace_bonacolsi_name),application.getResources().getString(R.string.palace_bonacolsi_website), application.getResources().getString(R.string.palace_bonacolsi_phone), application.getResources().getString(R.string.palace_bonacolsi_position));
        mPalaces[3] = new Palace(R.drawable.palazzo_della_ragione, application.getResources().getString(R.string.palace_ragione_name),application.getResources().getString(R.string.palace_ragione_website), application.getResources().getString(R.string.palace_ragione_phone), application.getResources().getString(R.string.palace_ragione_position));
    }

    /**
     * Provides a palace
     * @param position to recover a palace to a specific location
     * @return a palace
     */
    public Palace getPalace(int position) {
        return mPalaces[position];
    }

    /**
     * Provides the number of palaces
     * @return the number of palaces
     */
    public int numberPlaces() {
        return mPalaces.length;
    }
}