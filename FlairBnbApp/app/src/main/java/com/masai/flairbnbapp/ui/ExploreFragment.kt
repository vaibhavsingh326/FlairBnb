package com.masai.flairbnbapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.masai.flairbnbapp.R
import com.roacult.backdrop.BackdropLayout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExploreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MainActivity.navToggleInterface.setNavigation(true)
        val navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.btnNext2).setOnClickListener {
            navController.navigate(R.id.action_exploreFragment_to_hostPart1Fragment)
        }
        view.findViewById<Button>(R.id.btnSearch).setOnClickListener {
            navController.navigate(R.id.action_exploreFragment_to_placesFragment)
        }
    }

}

