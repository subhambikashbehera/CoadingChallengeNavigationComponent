package com.example.coadingchallengenavigationcomponent

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coadingchallengenavigationcomponent.databinding.WelcomeScreenFragmentBinding

class WelcomeScreen : Fragment() {

    companion object {
        fun newInstance() = WelcomeScreen()
    }

    private lateinit var viewModel: WelcomeScreenViewModel

    lateinit var binding:WelcomeScreenFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       binding=DataBindingUtil.inflate(inflater,R.layout.welcome_screen_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[WelcomeScreenViewModel::class.java]
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.signup.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeScreen_to_enterName)
        }
        binding.TermsCondition.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeScreen_to_termsAndCondition)
        }




    }

}