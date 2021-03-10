package com.example.udacityprojectshoes.screen.shoes

import android.view.View
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.model.Shoe

class ShoesViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>()

    val shoes: LiveData<List<Shoe>>
        get() = _shoes

    private val shoeList = ArrayList<Shoe>()

    fun save(editName: EditText, editDescription: EditText) {
        if (editName.text.isNotEmpty() && editName.text.isNotEmpty()) {
            shoeList.add(Shoe(editName.text.toString(), editDescription.text.toString()))
        }

        _shoes.value = shoeList

        editName.findNavController().navigate(R.id.action_addShoesFragment_to_listShoesFragment)
    }

    fun cancelAddShoeList(view: View) {
        view.findNavController().navigate(R.id.action_addShoesFragment_to_listShoesFragment)
    }


}