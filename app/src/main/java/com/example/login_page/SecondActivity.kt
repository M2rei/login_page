package com.example.login_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_page.databinding.LoginBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        val password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD)
        with(binding){
            btnTohomepage.setOnClickListener {
                val intentToThirdActivity =
                    Intent(this@SecondActivity, ThirdActivity::class.java)
                intentToThirdActivity.putExtra(MainActivity.EXTRA_NAME, username)
                intentToThirdActivity.putExtra(MainActivity.EXTRA_EMAIL, email)
                intentToThirdActivity.putExtra(MainActivity.EXTRA_PHONE, phone)
                intentToThirdActivity.putExtra(MainActivity.EXTRA_PASSWORD, password)
                startActivity(intentToThirdActivity)
            }
        }
    }
}