package icesi.edu.co.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.Toast
import icesi.edu.co.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    val adapter: Adapter by lazy { ProductAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        menu.forEach { producto ->
            //Product -> View
            val view = adapter.render(
                this,
                producto,
                ::alfa
            )
            binding.verticalContainer.addView(view)
        }
    }

    fun alfa(){

    }

}