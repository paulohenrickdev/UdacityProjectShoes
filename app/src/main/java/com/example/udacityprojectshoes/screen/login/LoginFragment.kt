package com.example.udacityprojectshoes.screen.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.loginViewModel = viewModel

        viewModel.eventNavigateWelcome.observe(viewLifecycleOwner, Observer { navigateToWelcome ->
            if(navigateToWelcome) {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
                viewModel.navigateToWelcomeAccountComplete()
            }
        })

        viewModel.eventNavigateCreateAccount.observe(viewLifecycleOwner, Observer { navigateToCreateAccount ->
            if(navigateToCreateAccount) {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCreateAccountFragment())
                viewModel.navigateToCreateAccountComplete()
            }
        })

        return binding.root
    }
}