package com.example.kotlin108

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toast , alert

        //applicationContext => app context
        //this, this@MainActivity -> aktivitenin contexti

        Toast.makeText(applicationContext, "Hosgeldin sevgili yoldas!",Toast.LENGTH_SHORT).show()
    }
    fun mesajGoster(view: View){
        val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("Uyari mesaji basligi")
        uyariMesaji.setMessage("Lutfen sifre girin. Tekrar denemek icin butona basin")

        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this, "Bastan deniyorsunuz",Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Hayir",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this,"Hayiri sectiniz",Toast.LENGTH_SHORT).show()
        })
        uyariMesaji.show()
    }
}