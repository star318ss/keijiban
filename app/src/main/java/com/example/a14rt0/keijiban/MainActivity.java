package com.example.a14rt0.keijiban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    CommentData comData;
    EditText edt_name,edt_comment;
    String str_name,str_comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_comment = (EditText) findViewById(R.id.editText_comment);
        edt_name = (EditText) findViewById(R.id.editText_name);
        Realm.init(this);


    }

    public void Add_Data(View v){

        RealmConfiguration config = new RealmConfiguration.Builder().build();
        realm = Realm.getInstance(config);
        realm.beginTransaction();

        // write
        comData = realm.createObject(CommentData.class);


        str_name = edt_name.getText().toString();
        str_comment = edt_comment.getText().toString();
        comData.setName(str_name);
        comData.setCommenttext(str_comment);
        realm.commitTransaction();
        Change_text(v);
    }

    public void Change_text(View v) {
        TextView tv_n = (TextView) findViewById(R.id.textView_name);
        tv_n.setText(comData.getName());
        TextView tv_c = (TextView) findViewById(R.id.textView_comment);
        tv_c.setText(comData.getCommenttext());
    }
}