package com.example.udacityprojectshoes.screen.create

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class CreateAccountFragmentDirections private constructor() {
    companion object {
        fun actionCreateAccountFragmentToInstructionsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_createAccountFragment_to_instructionsFragment)
    }
}
