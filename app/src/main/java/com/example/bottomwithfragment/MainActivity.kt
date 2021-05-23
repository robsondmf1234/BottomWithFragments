package com.example.bottomwithfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


 //       viewPager =

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.icon_home -> {
                    Toast.makeText(this, "Botao Home clicado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.icon_favorite -> {
                    Toast.makeText(this, "Botao Favorite clicado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.icon_search -> {
                    Toast.makeText(this, "Botao Seacrh clicado", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}