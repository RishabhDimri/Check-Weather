package com.example.checkweather.utilities

import com.example.checkweather.models.WeatherModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherDta(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("APPID") appid:String
    ):Call<WeatherModel>



    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q:String,
        @Query("APPID") appid:String
    ):Call<WeatherModel>
}