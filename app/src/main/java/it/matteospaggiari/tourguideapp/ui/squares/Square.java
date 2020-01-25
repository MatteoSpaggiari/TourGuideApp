package it.matteospaggiari.tourguideapp.ui.squares;

/**
 * {@link Square} represent a Square
 * Each square is represented by image, name, website, phone and position
 **/
public class Square {

    /* Image of the Square */
    private int mImageResourceId;
    /* Name of the the Square */
    private String mName;
    /* Website of the Square */
    private String mWebsite;
    /* Phone number of the Square */
    private String mPhone;
    /* Position of the Square */
    private String mPosition;

    public Square(int imageResourceId, String name, String website, String phone, String position) {
        mImageResourceId = imageResourceId;
        mName = name;
        mWebsite = website;
        mPhone = phone;
        mPosition = position;
    }

    /**
     * Get the Image Resource ID of the Square.
     **/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Name of the Square.
     **/
    public String getName() {
        return mName;
    }

    /**
     * Get the Website of the Square.
     **/
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the Phone of the Square.
     **/
    public String getPhone() {
        return mPhone;
    }

    /**
     * Get the Position of the Square.
     **/
    public String getPosition() {
        return mPosition;
    }
}
