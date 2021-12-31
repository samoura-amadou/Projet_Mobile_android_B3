package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class SaucesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sauces)
        showBtnBack()
        setHeaderTitle("Sauces")

        val sau1: Button =findViewById(R.id.sau1)
        val sau2: Button =findViewById(R.id.sau2)
        val sau3: Button =findViewById(R.id.sau3)
        val sau4: Button =findViewById(R.id.sau4)
        val sau5: Button =findViewById(R.id.sau5)


        sau1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sau1Activity::class.java)
            startActivity(newIntent)
        })
        sau2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sau2Activity::class.java)
            startActivity(newIntent)
        })
        sau3.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sau3Activity::class.java)
            startActivity(newIntent)
        })
        sau4.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sau4Activity::class.java)
            startActivity(newIntent)
        })
        sau5.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,sau5Activity::class.java)
            startActivity(newIntent)
        })






    }
}