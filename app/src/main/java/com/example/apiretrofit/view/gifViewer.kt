package com.example.apiretrofit.view

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.apiretrofit.R
import com.example.apiretrofit.databinding.FragmentGifViewerBinding
import com.example.apiretrofit.viewmodel.UserviewModel
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.android.synthetic.main.fragment_gif_viewer.*

private lateinit var  viewModel: UserviewModel
class gifViewer : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentGifViewerBinding=DataBindingUtil.inflate(
            inflater,com.example.apiretrofit.R.layout.fragment_gif_viewer,
            container,false)


        viewModel = ViewModelProvider(this).get(UserviewModel::class.java)
        binding.refresh.setOnClickListener {
            viewModel.getUserData(1)
//            if (viewModel.answer.value == "yes") {
//                FancyToast.makeText(
//                    this.context,
//                    "YES",
//                    FancyToast.LENGTH_LONG,
//                    FancyToast.SUCCESS,
//                    true
//                ).show()
//            }
//            else if(viewModel.answer.value == "no"){
//                FancyToast.makeText(
//                    this.context,
//                    "NO",
//                    FancyToast.LENGTH_LONG,
//                    FancyToast.ERROR,
//                    true
//                ).show()
//            }


            viewModel.result.observe(this, Observer { src ->
                Glide.with(this)
                    .load(src)
                    .apply(RequestOptions().error(R.drawable.broken_ic))
                    .into(gifshow)
            })

        }




        return binding.root
    }

}