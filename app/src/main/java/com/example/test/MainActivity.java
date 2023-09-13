package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Cat> catList = new ArrayList<Cat>();

        catList.add(new Cat("Con mèo số 1", R.drawable.img));
        catList.add(new Cat("Con mèo số 2", R.drawable.img_1));
        catList.add(new Cat("Con mèo số 3", R.drawable.img_2));
        catList.add(new Cat("Con mèo số 4", R.drawable.img));
        catList.add(new Cat("Con mèo số 5", R.drawable.img_1));
        catList.add(new Cat("Con mèo số 6", R.drawable.img_2));
        catList.add(new Cat("Con mèo số 7", R.drawable.img));
        catList.add(new Cat("Con mèo số 8", R.drawable.img_1));
        catList.add(new Cat("Con mèo số 9", R.drawable.img_2));
        catList.add(new Cat("Con mèo số 10", R.drawable.img));

        recyclerView = findViewById(R.id.rvNews);
        MyAdapter adapter = new MyAdapter(catList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }
}