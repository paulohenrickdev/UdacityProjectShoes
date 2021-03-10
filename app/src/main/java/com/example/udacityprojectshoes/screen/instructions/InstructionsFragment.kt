package com.example.udacityprojectshoes.screen.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentInstructionsBinding
import com.example.udacityprojectshoes.screen.WelcomeDirections

class InstructionsFragment : Fragment() {

    lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_instructions,
            container,
            false
        )

        binding.navigateToListShoes.setOnClickListener {
            findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToListShoesFragment())
        }

        return binding.root
    }


}