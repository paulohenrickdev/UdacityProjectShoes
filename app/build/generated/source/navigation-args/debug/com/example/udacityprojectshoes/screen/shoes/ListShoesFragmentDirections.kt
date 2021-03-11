package com.example.udacityprojectshoes.screen.shoes

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.udacityprojectshoes.R

class ListShoesFragmentDirections private constructor() {
    companion object {
        fun actionListShoesFragmentToAddShoesFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_listShoesFragment_to_addShoesFragment)
    }
}
