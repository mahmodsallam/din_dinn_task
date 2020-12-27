package com.task.dindinn.main.ui.pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.dindinn.R
import com.task.dindinn.databinding.ItemProductBinding

class ProductAdapter(private var dataSet: MutableList<String>, private var type: String?) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    private lateinit var binding: ItemProductBinding

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(
            binding.root
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        with(binding) {
            when (type) {
                "PIZZA" -> {
                    tvTitle.text = "Pizza"
                    ivProduct.setImageResource(R.drawable.pizza)
                }
                "SUSHI" -> {
                    tvTitle.text = "Sushi"
                    ivProduct.setImageResource(R.drawable.sushi)
                }
                else -> {
                    tvTitle.text = "Drinks"
                    ivProduct.setImageResource(R.drawable.drinks)


                }
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


}