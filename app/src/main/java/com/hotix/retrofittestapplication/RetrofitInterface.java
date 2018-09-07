package com.hotix.retrofittestapplication;

import com.hotix.retrofittestapplication.models.Activite;
import com.hotix.retrofittestapplication.models.FactureModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("MyHotixHouseKeeping/login?login=hotix&password=hotix@admin")
    Call<User> getAnswers();

    @GET("MyHotixHouseKeeping/login?")
    Call<User> getAnswersQuery(@Query("login") String login, @Query("password") String password);

    @GET("myhotixguest/getfacture?")
    Call<Facture> getFactureQuery(@Query("chambre") String chambre);

    @GET("myhotixguest/getdetailsfacture?")
    Call<FactureModel> getFactureModelQuery(@Query("id") String id, @Query("annee") String annee);

    @GET("myhotixguest/getactivites")
    Call<List<Activite>> getActivites();
}
