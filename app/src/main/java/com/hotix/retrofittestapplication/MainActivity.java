package com.hotix.retrofittestapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;
    private RetrofitInterface service;
    private TextView text;
    private String msg;
    LinearLayout.LayoutParams lparams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (LinearLayout) findViewById(R.id.myListView);

        lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text = new TextView(this);
        text.setLayoutParams(lparams);

        service = RetrofitClient.getClient().create(RetrofitInterface.class);
        Call<Facture> userCall = service.getFactureQuery("7201");

        userCall.enqueue(new Callback<Facture>() {
            @Override
            public void onResponse(Call<Facture> call, Response<Facture> response) {
                Toast.makeText(MainActivity.this, "message: ", Toast.LENGTH_SHORT).show();



                msg = "" + response.toString() + "\n\n" + response.body().toString()+ "\n\n";
                for (FactureData obj : response.body().getData()) {
                    msg +="\n"+obj.getDesignation()+" : "+obj.getMontant();
                }

                text.setText(msg);
                myLayout.addView(text);

            }

            @Override
            public void onFailure(Call<Facture> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
