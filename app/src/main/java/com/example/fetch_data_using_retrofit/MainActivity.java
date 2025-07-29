package com.example.fetch_data_using_retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.review);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        processdata();

    }

    public void processdata() {
        Call<List<ResponceModel>> call = apicontroller
                .getInstance()
                .getapi()
                .getdata();

        call.enqueue(new Callback<List<ResponceModel>>() {
            @Override
            public void onResponse(Call<List<ResponceModel>> call, Response<List<ResponceModel>> response) {
                List<ResponceModel> data =  response.body();

                //now we set the adapter after completing all the steps of R.V
                Adapter adapter = new Adapter(data);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<ResponceModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}