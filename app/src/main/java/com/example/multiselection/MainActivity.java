package com.example.multiselection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<User> userArrayList;
    UserAdepter userAdepter;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview1);
        textView=findViewById(R.id.tvcounter);
        imageView=findViewById(R.id.ivdelete);
        imageView.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        userArrayList=new ArrayList<>();
        userArrayList.add(new User("Java",R.drawable.pzds));
        userArrayList.add(new User("Kotlin",R.drawable.pzds));
        userArrayList.add(new User("JavaScript",R.drawable.pzds));
        userArrayList.add(new User("NodeJs",R.drawable.pzds));
        userArrayList.add(new User("Python",R.drawable.pzds));
        userArrayList.add(new User("Ruby",R.drawable.pzds));
        userArrayList.add(new User("Kotlin",R.drawable.pzds));
        userArrayList.add(new User("Java",R.drawable.pzds));
        userArrayList.add(new User("JavaScript",R.drawable.pzds));
        userArrayList.add(new User("NodeJs",R.drawable.pzds));
        userArrayList.add(new User("Python",R.drawable.pzds));
        userArrayList.add(new User("Ruby",R.drawable.pzds));
        userArrayList.add(new User("Java",R.drawable.pzds));
        userArrayList.add(new User("Kotlin",R.drawable.pzds));
        userArrayList.add(new User("JavaScript",R.drawable.pzds));
        userArrayList.add(new User("NodeJs",R.drawable.pzds));
        userArrayList.add(new User("Python",R.drawable.pzds));
        userArrayList.add(new User("Ruby",R.drawable.pzds));
        userArrayList.add(new User("Java",R.drawable.pzds));
        userArrayList.add(new User("JavaScript",R.drawable.pzds));
        userArrayList.add(new User("Kotlin",R.drawable.pzds));
        userArrayList.add(new User("NodeJs",R.drawable.pzds));
        userArrayList.add(new User("Python",R.drawable.pzds));
        userArrayList.add(new User("Ruby",R.drawable.pzds));
        userAdepter=new UserAdepter(MainActivity.this,userArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(userAdepter);
    }
}