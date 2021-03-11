package com.example.udacityprojectshoes.screen.instructions

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class InstructionsFragmentDirections private constructor() {
    companion object {
        fun actionInstructionsFragmentToListShoesFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_instructionsFragment_to_listShoesFragment)
    }
}
