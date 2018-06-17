package com.example.android.newsapp;

public class News {

    private String mCategory;
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public News(String category, String title, String date, String url, String author){
        mCategory = category;
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthor = author;
    }

    public String getCategory(){
        return mCategory;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getDate(){
        return mDate;
    }

    public String getNewsUrl(){
        return mUrl;
    }

    public String getAuthor(){
        return mAuthor;
    }
}