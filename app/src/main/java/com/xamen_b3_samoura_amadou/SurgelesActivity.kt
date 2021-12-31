package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SurgelesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surgeles)
        showBtnBack()
        setHeaderTitle("Surgeles")

        val sur1: Button =findViewById(R.id.sur1)
        val sur2: Button =findViewById(R.id.sur2)
        val sur3: Button =findViewById(R.id.sur3)
        val sur4: Button =findViewById(R.id.sur4)
        val sur5: Button =findViewById(R.id.sur5)

        sur1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sur1Activity::class.java)
            startActivity(newIntent)
        })

        sur2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sur2Activity::class.java)
            startActivity(newIntent)
        })

        sur3.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sur3Activity::class.java)
            startActivity(newIntent)
        })

        sur4.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sur4Activity::class.java)
            startActivity(newIntent)
        })

        sur5.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sur5Activity::class.java)
            startActivity(newIntent)
        })

    }
}