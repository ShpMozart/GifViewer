package com.example.apiretrofit.view

import android.graphics.Path
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation

import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import com.example.apiretrofit.R
import com.example.apiretrofit.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_title.*

class Title:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentTitleBinding = DataBindingUtil.inflate(
            inflater,com.example.apiretrofit.R.layout.fragment_title,
            container,false)

        binding.sarch!!.setOnClickListener {

            findNavController().navigate(TitleDirections.actionTitle2ToGifViewer2())








        }









        return binding.root
    }
}



