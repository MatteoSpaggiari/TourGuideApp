package it.matteospaggiari.tourguideapp.ui.palaces;

/**
 * {@link Palace} represent a Palace
 * Each palace is represented by image, name, website, phone and position
 **/
public class Palace {

    /* Image of the Palace */
    private int mImageResourceId;
    /* Name of the the Palace */
    private String mName;
    /* Website of the Palace */
    private String mWebsite;
    /* Phone number of the Palace */
    private String mPhone;
    /* Position of the Palace */
    private String mPosition;

    public Palace(int imageResourceId, String name, String website, String phone, String position) {
        mImageResourceId = imageResourceId;
        mName = name;
        mWebsite = website;
        mPhone = phone;
        mPosition = position;
    }

    /**
     * Get the Image Resource ID of the Palace.
     **/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Name of the Palace.
     **/
    public String getName() {
        return mName;
    }

    /**
     * Get the Website of the Palace.
     **/
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the Phone of the Palace.
     **/
    public String getPhone() {
        return mPhone;
    }

    /**
     * Get the Position of the Palace.
     **/
    public String getPosition() {
        return mPosition;
    }

}
