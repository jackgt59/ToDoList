package com.jackrocks.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayList<Item> mToDoList = new ArrayList<>();
    private ArrayAdapter<Item> mArrayAdapter;
    private Intent mNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.ListView);
        mToDoList = new ArrayList<>();




        Button btn_NewActivity = (Button) findViewById(R.id.btn_NewActivity);
        mNewActivity = new Intent(MainActivity.this, NewActivity.class);
        View.OnClickListener NewActivityView = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mNewActivity);
            }
        };
        btn_NewActivity.setOnClickListener(NewActivityView);




        String information = getIntent().getStringExtra("name");
        String data = getIntent().getStringExtra("description");


        Item item1 = new Item("running","run for your life!");
        Item item2 = new Item("Breakfast","Eat as much as you can");
        Item item3 = new Item("Homework", "Review Homework");
        Item item4 = new Item("School", "Go to class");
        Item item5 = new Item("Diner", "Eat dinner");
        Item item6 = new Item(information, data);


        mToDoList.add(item1);
        mToDoList.add(item2);
        mToDoList.add(item3);
        mToDoList.add(item4);
        mToDoList.add(item5);
        mToDoList.add(item6);





        mArrayAdapter = new ArrayAdapter<Item>(this, R.layout.layout_item,mToDoList);



        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String desc = mToDoList.get(position).getDesc();
                Toast.makeText(getApplicationContext(),desc,Toast.LENGTH_SHORT).show();

            }

        });




        mListView.setAdapter(mArrayAdapter);




    }

}
