package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sur4Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sur4)
        showBtnBack()
        setHeaderTitle("4 Minipots de glace - Macadamia Nut Brittle - Häagen-Dazs - 100g x 4")
    }
}