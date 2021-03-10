package com.example.udacityprojectshoes.screen.create

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentCreateAccountBinding
import com.example.udacityprojectshoes.screen.instructions.InstructionsFragmentDirections

class CreateAccountFragment : Fragment() {

    private lateinit var binding: FragmentCreateAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_create_account,
            container,
            false
        )

        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(CreateAccountFragmentDirections.actionCreateAccountFragmentToInstructionsFragment())
        }

        return binding.root
    }

}