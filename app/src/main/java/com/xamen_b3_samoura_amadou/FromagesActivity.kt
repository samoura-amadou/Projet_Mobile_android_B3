package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FromagesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fromages)
        showBtnBack()
        setHeaderTitle("Fromages")

        val fro1: Button =findViewById(R.id.fro1)
        val fro2: Button =findViewById(R.id.fro2)
        val fro3: Button =findViewById(R.id.fro3)
        val fro4: Button =findViewById(R.id.fro4)
        val fro5: Button =findViewById(R.id.fro5)

            fro1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,fro1Activity::class.java)
            startActivity(newIntent)
        })

        fro2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,fro2Activity::class.java)
            startActivity(newIntent)
        })
        fro3.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,fro3Activity::class.java)
            startActivity(newIntent)
        })
        fro4.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,fro4Activity::class.java)
            startActivity(newIntent)
        })
        fro5.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,fro5Activity::class.java)
            startActivity(newIntent)
        })
    }
}