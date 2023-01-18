package com.mikekrysan.module24_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snackbar = Snackbar.make(main_layout, "Snackbar", Snackbar.LENGTH_SHORT )
        snackbar.setAction("Action") {
            Toast.makeText(this, "Toast!", Toast.LENGTH_SHORT).show()
        }
        snackbar.setActionTextColor(ContextCompat.getColor(this, com.google.android.material.R.color.design_default_color_error))

        button_get_snack.setOnClickListener {
            snackbar.show()
        }
    }
}