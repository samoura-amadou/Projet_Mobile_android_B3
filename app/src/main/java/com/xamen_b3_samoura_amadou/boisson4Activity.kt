package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class boisson4Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boisson4)
        showBtnBack()
        setHeaderTitle("Eau fruitée saveur citron vert - U - 1,5 l")
    }
}