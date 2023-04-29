package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("80102261", "Inem", "08219345939", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212121", "Sirabun", "0857126181", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212122", "Rungkad", "085262188", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212123", "Andiyo", "08516175187", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80102261", "Inem", "08219345939", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212121", "Sirabun", "0857126181", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212122", "Rungkad", "085262188", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212123", "Andiyo", "08516175187", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80102261", "Inem", "08219345939", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212121", "Sirabun", "0857126181", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212122", "Rungkad", "085262188", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212123", "Andiyo", "08516175187", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80102261", "Inem", "08219345939", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212121", "Sirabun", "0857126181", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212122", "Rungkad", "085262188", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            MyContact("80212123", "Andiyo", "08516175187", "https://assets-a1.kompasiana.com/items/album/2021/03/24/blank-profile-picture-973460-1280-605aadc08ede4874e1153a12.png"),
            )

            gridView(listStudent)


    }

    private fun listView(value : ArrayList<MyContact>){
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value : ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value : ArrayList<MyContact>) {
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}