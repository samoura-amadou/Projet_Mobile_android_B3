package com.xamen_b3_samoura_amadou

import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.squareup.picasso.Picasso.*

class DetailActivity : BaseActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        showBtnBack()
       intent.getStringExtra("title")?.let { setHeaderTitle(it) }
        val textViewInfosEtudiant1=findViewById<TextView>(R.id.buttonEtudiant1)
        val textViewInfosEtudiant2=findViewById<TextView>(R.id.buttonEtudiant1)
        val textViewadresseEtudiant1=findViewById<TextView>(R.id.buttonEtudiant1)
        val textViewGroupEtudiant1=findViewById<TextView>(R.id.buttonEtudiant1)
        val text_Open_Epsi=findViewById<TextView>(R.id.buttonEtudiant1)

    }
}