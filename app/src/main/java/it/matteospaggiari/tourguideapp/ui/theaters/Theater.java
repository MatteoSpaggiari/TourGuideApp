package it.matteospaggiari.tourguideapp.ui.theaters;

/**
 * {@link Theater} represent a Theater
 * Each theater is represented by image, name, website, phone and position
 **/
public class Theater {

    /* Image of the Theater */
    private int mImageResourceId;
    /* Name of the the Theater */
    private String mName;
    /* Website of the Theater */
    private String mWebsite;
    /* Phone number of the Theater */
    private String mPhone;
    /* Position of the Theater */
    private String mPosition;

    public Theater(int imageResourceId, String name, String website, String phone, String position) {
        mImageResourceId = imageResourceId;
        mName = name;
        mWebsite = website;
        mPhone = phone;
        mPosition = position;
    }

    /**
     * Get the Image Resource ID of the Theater.
     **/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Name of the Theater.
     **/
    public String getName() {
        return mName;
    }

    /**
     * Get the Website of the Theater.
     **/
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the Phone of the Theater.
     **/
    public String getPhone() {
        return mPhone;
    }

    /**
     * Get the Position of the Theater.
     **/
    public String getPosition() {
        return mPosition;
    }
}
