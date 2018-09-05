package com.hotix.retrofittestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RetrofitInterface service;

    private TextView text;

    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        service = RetrofitClient.getClient().create(RetrofitInterface.class);
        Call<User> userCall = service.getAnswersQuery("hotix","hotix@admin");

        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(MainActivity.this, "message: ", Toast.LENGTH_SHORT).show();


                msg = ""+response.toString()+"\n\n"+response.body().toString()+"\n\n"+response.body().getData().toString();

                text.setText(msg);

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
