package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.io.InputStream

class CategoriesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val buttonBoisson:Button =findViewById(R.id.Boisson)
        val buttonFromage:Button =findViewById(R.id.Fromage)
        val buttonSurgele:Button =findViewById(R.id.Surgele)
        val buttonSauce:Button =findViewById(R.id.Sauce)


        showBtnBack()
        setHeaderTitle("Rayons")

        buttonBoisson.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,ProductsListActivity::class.java)
            startActivity(newIntent)
        })

        
        buttonFromage.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,FromagesActivity::class.java)
            startActivity(newIntent)
        })

        buttonSurgele.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,SurgelesActivity::class.java)
            startActivity(newIntent)
        })


        buttonSauce.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,SaucesActivity::class.java)
            startActivity(newIntent)
        })


    }

}