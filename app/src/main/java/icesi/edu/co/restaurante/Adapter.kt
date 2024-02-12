package icesi.edu.co.restaurante

import android.content.Context
import android.view.View

interface Adapter {
    fun render(context:Context, product: Product, action:()->Unit) : View
}