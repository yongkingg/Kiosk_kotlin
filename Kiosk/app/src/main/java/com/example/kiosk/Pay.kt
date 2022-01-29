package com.example.kiosk
import java.lang.NumberFormatException

class Pay(basket: Basket) {
    var basket = basket
    var isTakeOut: Any? = 0
    var isReceipt: Int? = 0
    var inputCard: Int? = 0
    var total: Int = 0

    init {
    }

    fun setTakeout() {
        println("포장하시려면 1.을, 매장에서 드시려면 2.를 눌러주세요")
        while (true){
            try {
                isTakeOut = readLine()!!.toInt()
            } catch (e: NumberFormatException){
                null
            } finally {
                if (isTakeOut!! == 1){
                    isTakeOut = "포장"
                    println("포장 선택.")
                    break
                } else if (isTakeOut == 2) {
                    isTakeOut = "매장"
                    println("매장 식사 선택.")
                    break
                } else {
                    println("다시 입력해 주세요.")
                }
            }
        }
    }

    fun setCard() {
        println("카드를 넣고 1.을 눌러주세요.")
        while (true) {
            try{
                inputCard = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (inputCard == 1){
                    println("카드 인식에 성공했습니다. \n상품을 결제합니다.")
                    break
                } else {
                    println("카드를 넣고 1.을 눌러주세요")
                }
            }
        }
    }

    fun isReceipt() {
        println("영수증을 출력하시려면 1.을 영수증을 출력하지 않으려면 2.를 눌러주세요")
        while (true) {
            try{
                isReceipt = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (isReceipt == 1) {
                    println("영수증을 출력합니다.")
                    showReceipt()
                    break
                } else if (isReceipt == 2) {
                    println("영수증을 출력하지 않습니다.")
                    println("이용해주셔서 감사합니다.")
                    break
                } else {
                    println("다시 입력해 주세요.")
                }
            }
        }
    }

    fun calculate() {
        for (beverage in 0 until basket.basketCost.count()) {
            for (index in 0 until basket.basketCost[beverage].count()) {
                total += basket.basketCost[beverage][index].toString().toInt()
            }
        }
        println("=============================")
        println("                 총액 = ${total}\n ")
    }

    fun showReceipt () {
        println("============[영수증]============")
        println("= 음료 수령 방식 => $isTakeOut")
        println("= 결제 방식     => 카드결제\n")
        println("           주문 목록")
        println("==============================")
        for (beverage in 0 until basket.basket.count()) {
            if (basket.basket[beverage].count() == 1)  {
                print("${basket.basket[beverage][0]}")
            } else {
                for (topping in 0 until basket.basket[beverage].count()) {
                    print("${basket.basket[beverage][topping]}")
                    print(" ")
                }
            }
            println("")
        }
        calculate()
        println("이용해주셔서 감사합니다.")
    }

    fun payLogic(){
        setTakeout()
        setCard()
        isReceipt()
    }
}

