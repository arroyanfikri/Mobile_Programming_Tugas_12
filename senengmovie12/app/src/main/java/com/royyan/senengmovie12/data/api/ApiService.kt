package com.royyan.senengmovie12.data.api

import com.royyan.senengmovie12.data.model.ListResponse
import com.royyan.senengmovie12.data.model.MovieResponse
import com.royyan.senengmovie12.data.model.TvShowResponse
import com.royyan.senengmovie12.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}