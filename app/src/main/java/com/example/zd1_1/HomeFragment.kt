package com.example.zd1_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        val button2 = view.findViewById<Button>(R.id.button2);
        val button3 = view.findViewById<Button>(R.id.button3);
        val button4 = view.findViewById<Button>(R.id.button4);

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragment2)
        }

        button3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragment3)
        }

        button4.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragment4)
        }

        return view
    }
}