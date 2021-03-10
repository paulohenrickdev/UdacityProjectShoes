package com.example.udacityprojectshoes.screen.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val _eventNavigateCreateAccount = MutableLiveData<Boolean>()
    val eventNavigateCreateAccount : LiveData<Boolean>
        get() = _eventNavigateCreateAccount

    private val _eventNavigateWelcome = MutableLiveData<Boolean>()
    val eventNavigateWelcome : LiveData<Boolean>
        get() = _eventNavigateWelcome

    fun navigateToCreateAccount() {
        _eventNavigateCreateAccount.value = true
    }

    fun navigateToCreateAccountComplete() {
        _eventNavigateCreateAccount.value = false
    }

    fun navigateToWelcome() {
        _eventNavigateWelcome.value = true
    }

    fun navigateToWelcomeAccountComplete() {
        _eventNavigateWelcome.value = false
    }
}