package com.example.coadingchallengenavigationcomponent

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coadingchallengenavigationcomponent.databinding.ActivityMainBinding
import com.example.coadingchallengenavigationcomponent.databinding.EnterEmailFragmentBinding

class EnterEmail : Fragment() {

    companion object {
        fun newInstance() = EnterEmail()
    }

    private lateinit var viewModel: EnterEmailViewModel

    lateinit var binding:EnterEmailFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.enter_email_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EnterEmailViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val name= arguments?.get("name").toString()
        binding.button.setOnClickListener {
            val args=Bundle()
            args.putString("name",name)
            args.putString("email",binding.editTextTextPersonName.text.toString().trim())
            it.findNavController().navigate(R.id.action_enterEmail_to_showData,args)
        }


    }

}