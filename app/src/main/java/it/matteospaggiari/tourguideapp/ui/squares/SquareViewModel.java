package it.matteospaggiari.tourguideapp.ui.squares;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link AndroidViewModel} that prepare and manage the data for a SquaresFragment.
 * Android ViewModel, compared to ViewModel, provides a reference to the application used to recover resources
 */
public class SquareViewModel extends AndroidViewModel {

    /* Array of squares */
    private Square[] mSquares = new Square[3];

    public SquareViewModel(Application application) {
        super(application);
        /* Create squares by recovering data from resources */
        mSquares[0] = new Square(R.drawable.piazza_virgiliana, application.getResources().getString(R.string.square_virgiliana_name), application.getResources().getString(R.string.square_virgiliana_website), application.getResources().getString(R.string.square_virgiliana_phone), application.getResources().getString(R.string.square_virgiliana_position));
        mSquares[1] = new Square(R.drawable.piazza_sordello, application.getResources().getString(R.string.square_sordello_name), application.getResources().getString(R.string.square_sordello_website), application.getResources().getString(R.string.square_sordello_phone), application.getResources().getString(R.string.square_sordello_position));
        mSquares[2] = new Square(R.drawable.piazza_broletto, application.getResources().getString(R.string.square_broletto_name), application.getResources().getString(R.string.square_broletto_website), application.getResources().getString(R.string.square_broletto_phone), application.getResources().getString(R.string.square_broletto_position));
    }

    /**
     * Provides a square
     * @param position to recover a square to a specific location
     * @return a square
     */
    public Square getSquare(int position) {
        return mSquares[position];
    }

    /**
     * Provides the number of squares
     * @return the number of squares
     */
    public int numberSquares() {
        return mSquares.length;
    }
}