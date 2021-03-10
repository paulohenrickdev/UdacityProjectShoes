package com.example.udacityprojectshoes.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentWelcomeBinding
import com.example.udacityprojectshoes.screen.WelcomeDirections

class Welcome : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_welcome,
            container,
            false
        )

        binding.navigateToListShoes.setOnClickListener {
            findNavController().navigate(WelcomeDirections.actionWelcomeFragmentToInstructionsFragment())
        }

        return binding.root
    }
}