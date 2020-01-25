package it.matteospaggiari.tourguideapp.ui.theaters;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link AndroidViewModel} that prepare and manage the data for a TheatersFragment.
 * Android ViewModel, compared to ViewModel, provides a reference to the application used to recover resources
 */
public class TheaterViewModel extends AndroidViewModel {

    /* Array of theaters */
    private Theater[] mTheaters = new Theater[2];

    public TheaterViewModel(Application application) {
        super(application);
        /* Create theaters by recovering data from resources */
        mTheaters[0] = new Theater(R.drawable.teatro_bibiena, application.getResources().getString(R.string.theater_bibiena_name), application.getResources().getString(R.string.theater_bibiena_website), application.getResources().getString(R.string.theater_bibiena_phone), application.getResources().getString(R.string.theater_bibiena_position));
        mTheaters[1] = new Theater(R.drawable.teatro_sociale, application.getResources().getString(R.string.theater_sociale_name), application.getResources().getString(R.string.theater_sociale_website), application.getResources().getString(R.string.theater_sociale_phone), application.getResources().getString(R.string.theater_sociale_position));
    }

    /**
     * Provides a theater
     * @param position to recover a theater to a specific location
     * @return a theater
     */
    public Theater getTheater(int position) {
        return mTheaters[position];
    }

    /**
     * Provides the number of theaters
     * @return the number of theaters
     */
    public int numberTheaters() {
        return mTheaters.length;
    }
}