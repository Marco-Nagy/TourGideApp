package com.example.tourgideapp;

import java.io.Serializable;

public class Places implements Serializable {
    int imageView, image1,
            title, description;

    public Places(int imageView, int image1, int title, int description) {
        this.imageView = imageView;
        this.image1 = image1;
        this.title = title;
        this.description = description;
    }

    public Places(int imageView, int title, int description) {
        this.imageView = imageView;
        this.title = title;
        this.description = description;
    }

    public Places() {

    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}

