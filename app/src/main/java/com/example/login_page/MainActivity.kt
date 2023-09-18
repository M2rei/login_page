package com.example.login_page

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.login_page.databinding.RegisterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: RegisterBinding

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "email"
        const val EXTRA_PHONE = "phone"
        const val EXTRA_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnToSecondActivity.setOnClickListener{
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra(EXTRA_NAME, Rusername.text.toString())
                intentToSecondActivity.putExtra(EXTRA_EMAIL, Remail.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PHONE, Rphone.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PASSWORD, RPassword.text.toString())
                startActivity(intentToSecondActivity)
            }
        }
        Log.d(TAG, "onCreate: dipanggil")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: dipanggil")

    }
}