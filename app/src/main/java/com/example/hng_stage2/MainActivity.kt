package com.example.hng_stage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /* var username = username.text.toString()
        var fullname = name.text.toString()
        var email = email.text.toString()
        var country = country.text.toString()
*/
        button.setOnClickListener {
            var username = username.text.toString()
            var fullname = name.text.toString()
            var email = email.text.toString()
            var country = country.text.toString()
            textBox.text = " Username: ${username} \n Fullname: ${fullname} \n Email: ${email}  \n Country: ${country}"
        }
    }
}