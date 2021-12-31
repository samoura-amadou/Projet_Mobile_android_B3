package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sau3Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sau3)
        showBtnBack()
        setHeaderTitle("Passata di pomodoro - Giaguaro - 500 g")
    }
}