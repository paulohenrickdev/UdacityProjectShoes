package com.example.udacityprojectshoes.screen.shoes

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.udacityprojectshoes.R
import com.example.udacityprojectshoes.databinding.FragmentListShoesBinding

class ListShoesFragment : Fragment() {

    private lateinit var binding: FragmentListShoesBinding

    private val viewModel: ShoesViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_list_shoes,
            container,
            false
        )

        setHasOptionsMenu(true)


        viewModel.shoes.observe(viewLifecycleOwner, Observer { shoe ->
            shoe.forEachIndexed { index, shoe ->
                Log.i("INFO", shoe.name.toString())
                val textView =  TextView(requireContext())
                textView.text = "Name: ${shoe.name}, Description: ${shoe.description}"
                textView.id = index
                textView.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )

                binding.shoeView.addView(textView)
            }
        })

        binding.addButton.setOnClickListener {
            findNavController().navigate(ListShoesFragmentDirections.actionListShoesFragmentToAddShoesFragment())
        }

        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_logout, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onOptionsItemSelected(item)
    }

}