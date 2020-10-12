package com.nag.mvvmlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.nag.mvvmlist.R
import com.nag.mvvmlist.models.UsersReponse
import kotlinx.android.synthetic.main.list_item.view.*

class UserAdapter(val userResp: MutableLiveData<UsersReponse>): RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater
                        .from(parent.context)
                        .inflate(R.layout.list_item,parent,false)

        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user =userResp.value
        holder.searchName.text =user?.get(position)?.login

        holder.itemView.setOnClickListener{
            print("on click in list item")
        }
    }

    override fun getItemCount(): Int {
        return 5
    }

}

class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val searchName = itemView.list_title
}