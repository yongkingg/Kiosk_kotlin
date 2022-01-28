package com.example.kiosk

import java.lang.NumberFormatException
//import com.example.kiosk.Pay as Pay
import com.example.kiosk.Basket as Basket
import com.example.kiosk.Menu as Menu

class Flow {
    // 이렇게 할바에 Basket 클래스와 Pay 클래스에서 각각 Menu를 객체로 선언받는것이 맞다.
    var menu = Menu()
    var basket = Basket(menu)
    var pay = Pay(basket)
    var startOrder: Int? = 0

    init {
    }

    fun startOrder() {
        println("이디야 커피에 오신 것을 환영합니다.")
        println("주문하시겠습니까?\n주문하시려면 1.번을 눌러주세요")
        while (true) {
            try {
                startOrder = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                startOrder = 0
            } finally {
                if (startOrder == 1) {
                    break
                } else {
                    println("다시 입력해 주세요")
                }
            }
        }

    }

    fun orderFlow() {
        startOrder()
        while (true) {
            basket.showCategory()
            basket.showBeverage()
            basket.toppingLogic()
            basket.checkOrder()
            if (basket.isOrderChange == 2){
                break
            }
        }
//        var pay = Pay(basket)
        pay.payLogic()

    }
}

fun main() {
    var flow = Flow()
    flow.orderFlow()
}
