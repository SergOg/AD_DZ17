package ru.gb.dz17


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.google.android.material.internal.ContextUtils.getActivity
import ru.gb.dz17.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
        binding.cameraName.text =  intent.getStringExtra("cameraName")
        binding.date.text=intent.getStringExtra("date")
        binding.cameraFullName.text = intent.getStringExtra("cameraFullName")
        binding.pic.load(intent.getStringExtra("img"))
        binding.button.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            getActivity(this)?.finish()
            startActivity(intent)
        }
    }
}