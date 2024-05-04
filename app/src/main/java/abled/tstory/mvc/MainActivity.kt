package abled.tstory.mvc

import abled.tstory.mvc.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val model = Model()

        //뷰바인딩
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            model.add()
            binding.textViewCount.text = model.total.toString()
            binding.textViewTotalPrice.text = model.getTotalPrice().toString()+"원"
        }

        binding.buttonSubtract.setOnClickListener {
            model.subtract()
            binding.textViewCount.text = model.total.toString()
            binding.textViewTotalPrice.text = model.getTotalPrice().toString()+"원"
        }
    }
}