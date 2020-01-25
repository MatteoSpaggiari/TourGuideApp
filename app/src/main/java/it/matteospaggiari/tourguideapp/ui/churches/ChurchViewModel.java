package it.matteospaggiari.tourguideapp.ui.churches;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link AndroidViewModel} that prepare and manage the data for a ChurchesFragment.
 * Android ViewModel, compared to ViewModel, provides a reference to the application used to recover resources
 */
public class ChurchViewModel extends AndroidViewModel {

    /* Array of churches */
    private Church[] mChurches = new Church[4];

    public ChurchViewModel(Application application) {
        super(application);
        /* Create churches by recovering data from resources */
        mChurches[0] = new Church(R.drawable.basilica_san_andrea, application.getResources().getString(R.string.basilica_san_andrea_name), application.getResources().getString(R.string.basilica_san_andrea_website), application.getResources().getString(R.string.basilica_san_andrea_phone), application.getResources().getString(R.string.basilica_san_andrea_position));
        mChurches[1] = new Church(R.drawable.chiesa_san_sebastiano, application.getResources().getString(R.string.church_san_sebastiano_name), application.getResources().getString(R.string.church_san_sebastiano_website), application.getResources().getString(R.string.church_san_sebastiano_phone), application.getResources().getString(R.string.church_san_sebastiano_position));
        mChurches[2] = new Church(R.drawable.duomo, application.getResources().getString(R.string.basilica_san_pietro_name), application.getResources().getString(R.string.basilica_san_pietro_website), application.getResources().getString(R.string.basilica_san_pietro_phone), application.getResources().getString(R.string.basilica_san_pietro_position));
        mChurches[3] = new Church(R.drawable.rotonda_san_lorenzo, application.getResources().getString(R.string.rotunda_san_lorenzo_name), application.getResources().getString(R.string.rotunda_san_lorenzo_website), application.getResources().getString(R.string.rotunda_san_lorenzo_phone), application.getResources().getString(R.string.rotunda_san_lorenzo_position));
    }

    /**
     * Provides a church
     * @param position to recover a church to a specific location
     * @return a church
     */
    public Church getChurch(int position) {
        return mChurches[position];
    }

    /**
     * Provides the number of churches
     * @return the number of churches
     */
    public int numberChurches() {
        return mChurches.length;
    }
}