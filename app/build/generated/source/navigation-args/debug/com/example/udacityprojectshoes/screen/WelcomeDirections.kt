package com.example.udacityprojectshoes.screen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class WelcomeDirections private constructor() {
    companion object {
        fun actionWelcomeFragmentToInstructionsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_welcomeFragment_to_instructionsFragment)

        fun actionWelcomeFragmentToLoginFragment2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_welcomeFragment_to_loginFragment2)
    }
}
