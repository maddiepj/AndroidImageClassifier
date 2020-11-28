package com.hfad.faceclassifier.Database;

import com.hfad.faceclassifier.R;

import java.io.Serializable;

/**
 * This class represents the data that needs to be fed into Recycler View
 */
public class Hairstyle implements Serializable {

    private String faceshape;
    //private int imageResourceId;
    private float rating;
    private Boolean isFavorite;
    private int favoriteIconResourceId;

    // Image URL on Firebase
    private String imageURL;

    // A unique associated with a particular hairstyle image on Firebase
    private String uniqueKey;

    public Hairstyle(){
        // Required empty constructor
    }

    public Hairstyle(String faceshape, String imageURL) {
        this.faceshape = faceshape;
        this.imageURL = imageURL;
    //    this.imageResourceId = imageResourceId;
        this.rating = 0.0f;
        this.isFavorite = false;
        this.uniqueKey = "";
    }

    public void setRating(float rating) { this.rating = rating; }
    public void setFavorite(Boolean isFavorite) { this.isFavorite = isFavorite;}
    //public void setImageResourceId(int imageResourceId) {this.imageResourceId = imageResourceId; }
    public void setFavoriteIconResourceId(int favoriteIconResourceId) {this.favoriteIconResourceId = favoriteIconResourceId; }
    public void setImageURL(String imageURL) { this.imageURL = imageURL; }
    public void setUniqueKey(String uniqueKey) { this.uniqueKey = uniqueKey; }
    public String getFaceshape() { return faceshape; }
    //public int getImageResourceId() { return imageResourceId; }
    public Boolean getIsFavorite() {return isFavorite; }
    public int getFavoriteIconResourceId() {return favoriteIconResourceId; }
    public String getImageURL() { return imageURL; }
    public String getUniqueKey() { return uniqueKey; }


}
