package com.example.a14rt0.keijiban;

import io.realm.RealmObject;
import android.provider.BaseColumns;
import android.provider.SearchRecentSuggestions;


/**
 * Created by 14rt0 on 2017/03/19.
 */

public class CommentData extends RealmObject {
    private String name;
    private String commenttext;

    public void setName(String name) {
        this.name = name;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }

    public String getName() {
        return name;
    }

    public String getCommenttext() {
        return commenttext;
    }
}



