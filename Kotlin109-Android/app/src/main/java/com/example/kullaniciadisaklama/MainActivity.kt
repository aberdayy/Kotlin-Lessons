package com.example.kullaniciadisaklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.datastore.preferences.core.Preferences
import kotlinx.android.synthetic.main.activity_main.*

var alinanKullaniciAdi:String? = null
val KEY_NAME = "kullanici"

class MainActivity : AppCompatActivity() {
    //Create object
    //lateinit objenin tanimlanmasini ancak degerinin sonradan atanmasini belirlerken ise yarar
    //lateinit var sharedPreferences : SharedPreferences
    // sharedPreferences artik kullanilmadigi icin DatStore kullaniyoruz.
    //var sharedPreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE)
    //getPreferences => tek bir dosya ile calisir deafult calisir bu sebeple dosya adi verilmesi gerekmez
    lateinit var sharedPref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPref = applicationContext.getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
        alinanKullaniciAdi = sharedPref.getString(KEY_NAME,null)

        if (alinanKullaniciAdi != null){
            textView.text = "Kaydedilen kullanici adi: ${alinanKullaniciAdi}"
        }
    }
    fun kaydet(view: View){

        val kullaniciAdi = editText.text.toString()
        val editor = sharedPref.edit()

        if(kullaniciAdi.isEmpty()){
            Toast.makeText(this,"Lutfen bir deger giriniz!", Toast.LENGTH_LONG).show()
        }else{
            editor.putString(KEY_NAME,kullaniciAdi)
            editor.apply()
            textView.text = "Kaydedilen Kullanici Adi : " + kullaniciAdi

        }
    }

    fun sil(view: View){

        val editor = sharedPref.edit()
        alinanKullaniciAdi = sharedPref.getString(KEY_NAME,null)

        if (alinanKullaniciAdi == null){
            Toast.makeText(this,"Silinecek bir deger bulunamadi!", Toast.LENGTH_LONG).show()
        }else{
            textView.text = "Kaydedilen Kullanici Adi : "
            editor.remove(KEY_NAME)
            editor.apply()
        }



    }
}