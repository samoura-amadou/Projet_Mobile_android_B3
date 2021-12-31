package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ProductsListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)
        showBtnBack()
        setHeaderTitle("Boissons")

        val buttonboisson1: Button =findViewById(R.id.buttonboisson1)
        val buttonboisson2: Button =findViewById(R.id.buttonboisson2)
        val buttonboisson3: Button =findViewById(R.id.buttonboisson3)
        val buttonboisson4: Button =findViewById(R.id.buttonboisson4)
        val buttonboisson5: Button =findViewById(R.id.buttonboisson5)

        buttonboisson1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,boison1Activity::class.java)
            startActivity(newIntent)
        })
        buttonboisson2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,boisson2Activity::class.java)
            startActivity(newIntent)
        })
        buttonboisson3.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,boisson3Activity::class.java)
            startActivity(newIntent)
        })
        buttonboisson4.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,boisson4Activity::class.java)
            startActivity(newIntent)
        })
        buttonboisson5.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,boisson5Activity::class.java)
            startActivity(newIntent)
        })
    }
}