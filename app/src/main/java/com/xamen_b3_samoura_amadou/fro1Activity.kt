package com.xamen_b3_samoura_amadou

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class fro1Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fro1)
        showBtnBack()
        setHeaderTitle("Fromage gourmand au chèvre 25% Mat. Gr. - Les Croisés - 145 g")
    }
}