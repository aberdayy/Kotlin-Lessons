package com.example.kullaniciadisaklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Create object
    //lateinit objenin tanimlanmasini ancak degerinin sonradan atanmasini belirlerken ise yarar
    lateinit var sharedPreferences : SharedPreferences
    var alinanKullaniciAdi:String? = null
    val PREFS_FILE = "com.example.kullaniciadisaklama"
    val KEY_NAME = "kullanici"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedPreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE)

        alinanKullaniciAdi = sharedPreferences.getString(KEY_NAME,"empty")

        if (alinanKullaniciAdi != null){
            textView.text = "Kaydedilen kullanici adi: ${alinanKullaniciAdi}"
        }
    }
    fun kaydet(view: View){
        val kullaniciAdi = editText.text.toString()
        val editor = sharedPreferences.edit()

        if(kullaniciAdi.isEmpty()){
            Toast.makeText(this,"Lutfen bir deger giriniz!", Toast.LENGTH_LONG).show()
        }else{
            editor.putString(KEY_NAME,kullaniciAdi)
            editor.apply()
            textView.text = "Kaydedilen Kullanici Adi : " + kullaniciAdi

        }


    }
    fun sil(view: View){

    }
}