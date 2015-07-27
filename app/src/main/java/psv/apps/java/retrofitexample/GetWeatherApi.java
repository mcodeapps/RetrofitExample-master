package psv.apps.java.retrofitexample;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ajaythakur on 6/16/15.
 */
public interface GetWeatherApi {
    @GET("/data/2.5/weather")
    //async
    void getWeatherFromApi (
            @Query("q") String cityName,
            Callback<WeatherData> callback);
    @GET("/data/2.5/weather")
    //sync
    WeatherData getWeatherFromApiSync (
            @Query("q") String cityName);
}
