package com.task.dindinn.main.ui.pager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ProductsPageAdapter(
    private var fragmentManager: FragmentManager,
    private var productFragment: ProductFragment
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                productFragment = ProductFragment()
                var bundle = Bundle()
                bundle.putString("TYPE", "PIZZA")
                productFragment.arguments = bundle
                productFragment

            }
            1 -> {

                productFragment = ProductFragment()
                var bundle = Bundle()
                bundle.putString("TYPE", "SUSHI")
                productFragment.arguments = bundle
                productFragment
            }
            else -> {
                productFragment = ProductFragment()
                var bundle = Bundle()
                bundle.putString("TYPE", "DRINKS")
                productFragment.arguments = bundle
                productFragment
            }

        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return super.getPageTitle(position)
        return position.toString()
    }


}