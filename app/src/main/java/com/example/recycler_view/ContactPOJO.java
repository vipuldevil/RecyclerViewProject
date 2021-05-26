package com.example.recycler_view;

public class ContactPOJO {
    private String mName;
    private String mNumber;
    private String mAddedOn;

    public ContactPOJO()
    {

    }

    public ContactPOJO(String mName, String mNumber, String mAddedOn) {
        this.mName = mName;
        this.mNumber = mNumber;
        this.mAddedOn = mAddedOn;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getmAddedOn() {
        return mAddedOn;
    }

    public void setmAddedOn(String mAddedOn) {
        this.mAddedOn = mAddedOn;
    }
}
