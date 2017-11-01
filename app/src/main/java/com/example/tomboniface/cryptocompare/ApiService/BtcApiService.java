package com.example.tomboniface.cryptocompare.ApiService;

import com.example.tomboniface.cryptocompare.ConversionBTC;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface BtcApiService {

    @GET("data/price?")
    Call<ConversionBTC> loadETHExchange(@Query("fsym") String coins, @Query("tsyms") String currency);
}
