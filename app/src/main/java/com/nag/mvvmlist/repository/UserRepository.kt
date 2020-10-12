package com.nag.mvvmlist.repository

import androidx.lifecycle.MutableLiveData
import com.nag.mvvmlist.models.UsersReponse
import com.nag.mvvmlist.network.MyApi
import com.nag.mvvmlist.network.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository{

    fun getList():MutableLiveData<UsersReponse>{
        val userResp = MutableLiveData<UsersReponse>()
        val call: Call<UsersReponse> = RetrofitService.getClient.getList()
        call.enqueue(object : Callback<UsersReponse> {

            override fun onResponse(call: Call<UsersReponse>, response: Response<UsersReponse>) {
                userResp.postValue(response.body())
            }

            override fun onFailure(call: Call<UsersReponse>, t: Throwable) {
                //TODO("Not yet implemented")
            }

            
        })
        return userResp
    }
}