package com.example.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.adapter.ProductAdapter.ProductHolder
import com.example.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.productImage

class ProductAdapter(val context : Context, val products : List<Product>) : RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val productsImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product : Product, context : Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productsImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
        }
    }
}