package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = 1

        println("OnCreate Cagirildi")
    }

    override fun onStart() {
        super.onStart()
        println("onStart Cagirildi")

    }

    override fun onResume() {
        super.onResume()
        println("onResume Cagirildi")

    }

    override fun onPause() {
        super.onPause()
        println("onPause Cagirildi")

    }

    override fun onStop() {
        super.onStop()
        println("onStop Cagirildi")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Cagirildi")

    }

    fun aktiviteDegistir(view : View){
        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext,ikinciAktivity::class.java) // bu sinifa git anlamina gelen kod blogudur.
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}