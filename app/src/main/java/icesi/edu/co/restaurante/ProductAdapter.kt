package icesi.edu.co.restaurante

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class ProductAdapter:Adapter {
    override fun render(context: Context, product: Product, action:()->Unit): View {
        val button = Button(context)
        button.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        )
        button.text = "${product.name}\n${product.price}"
        button.setOnClickListener {
            action()
        }
        return button
    }
}