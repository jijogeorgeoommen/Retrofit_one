package com.example.retrofit_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Androidver>data;
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     initview();

    }

    private void initview() {
        recyclerView=findViewById(R.id.rview);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutmanager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutmanager);
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit=new Retrofit.Builder().baseUrl("http://api.learn2crack.com").addConverterFactory(GsonConverterFactory.create()).build();
        RequestInterface request=retrofit.create(RequestInterface.class);
        Call<JSONRESPONSE>call=request.getJSON();
        call.enqueue(new Callback<JSONRESPONSE>() {
            @Override
            public void onResponse(Call<JSONRESPONSE> call, Response<JSONRESPONSE> response) {
                JSONRESPONSE jresponse=response.body();
                data=new ArrayList<>(Arrays.asList(jresponse.getAndroid()));
                adapter=new DataAdapter(data);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JSONRESPONSE> call, Throwable t) {
                Log.e("Error",t.getMessage());

            }
        });
    }


}
