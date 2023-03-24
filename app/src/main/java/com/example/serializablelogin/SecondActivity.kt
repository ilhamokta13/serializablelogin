package com.example.serializablelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SecondActivity : AppCompatActivity() {
    lateinit var txtNama : TextView
    lateinit var txtEmail : TextView
    lateinit var txtPhone : TextView
    lateinit var txtAddress : TextView
    lateinit var txtAge : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtNama = findViewById(R.id.txtNama)
        txtEmail = findViewById(R.id.txtEmail)
        txtPhone = findViewById(R.id.txtPhone)
        txtAddress = findViewById(R.id.txtAddress)
        txtAge = findViewById(R.id.txtAge)

        val data = intent.getSerializableExtra("data", ) as DataModel
        txtNama.text= "Name: ${data.name}"
        txtEmail.text = "Email: ${data.email}"
        txtPhone.text = "Phone: ${data.phone}"
        txtAddress.text = "Address: ${data.address}"
        txtAge.text =  "Age: ${data.age}"


    }
}