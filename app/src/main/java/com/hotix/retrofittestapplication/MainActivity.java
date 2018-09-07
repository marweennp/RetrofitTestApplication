package com.hotix.retrofittestapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hotix.retrofittestapplication.models.Activite;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;
    private RetrofitInterface service;
    private TextView text;
    private String msg;
    LinearLayout.LayoutParams lparams;

    ArrayList<FactureData> factureData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factureData= new ArrayList<FactureData>();
        loadfactureData();


        myLayout = (LinearLayout) findViewById(R.id.myListView);

        lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text = new TextView(this);
        text.setLayoutParams(lparams);




    }

    public void addField(String title, String text ) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View fieldView = inflater.inflate(R.layout.field, null);
        AppCompatTextView fieldTitle = (AppCompatTextView) fieldView.findViewById(R.id.field_title);
        AppCompatTextView fieldText = (AppCompatTextView) fieldView.findViewById(R.id.field_text);
        fieldTitle.setText(title);
        fieldText.setText(text);

        myLayout.addView(fieldView);
    }

    private void loadfactureData() {
        service = RetrofitClient.getClient().create(RetrofitInterface.class);
        Call<List<Activite>> userCall = service.getActivites();

        userCall.enqueue(new Callback<List<Activite>>() {
            @Override
            public void onResponse(Call<List<Activite>> call, Response<List<Activite>> response) {

                msg = "" + response.toString() + "\n\n" + response.body().toString()+ "\n\n"+response.body().size();
                text.setText(msg);
                myLayout.addView(text);
                for (Activite obj : response.body()) {
                    addField(obj.getCategorie()+" : ", ""+obj.getDescription());
                }
//                Facture facture = response.body();
//                factureData = facture.getData();
//                for (FactureData obj : factureData) {
//                    addField(obj.getDesignation()+" : ", ""+obj.getMontant());
//                }



            }

            @Override
            public void onFailure(Call<List<Activite>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
