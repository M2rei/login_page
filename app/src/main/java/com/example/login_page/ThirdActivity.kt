package com.example.login_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_page.databinding.HomepageBinding


class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: HomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username2 = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email2 = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone2 = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding){
            hline12.text = username2
            hline22.text = email2
            hline32.text = phone2
        }
    }
}