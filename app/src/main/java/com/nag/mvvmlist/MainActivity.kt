package com.nag.mvvmlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nag.mvvmlist.adapter.UserAdapter
import com.nag.mvvmlist.models.UsersReponse

class MainActivity : AppCompatActivity() {



    private lateinit var  viewModel:UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler:RecyclerView = findViewById(R.id.recyclerView)

        viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        val response: MutableLiveData<UsersReponse> = viewModel.fetchList()
        recycler.adapter = UserAdapter(response)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)

        Toast.makeText(this,"Text",Toast.LENGTH_LONG).show()
    }
}