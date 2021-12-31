package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class fro2Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fro2)
        showBtnBack()
        setHeaderTitle("Fromage pour tartiflette - Les Croisés - 500 g")
    }
}