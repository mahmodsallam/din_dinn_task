package com.task.dindinn.main.ui.pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.task.dindinn.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    private lateinit var binding: FragmentProductBinding
    private var dataSet = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataSet.add("")
        dataSet.add("")
        dataSet.add("")
        dataSet.add("")
        val type = arguments?.getString("TYPE")

        binding.rvProduct.layoutManager = LinearLayoutManager(requireContext())
        binding.rvProduct.adapter = ProductAdapter(dataSet, type)
    }


}