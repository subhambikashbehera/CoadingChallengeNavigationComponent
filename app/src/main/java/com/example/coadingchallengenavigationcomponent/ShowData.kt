package com.example.coadingchallengenavigationcomponent

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coadingchallengenavigationcomponent.databinding.ShowDataFragmentBinding

class ShowData : Fragment() {

    companion object {
        fun newInstance() = ShowData()
    }

    private lateinit var viewModel: ShowDataViewModel


    lateinit var binding:ShowDataFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.show_data_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShowDataViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val nameX=arguments?.getString("name")
        val emailX=arguments?.get("email")

        binding.apply {
            name.text=nameX.toString()
            email.text=emailX.toString()

            button3.setOnClickListener {
                it.findNavController().navigate(R.id.action_showData_to_termsAndCondition)
            }
        }





    }

}