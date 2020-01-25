package it.matteospaggiari.tourguideapp.ui.churches;

/**
 * {@link Church} represent a Church
 * Each church is represented by image, name, website, phone and position
 **/
public class Church {

    /* Image of the Church */
    private int mImageResourceId;
    /* Name of the the Church */
    private String mName;
    /* Website of the Church */
    private String mWebsite;
    /* Phone number of the Church */
    private String mPhone;
    /* Position of the Church */
    private String mPosition;

    public Church(int imageResourceId, String name, String website, String phone, String position) {
        mImageResourceId = imageResourceId;
        mName = name;
        mWebsite = website;
        mPhone = phone;
        mPosition = position;
    }

    /**
     * Get the Image Resource ID of the Church.
     **/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Name of the Church.
     **/
    public String getName() {
        return mName;
    }

    /**
     * Get the Website of the Church.
     **/
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the Phone of the Church.
     **/
    public String getPhone() {
        return mPhone;
    }

    /**
     * Get the Position of the Church.
     **/
    public String getPosition() {
        return mPosition;
    }
}
