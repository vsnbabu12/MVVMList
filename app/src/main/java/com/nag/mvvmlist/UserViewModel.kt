package com.nag.mvvmlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nag.mvvmlist.models.UsersReponse
import com.nag.mvvmlist.repository.UserRepository

class UserViewModel:ViewModel(){

    fun fetchList(): MutableLiveData<UsersReponse> {
        return UserRepository().getList()
       // return response
    }

}