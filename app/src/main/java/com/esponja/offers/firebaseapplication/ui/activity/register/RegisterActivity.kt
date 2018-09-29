package com.esponja.offers.firebaseapplication.ui.activity.register

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.esponja.offers.firebaseapplication.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.btnRegister
import kotlinx.android.synthetic.main.activity_register.editEmail
import kotlinx.android.synthetic.main.activity_register.editPasswprd

class RegisterActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, RegisterActivity::class.java)
    }

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()
        btnRegister.setOnClickListener {
            createUser()
        }
    }

    private fun createUser() {
        if (editEmail.text.isNullOrEmpty() || editPasswprd.text.isNullOrEmpty()) {
            Toast.makeText(this, "Meté algo contenado", Toast.LENGTH_SHORT).show()
            return
        }
        val email = editEmail.text.toString()
        val pwd = editPasswprd.text.toString()

        auth.createUserWithEmailAndPassword(email, pwd)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "USER CREADO ATR", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "USER YA EXISTE, NO SE CREÓ", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
