package com.example.bookingflights_dacs3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface APIService {
    Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();

    APIService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.1.126/webservice/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(APIService.class);
    @GET("display.php")
    Call<List<Ticket>> getListTicket();
}
