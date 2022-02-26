package com.example.coadingchallengenavigationcomponent

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.coadingchallengenavigationcomponent.databinding.EnterEmailFragmentBinding
import com.example.coadingchallengenavigationcomponent.databinding.RenameFragmentBinding

class EnterName : Fragment() {

    companion object {
        fun newInstance() = EnterName()
    }

    private lateinit var viewModel: BlankViewModel

    lateinit var binding:RenameFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.rename_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BlankViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.button2.setOnClickListener {
            val args=Bundle()
            args.putString("name",binding.editTextTextPersonName2.text.toString().trim())
            it.findNavController().navigate(R.id.action_enterName_to_enterEmail,args)
        }



    }

}