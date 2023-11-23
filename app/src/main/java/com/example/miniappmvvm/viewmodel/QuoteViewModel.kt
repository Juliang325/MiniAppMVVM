package com.example.miniappmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.miniappmvvm.model.QuoteModel
import com.example.miniappmvvm.model.QuoteProvider

class QuoteViewModel : ViewModel(){
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randoQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}