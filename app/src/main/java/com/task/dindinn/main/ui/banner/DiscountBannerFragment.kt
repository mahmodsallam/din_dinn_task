package com.task.dindinn.main.ui.banner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import com.task.dindinn.R
import com.task.dindinn.databinding.DiscountBannerLayoutBinding

class DiscountBannerFragment : Fragment(), Step {
    private lateinit var binding: DiscountBannerLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DiscountBannerLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {
        when (arguments?.getInt("CURRENT_STEP_POSITION")) {
            0 -> binding.ivBanner.setImageResource(R.drawable.seal1)
            1 -> binding.ivBanner.setImageResource(R.drawable.seal2)
            else -> binding.ivBanner.setImageResource(R.drawable.seal3)
        }

    }

    override fun onError(error: VerificationError) {

    }


}