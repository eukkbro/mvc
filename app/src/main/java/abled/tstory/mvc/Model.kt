package abled.tstory.mvc

class Model {

    private val americanoPrice = 1900
    var total:Int = 0

    fun add(){
        total++
    }

    fun subtract(){
        total--
    }

    fun getTotalPrice() : Int{
        return total*americanoPrice
    }

}