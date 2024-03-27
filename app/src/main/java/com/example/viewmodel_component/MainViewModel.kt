package com.example.viewmodel_component

import androidx.lifecycle.ViewModel

class MainViewModel(val initialCount: Int) : ViewModel() {

    var count: Int = initialCount

    fun increment(){
        count++
    }

}