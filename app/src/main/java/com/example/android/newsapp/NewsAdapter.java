package com.example.android.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Activity context, ArrayList<News> earthquakes){

        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        News currentListItem = getItem(position);


        /**
         * Set Category and Title text
         */
        String categoryName = currentListItem.getCategory();
        String articleTitle = currentListItem.getTitle();

        TextView category = listItemView.findViewById(R.id.item_category);
        category.setText(categoryName);

        TextView title = listItemView.findViewById(R.id.item_title);
        title.setText(articleTitle);

        /**
         * Set Author name
         */
        String authorName = currentListItem.getAuthor();
        TextView contributor = listItemView.findViewById(R.id.item_contributor);

        if (authorName.contains("empty")) {
            contributor.setText("");
        } else {
            contributor.setText(authorName);
        }

        /**
         * Set Date text
         */

        String articleDT = currentListItem.getDate();

        String datePart;
        String timePart;
        String timePartForm;

        String[] dateTimeParts = articleDT.split("T");
        datePart = dateTimeParts[0];
        timePart = dateTimeParts[1];

        timePartForm = timePart.substring(0, timePart.length() - 4);

        TextView date = listItemView.findViewById((R.id.item_date));
        date.setText(datePart);


        TextView time = listItemView.findViewById((R.id.item_time));
        time.setText(timePartForm);

        return listItemView;
    }

}
