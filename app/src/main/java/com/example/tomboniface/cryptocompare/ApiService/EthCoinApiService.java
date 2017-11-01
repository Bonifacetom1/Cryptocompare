package com.example.tomboniface.cryptocompare.ApiService;

import com.example.tomboniface.cryptocompare.ConversionETH;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EthCoinApiService {

    @GET("data/price?")
    Call<ConversionETH> loadETHExchange(@Query("fsym") String coins, @Query("tsyms") String currency);
}
