package com.example.encenderled

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database1 = Firebase.database.reference





        led1.setOnCheckedChangeListener { _, isChecked ->


            if (led1.isChecked) {


                database1.child("Led1").setValue(true)


            } else {


                database1.child("Led1").setValue(false)

            }


        }
        led2.setOnCheckedChangeListener { _, isChecked ->
            if (led2.isChecked) {


                database1.child("Led2").setValue(true)


            } else {


                database1.child("Led2").setValue(false)

            }
        }
    }



}