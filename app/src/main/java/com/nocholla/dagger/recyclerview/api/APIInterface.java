package com.nocholla.dagger.recyclerview.api;

import com.nocholla.dagger.recyclerview.model.Film;
import com.nocholla.dagger.recyclerview.model.StarWars;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface APIInterface {
    @GET("people/?")
    Call<StarWars> getPeople(@Query("format") String format);

    @GET
    Call<Film> getFilmData(@Url String url, @Query("format") String format);
}

