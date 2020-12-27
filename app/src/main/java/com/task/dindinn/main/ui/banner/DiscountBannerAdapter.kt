package com.task.dindinn.main.ui.banner

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter

class DiscountBannerAdapter(fm: FragmentManager, context: Context) :
    AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        val discountBannerFragment = DiscountBannerFragment()
        val args = Bundle()
        args.putInt("CURRENT_STEP_POSITION", position)
        discountBannerFragment.arguments = args
        return discountBannerFragment
    }

    override fun getCount(): Int {
        return 3
    }

}