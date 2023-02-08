package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var sayi1 :Int?=null
        //var sayi2 :Int?=null

    }
    fun topla(view:View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            textView.text ="Please enter a number"
        }else{
            textView.text = "Sonuc = ${sayi1 + sayi2}"
        }
    }
    fun cikar(view:View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            textView.text ="Please enter a number"
        }else{
            textView.text = "Sonuc = ${sayi1 - sayi2}"
        }
    }
    fun bolme(view:View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            textView.text ="Please enter a number"
        }else{
            if (sayi1 == 0.0 || sayi2 == 0.0) {
                textView.text ="Can not divide to zero"
            }else {
                textView.text = "Sonuc = ${sayi1 / sayi2}"
            }
        }
    }
    fun carpma(view:View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            textView.text ="Please enter a number"
        }else{
            textView.text = "Sonuc = ${sayi1 * sayi2}"
        }
    }
}