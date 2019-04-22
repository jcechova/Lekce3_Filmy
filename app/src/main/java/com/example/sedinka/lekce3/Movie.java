package com.example.sedinka.lekce3;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {


    public String image;
    public String title;
    public String perc;
    public String country;
    public String year;
    public String description;

    public Movie(String image, String title, String perc, String country, String year, String description) {
        this.image = image;
        this.title = title;
        this.perc = perc;
        this.country = country;
        this.year = year;
        this.description = description;
    }

    protected Movie(Parcel in) {
        image = in.readString();
        title = in.readString();
        perc = in.readString();
        country = in.readString();
        year = in.readString();
        description = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(image);
        dest.writeString(title);
        dest.writeString(perc);
        dest.writeString(country);
        dest.writeString(year);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
