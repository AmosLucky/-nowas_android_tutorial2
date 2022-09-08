package com.example.nowas_android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewPractal extends AppCompatActivity {
    ListView listView;
    EditText editText;
    Button addBnt;
    ArrayList names = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_practal);

        listView = findViewById(R.id.listview);
        editText =  findViewById(R.id.name);
        addBnt =  findViewById(R.id.add);

        ArrayAdapter adapter =  new ArrayAdapter(this, android.R.layout.simple_spinner_item,names);
        listView.setAdapter(adapter);

        addBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTxt = editText.getText().toString();
                if(!nameTxt.trim().isEmpty()){
                    names.add(nameTxt);
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                }else{
                    Toast.makeText(ListViewPractal.this,"Names is Empty",Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}