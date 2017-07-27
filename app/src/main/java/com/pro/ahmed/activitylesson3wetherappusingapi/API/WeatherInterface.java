package com.pro.ahmed.activitylesson3wetherappusingapi.API;

import com.pro.ahmed.activitylesson3wetherappusingapi.Model.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
/**
 * Created by Byron on 3/18/2017.
 */
public interface WeatherInterface {
    /* @GET("weather?")
    Call<WeatherResponse> getWeatherFromZip(
    @Query("zip") String zip,
    @Query("APPID") String appId
    );*/
    @GET("{api_key}/conditions/q/CA/San_Francisco.json")
    Call<WeatherResponse> getWeatherFromSanFrancisco(
            @Path("api_key") String apiKey
    );
}