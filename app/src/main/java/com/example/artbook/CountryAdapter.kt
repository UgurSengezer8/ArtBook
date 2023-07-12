package com.example.artbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.artbook.databinding.RecyclerItemBinding

class CountryAdapter(val countryList: ArrayList<Country>):RecyclerView.Adapter<CountryAdapter.CountryHolder>() {
    class CountryHolder(private val binding: RecyclerItemBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  CountryHolder(binding)
    }

    override fun getItemCount(): Int {
        print("sa")
        return 2
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        print("as")

    }
}