package com.example.btt2screen.fragmentscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.btt2screen.R
import kotlinx.android.synthetic.main.fragment_on_boardingtwo.*

class FragmentOnBoardingtwo : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boardingtwo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2.setOnClickListener{
            val container = findNavController()
            container.navigate(R.id.action_fragmentOnBoardingtwo_to_fragmentOnBoardingthree)
        }
    }
}