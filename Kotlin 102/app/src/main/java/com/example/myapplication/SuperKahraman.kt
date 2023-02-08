package com.example.myapplication

class SuperKahraman(var isim:String, var yas : Int, var meslek: String) {
    //primary constructor

    private var sacininRengi = "sari"
    /*
    //property
    var _isim = ""
    var _yas = 0
    var _meslek = ""

    //constructor
    constructor(isimString, yas : Int, meslek : String){

        this._meslek = meslek
        this._yas = yas
        this._isim = isim
        println("Constructor cagirildi")

    }
     */
    fun testFonksiyonu(){
        println("test fonksiyonu cagirildi")
    }
    //getter
    fun sacRenginiAl():String{
        return this.sacininRengi
    }
    //setter
    fun sacRenginiDegistir(renk :String):String{
        this.sacininRengi = renk
        return renk
    }
    //Acces levels
        //private (sadece yazilan class veya fonksiyon icerisinden erisilebilir)
        //protected (yazilan dosya icerisinde kullanilabilir)
        //internal (sadece kendi modulumuz icerisinden erisebiliriz)
        //public (heryerden ulasilir)

}