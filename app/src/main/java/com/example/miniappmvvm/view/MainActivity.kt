package com.example.miniappmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.miniappmvvm.R
import com.example.miniappmvvm.databinding.ActivityMainBinding
import com.example.miniappmvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initObservers()
    }

    private fun initObservers() {
        quoteViewModel.quoteModel.observe(this) { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author
        }

        binding.viewContainer.setOnClickListener(){
            quoteViewModel.randoQuote()
        }
    }
}