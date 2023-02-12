package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivity.*
import kotlinx.android.synthetic.main.activity_main.*

class ikinciAktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivity)

        val veriAl = intent

        val alinanveri = veriAl.getStringExtra("yollananVeri")
        textView2.text = alinanveri
    }

    fun geriDon(view : View){
        val intent = Intent(applicationContext,MainActivity::class.java) // bu sinifa git anlamina gelen kod blogudur.
        startActivity(intent)
        finish()
    }

}