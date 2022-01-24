package com.example.kiosk

import java.lang.NumberFormatException
import kotlin.system.exitProcess
import com.example.kiosk.Pay as Pay
import com.example.kiosk.Setting as Setting
import com.example.kiosk.Basket as Basket
import com.example.kiosk.Menu as Menu



//플로우 메뉴 카테고리 장바구니 영수증

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





    fun orderFlow() {
        startOrder()
        basket.setCategory()
        basket.setBeverage()
        basket.setTopping()
    }
}


//카테고리 선정까지 완료
// 위 함수들 Basket으로 옮길것

fun main() {
    var flow = Flow()
    flow.orderFlow()
}
