package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class boisson3Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boisson3)
        showBtnBack()
        setHeaderTitle("Coca-Cola - 4 * 250 ml")
    }
}