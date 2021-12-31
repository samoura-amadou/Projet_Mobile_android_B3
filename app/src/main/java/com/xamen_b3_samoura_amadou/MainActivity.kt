package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonZone1:Button=findViewById(R.id.buttonZone1)
        val buttonZone2:Button=findViewById(R.id.buttonZone2)


        buttonZone1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,GroupInfosActivity::class.java)
            startActivity(newIntent)
        })

        buttonZone2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,CategoriesActivity::class.java)
            startActivity(newIntent)
        })


    }
}