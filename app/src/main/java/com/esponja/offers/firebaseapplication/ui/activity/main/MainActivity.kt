package com.esponja.offers.firebaseapplication.ui.activity.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.esponja.offers.firebaseapplication.R
import com.esponja.offers.firebaseapplication.ui.activity.register.RegisterActivity
import com.esponja.offers.firebaseapplication.ui.activity.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.loginBtn
import kotlinx.android.synthetic.main.activity_main.registerBtn

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    fun initialize() {
        registerBtn.setOnClickListener {
            startActivity(RegisterActivity.getIntent(this))
        }

        loginBtn.setOnClickListener {
            startActivity(LoginActivity.getIntent(this))
        }
    }
}
