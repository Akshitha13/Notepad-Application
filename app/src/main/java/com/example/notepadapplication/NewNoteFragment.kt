package com.example.notepadapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.notepadapplication.databinding.FragmentNewNoteBinding

class NewNoteFragment : Fragment() {

    private lateinit var binding: FragmentNewNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewNoteBinding.inflate(inflater, container, false)

        binding.apply {
            backArrow.setOnClickListener {
                findNavController().popBackStack()
            }
            saveBtn.setOnClickListener {
                // save data to room DB
            }
        }
        return binding.root
    }
}