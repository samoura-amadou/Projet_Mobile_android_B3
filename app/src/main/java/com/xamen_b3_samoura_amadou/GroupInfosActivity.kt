package com.xamen_b3_samoura_amadou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class GroupInfosActivity :BaseActivity() {

    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)
        val buttonEtudiant1: Button =findViewById(R.id.buttonEtudiant1)
        val buttonEtudiant2: Button =findViewById(R.id.buttonEtudiant2)

        showBtnBack()
        setHeaderTitle("Infos")

        buttonEtudiant1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,Etudiant1Activity::class.java)
            startActivity(newIntent)
        })

        buttonEtudiant2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,Etudiant2Activity::class.java)
            startActivity(newIntent)
        })

    }
}