package com.example.kiosk

import java.lang.NumberFormatException
import java.text.NumberFormat
import kotlin.system.exitProcess
import com.example.kiosk.Pay as Pay
import com.example.kiosk.Setting as Setting
import com.example.kiosk.Basket as Basket
import com.example.kiosk.Menu as Menu

class Flow {
    var pay = Pay()
    var menu = Menu()
    var basket = Basket(menu)
    var setting = Setting()
    var startOrder: Int? = 0

    init {
    }

    fun startOrder() {
        println("이디야 커피에 오신 것을 환영합니다.")
        println("주문하시겠습니까?\n주문하시려면 1.번을 눌러주세요")
        while (true) {
            try {
                startOrder = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (startOrder == 1) {
                    break
                } else {
                    println("다시 입력해 주세요")
                }
            }
        }
    }

    fun nullException(a: Int?) {
        var a = a
        try {
            a = readLine()?.toInt()
        } catch (e: NumberFormatException){
            null
        } finally {

        }
    }

    fun orderFlow() {
        startOrder()
        while (true) {
            basket.categoryLogic()
            basket.beverageLogic()
            basket.toppingLogic()
            if (basket.orderCount == 2){
                break
            }
        }
        pay.payLogic()

    }
}

fun main() {
    var flow = Flow()
    flow.orderFlow()
}
