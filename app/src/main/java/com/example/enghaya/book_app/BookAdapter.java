package com.example.enghaya.book_app;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ENG.HAYA on 9/12/2017 AD.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public BookAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public BookAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Book[] objects) {
        super(context, resource, objects);
    }

    public BookAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull Book[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public BookAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Book> objects) {
        super(context, resource, objects);
    }

    public BookAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull List<Book> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = getItem(position);

        if (convertView == null) {
            //We must create a View:
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        //Here we can do changes to the convertView, such as set a text on a TextView
        //or an image on an ImageView.
        TextView title = (TextView) convertView.findViewById(R.id.information);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        title.setText(book.getTitleinformation());
        author.setText(book.getAuthor());
        return convertView;
    }
}
