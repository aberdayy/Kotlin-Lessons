package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

            // DEGISKENLER
            var sayi1 = 33
            var sayi2 = 2.5
            var sayi3 = 60
            sayi3 = 10

            println(sayi1)
            println(sayi2)
            println(sayi1*sayi2)
            println(sayi1+sayi2)
            println(sayi1-sayi2)
            println(sayi1/sayi2)
            println(sayi3)
            println("---------------DEGISKENLER---------------")

            //SABITLER

            val sayi4 = 33
            val sayi5 = 2.5
            val sayi6 = 60
            // sayi4 = 10 bu islem yapilamaz error verir SABITLERDE DEGER TEKRAR ATANAMAZ.

            println(sayi4)
            println(sayi5)
            println(sayi4*sayi5)
            println(sayi4+sayi5)
            println(sayi4-sayi5)
            println(sayi4/sayi5)
            println(sayi6)
            println("---------------SABITLER---------------")

            // VERI TIPLERI
            val benimString : String
            val benimBoolean : Boolean
            val benimLong : Long
            // Baslatma degerini atama (Initilazing - Initilization)
            val benimIntegerim : Int
            benimIntegerim = 5

            val metin1 = "Benim yeni metnim"
            println(metin1)
            println(metin1.length)
            val isim = "ataberk"
            val soyisim = "Erday"
            val tamIsim = isim + soyisim
            val tamIsim2 = isim + " " + soyisim

            println(tamIsim)
            println(tamIsim2)
            println("---------------VERI TIPLERI---------------")

            // VERI TIPI DONUSUMU
            var benimInt = 10
            var benimIntYeni = benimInt.toDouble()
            println(benimIntYeni)
            println("---------------VERI TIPLERI DONUSUMU---------------")

            //KOLEKSIYONLAR

                //Array
            val isimler = arrayOf("ataberk","mert","onur","cuneyt")
            println(isimler[0])
            println(isimler.get(1))

            isimler[0] = "ATATURK"
            println(isimler[0])
            println("---------------Array---------------")

            var stringIsimListesi = arrayListOf<String>("ataberk","mert","onur","cuneyt")
            var isimListesi = arrayListOf("ataberk","mert","onur","cuneyt")
            stringIsimListesi.add("ATATURK")
            stringIsimListesi.add(4,"MUSTAFA KEMAL")
            isimListesi.add("ATATURK")
            isimListesi.remove("ataberk")

            println(stringIsimListesi)
            println(isimListesi)
            println(stringIsimListesi[1])
            println(isimListesi[2])

            println("---------------Array List---------------")

            //set sadece unique degerleri kapsar duplicate olan degeri gostermez

           val ornekDizi = arrayOf(7,8,9,9,9,8,10)
            println("index 2 = ${ornekDizi[2]}" )
            println("index 3 = ${ornekDizi[3]}" )
            println(ornekDizi.size)

            val mySet = setOf(7,8,9,9,9,8,10)
            println(mySet.size)

            mySet.forEach(){
                    println(it)
            }
            val digerSet = HashSet<String>()
            digerSet.add("Ata")
            digerSet.add("Ata")
            digerSet.add("Ata")
            digerSet.add("Ata")
            digerSet.add("berk")
            digerSet.forEach(){
                    println(it)
            }

            println("---------------Set---------------")

            // Key ve Value degerlidir
            val yemekDizisi = arrayOf("elma","tavuk","armut")
            val kaloriDizisi = arrayOf(100,200,300)
            println("${yemekDizisi[0]}'nin kalorisi : ${kaloriDizisi[0]}" + " " + "${yemekDizisi[1]}'un kalorisi : ${kaloriDizisi[1]}")

            val foodAndCalories = hashMapOf<String, Int>()
        foodAndCalories.put("karpuz",200)
        foodAndCalories.put("et",500)
        foodAndCalories.put("tavuk",250)
        foodAndCalories.put("elma",400)
        println(foodAndCalories.get("et"))

        println("---------------Map/Dictionary---------------")

        println("---------------KOLEKSIYONLAR---------------")

        var sayi = 1
        println(sayi)
        sayi++
        sayi--
        println("---------------Matematiksel Islemler---------------")

        val skor = 21

        if (skor <10){
            println("Game over")
        }else if (skor >=10 && skor < 20){
            println("skor 10 ile 20 arasinda")
        }else{
            println("Mukkemel bir skor")
        }

        println("---------------If Else Bloklari---------------")

        var notRakami = 4
        var notString = ""

        when(notRakami){
            0 -> notString = "Gecersiz"
            1 -> notString = "Gecersiz"
            2 -> notString = "Kotu"
            3 -> notString = "Orta"
            4 -> notString = "iyi"
            else -> notString = "Mukemmel"
        }
        println(notString)


        /*
        if (notRakami == 0){
            notString = "gecersiz Not"
        }else if (notRakami == 1){
            notString = "gecersiz Not"
        }else if (notRakami == 2){
            notString = "gecersiz Not"
        }else if (notRakami == 3){
            notString = "Orta"
        }else if (notRakami == 4){
            notString = "iyi"
        }else{
            notString = "Mukemmel"
        }
        */
        println("---------------When / Switch---------------")

       val numaraDizisi = arrayOf(5,10,15)
        var sonuc = 0
        for (num in numaraDizisi){
            sonuc += num
        }
        println(sonuc)

        for (indeks in numaraDizisi.indices){
            println( numaraDizisi[indeks])
        }
        for(b in 0..12){
            println(b)
        }
        numaraDizisi.forEach {
            println(it)
        }

        println("---------------for dongusu---------------")

        var ix = 0

        while (ix<=5){
           println(ix)
            ix +=1

        }



        println("---------------While dongusu---------------")




    }
}