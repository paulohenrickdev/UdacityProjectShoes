package com.example.udacityprojectshoes.screen.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class LoginFragmentDirections private constructor() {
    companion object {
        fun actionLoginFragmentToCreateAccountFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_loginFragment_to_createAccountFragment)

        fun actionLoginFragmentToWelcomeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_loginFragment_to_welcomeFragment)
    }
}
