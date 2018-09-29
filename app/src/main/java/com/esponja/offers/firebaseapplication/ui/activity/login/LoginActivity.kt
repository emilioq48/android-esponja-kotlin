package com.esponja.offers.firebaseapplication.ui.activity.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.esponja.offers.firebaseapplication.R

class LoginActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, LoginActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
