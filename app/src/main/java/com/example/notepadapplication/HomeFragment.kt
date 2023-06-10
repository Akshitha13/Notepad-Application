package com.example.notepadapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.notepadapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.apply {
            floatingActionButton.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_newNoteFragment)
            }
            searchIcon.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
            }
        }

        return binding.root
    }
}