package com.example.starter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openTel(view: View) {
        val phoneNumber = "9469084068"
        // Create the intent with the ACTION_DIAL action and the phone number URI
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }

    fun openSocial(view: View) {
        val url = "https://www.linkedin.com/in/abhinandantrilokia/"
        // Create the intent with the ACTION_VIEW action and the URL URI
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun openMail(view: View) {
        // Email address
        val emailAddress = "hi@imtrilokia.dev"
        // Create the intent with the ACTION_SENDTO action and the mailto URI
        val uri = Uri.parse("mailto:$emailAddress")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)
    }
}