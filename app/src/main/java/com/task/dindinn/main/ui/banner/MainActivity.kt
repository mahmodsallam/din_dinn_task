package com.task.dindinn.main.ui.banner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.task.dindinn.R
import com.task.dindinn.databinding.ActivityMainBinding
import com.task.dindinn.main.ui.pager.ProductFragment
import com.task.dindinn.main.ui.pager.ProductsPageAdapter
import com.task.dindinn.main.ui.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pagerAdapter: ProductsPageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.stepperLayout.adapter = DiscountBannerAdapter(supportFragmentManager, this)
        pagerAdapter = ProductsPageAdapter(supportFragmentManager, ProductFragment())
        binding.myViewPager.adapter = pagerAdapter
        binding.tabLayout.setupWithViewPager(binding.myViewPager)
        setupTabLayout()
    }

    private fun setupTabLayout() {
        for (i in 0..pagerAdapter.count) {
            when (i) {
                0 -> {
                    binding.tabLayout.getTabAt(i)?.text = "Pizza"
                }
                1 -> {
                    binding.tabLayout.getTabAt(i)?.text = "Sushi"
                }
                else -> {
                    binding.tabLayout.getTabAt(i)?.text = "Drinks"

                }

            }
        }
        binding.tabLayout.setSelectedTabIndicatorColor(0)
        binding.tabLayout.setSelectedTabIndicator(0)
    }


}