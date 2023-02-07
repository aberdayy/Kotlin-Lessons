package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a  = 2
        if(a==0){
            denemeFonksiyonu()
        }else{
            denemeFonksiyonu2()
        }
        hesaplaButon.setOnClickListener {
            val toplamaSonucu = toplamaIslemi(10,50)
            textView.text = "Sonuc : ${toplamaSonucu}"
        }


        cikarmaIslemi(5,1)
        var sonuc = toplamaIslemi(10,20)
        textView.text = "Sonuc : ${sonuc}"
    }

    fun denemeFonksiyonu(){
        println("ilk fonksiyon calisti")
    }
    fun denemeFonksiyonu2(){
        println("ikinci fonksiyon calisti")
    }
//Parametre almak
    fun cikarmaIslemi(x:Int, y:Int){
        var sonuc = x-y
        textView.text = "Sonuc: ${x-y}"
    }

//Return value
fun toplamaIslemi(x:Int, y:Int):Int{
    var sonuc = x+y
    return sonuc
}

    //Buton ile deger hesaplama




    /*
    fun hesaplaOnClick(view : View){
        val toplamaSonucu = toplamaIslemi(10,50)
        textView.text = "Sonuc : ${toplamaSonucu }"
    }

    //Onclick kismina fonksiyon isminin eklenmesi gerekir.
    */




}