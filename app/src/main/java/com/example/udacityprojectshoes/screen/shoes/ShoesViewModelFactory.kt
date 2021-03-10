package com.example.udacityprojectshoes.screen.shoes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ShoesViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ShoesViewModel::class.java))
            return ShoesViewModel() as T

        throw IllegalArgumentException("Unknown View Model Class")
    }
}