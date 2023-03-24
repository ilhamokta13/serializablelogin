package com.example.serializablelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var namaEditText: EditText
    lateinit var emailEditText: EditText
    lateinit var phoneEditText: EditText
    lateinit var addressEditText: EditText
    lateinit var ageEditText: EditText
    lateinit var btn_Save: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEditText = findViewById(R.id.namaEditText)
        emailEditText = findViewById(R.id.emailEditText)
        phoneEditText = findViewById(R.id.phoneEditText)
        addressEditText = findViewById(R.id.addressEditText)
        ageEditText = findViewById(R.id.ageEditText)
        btn_Save = findViewById(R.id.btn_Save)

        btn_Save.setOnClickListener {
            val name = namaEditText.editableText.toString()
            val email = emailEditText.editableText.toString()
            val phone = phoneEditText.editableText.toString()
            val address = addressEditText.editableText.toString()
            val age = ageEditText.editableText.toString().toInt()

            val data = DataModel(name, email, phone, address, age)
            val move = Intent(this, SecondActivity::class.java)
            move.putExtra("data", data)
            startActivity(move)
        }

    }
}
