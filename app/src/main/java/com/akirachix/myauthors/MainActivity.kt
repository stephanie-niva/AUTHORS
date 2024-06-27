package com.akirachix.myauthors

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myauthors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAuthors.layoutManager = LinearLayoutManager(this)
        displayAuthors()
    }
    fun displayAuthors(){
        val author1 =Author("","Anne","The girl","2004.4.2","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author2 = Author("","Andrew","One Life","2000.2.3","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author3 = Author("","Alex","the bird","1999.7.8","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author4 = Author("","Nigel","my life","2000.6.7","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author5 = Author("","Wendy","the well","2014.6.7","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author6 = Author("","John","right and wrong","2010.9.1","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author7 = Author("","Alan","day of revenge","2018.9.5","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author8 = Author("","James","alight","2019.9.7","Throughout my career, I have developed expertise in backend development, working extensively with tech")
        val author9 = Author("","Tressy","everything everything","2024.10.4","Throughout my career, I have developed expertise in backend development, working extensively with tech")


        val authorList = listOf(author1,author2,author3,author4,author5,author6,author7,author8)
        val authorsAdapter = AuthorAdapter(authorList)
        binding.rvAuthors.adapter =authorsAdapter

    }
}