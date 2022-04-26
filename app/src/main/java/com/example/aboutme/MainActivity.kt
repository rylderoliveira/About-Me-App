package com.example.aboutme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = MyName("Rylder", "Oliveira")

        binding.imageView.setImageResource(R.drawable.avatar)
        binding.button.setOnClickListener {
            showText()
        }
        //val imageView = findViewById<ImageView>(R.id.imageView)
        //Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView)
    }

    private fun showText() {
        if (binding.editTextTextPersonName3.text.toString() != ""){
            binding.textView.text = "Welcome ${binding.editTextTextPersonName3.text}!! \n Nice to meet you \n This is your profile \uD83D\uDE18"
            binding.textView.visibility = View.VISIBLE
            binding.button.visibility = View.GONE
            binding.editTextTextPersonName3.visibility = View.GONE
        } else {
            binding.textView.text = "Hey Buddy!! \n We need your name at least"
            binding.textView.visibility = View.VISIBLE
        }
    }
}