package com.example.udacityprojectshoes.screen.shoes

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class AddShoesFragmentDirections private constructor() {
    companion object {
        fun actionAddShoesFragmentToListShoesFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_addShoesFragment_to_listShoesFragment)
    }
}
