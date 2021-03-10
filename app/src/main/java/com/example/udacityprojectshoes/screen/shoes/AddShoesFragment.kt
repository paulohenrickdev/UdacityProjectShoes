package com.example.udacityprojectshoes.screen.shoes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentAddShoesBinding

class AddShoesFragment : Fragment() {

    private lateinit var binding: FragmentAddShoesBinding

    private val viewModel: ShoesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_add_shoes,
            container,
            false
        )

        binding.viewModelShoe = viewModel

        return binding.root
    }
}