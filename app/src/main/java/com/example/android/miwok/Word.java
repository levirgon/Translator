package com.example.android.miwok;

/**
 * Created by noushad on 2/15/17.
 */

public class Word {
    private static final int DEFAULT = -1;
    private String english;
    private String miwok;
    private int imageResourceId = DEFAULT;
    private int songId;


    public Word(String miwok, String english, int songId) {
        this.miwok = miwok;
        this.english = english;
        this.songId = songId;
    }


    public Word(String english, String miwok, int imageResourceId, int songId) {
        this.english = english;
        this.miwok = miwok;
        this.songId = songId;

        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return english;
    }

    public String getMiwokTranslation() {
        return miwok;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return getImageResourceId() != DEFAULT;
    }

    public int getSongId() {
        return songId;
    }
}
