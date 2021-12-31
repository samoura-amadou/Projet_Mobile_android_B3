package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class fro3Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fro3)
        showBtnBack()
        setHeaderTitle("Kiri Goûter - Bel - 175 g (5 * 35 g)")
    }
}