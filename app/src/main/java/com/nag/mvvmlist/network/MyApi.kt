package com.nag.mvvmlist.network

import com.nag.mvvmlist.models.UsersReponse
import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MyApi {

    @GET("users/hadley/orgs")
    fun getList(): retrofit2.Call<UsersReponse>

    /*companion object{
        operator fun invoke(): MyApi {
            return Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)
        }


    }*/
}