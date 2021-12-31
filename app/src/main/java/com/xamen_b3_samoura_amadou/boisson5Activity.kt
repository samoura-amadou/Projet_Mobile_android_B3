package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class boisson5Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boisson5)
        showBtnBack()
        setHeaderTitle("Eau de source finement Pétillante - Carola - 1.25l")
    }
}