package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sau5Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sau5)
        showBtnBack()
        setHeaderTitle("Coulis de Myrtille sauvage - La Ferme d'Edmée")
    }
}