package com.example.kiosk

import java.lang.NumberFormatException

class Basket(menu:Menu) {
    var menu = menu
    var categoryNum: Int? = 0
    var beverageOrder: Int? = 0
    var toppingOrder: Int? = 0
    var isOrder: Int? = 0
    var orderCount: Int? = 0

    var basket = mutableListOf<Any>()

    init{
    }

    fun showCategory() {
        println("주문하시려는 음료의 카테고리를 설정해주세요")
        for (index in 0 until menu.category.count()) {
            print("${index + 1}. " + menu.category[index])
            print(" ")
        }
        println()
    }

    fun setCategory() {
        while (true) {
            try {
                categoryNum = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (categoryNum!! > 0 && categoryNum!! <= menu.category.count()) {
                    println("$categoryNum. " + menu.category[categoryNum!!-1] +"가 선택되었습니다")
                    break
                } else {
                    println("다시 입력해 주세요")
                }
            }
        }
    }

    fun showBeverage() {
        println("다음은 ${menu.category[categoryNum!!-1]} 음료 목룍입니다")
        for (i in 0 until menu.categoryList[categoryNum!!-1].size - 1) {
            println("${i+1}. " + menu.categoryList[categoryNum!! - 1].get(i))
        }
        println("무엇을 주문하시겠습니까?")
    }

    fun setBeverage() {
        while (true) {
            try {
                beverageOrder = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (beverageOrder!! >= menu.categoryList[categoryNum!! - 1].size) {
                    println("다시 입력해 주세요")
                } else if (beverageOrder == 0) {
                    println("다시 입력해 주세요")
                } else {
                    println("장바구니에 " + menu.categoryList[categoryNum!! - 1][beverageOrder!! - 1] + " 가 담겼습니다.")
                    break
                }
            }
        }
    }

    fun isTopping(){
        while (true) {
            println("토핑을 추가하려면 1.을, 아니면 2.를 눌러주세요.")

            try {
                isOrder = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (isOrder == 1) {
                    println("어떤 토핑을 추가하시겠습니까 ? ")
                    break
                } else if (isOrder == 2) {
                    println("토핑을 추가하지 않습니다.")
                    break
                } else {
                    println("다시 입력해 주세요.")
                }
            }
        }
    }

    fun showTopping() {
        for (index in 0 until menu.topping.count()) {
            println("${index + 1}. " + menu.topping[index])
        }
    }

    fun setTopping() {
        while (true) {
            try {
                toppingOrder = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (toppingOrder == 0 || toppingOrder!! > menu.topping.count()){
                    println("다시 입력해 주세요")
                } else{
                    println("${menu.categoryList[categoryNum!! - 1][beverageOrder!! - 1]}에 ${menu.topping[toppingOrder!!-1]}이 담겼습니다. ")
                    basket.add(mutableListOf(menu.categoryList[categoryNum!! - 1][beverageOrder!! - 1],menu.costList[categoryNum!! - 1][beverageOrder!! - 1],menu.topping[toppingOrder!!-1],menu.toppingCost[toppingOrder!!-1]))
                    break
                }
            }
        }
    }

    fun categoryLogic() {
        showCategory()
        setCategory()
    }

    fun beverageLogic(){
        showBeverage()
        setBeverage()
    }

    fun toppingLogic(){
        isTopping()

        if (isOrder == 1){
            showTopping()
            setTopping()
        } else {
            basket.add(mutableListOf(menu.categoryList[categoryNum!! - 1][beverageOrder!! - 1],menu.costList[categoryNum!! - 1][beverageOrder!! - 1]))
        }

        println("음료를 추가로 주문하려면 1.을, 결제화면으로 이동하려면 2.를 눌러주세요")

        try {
            orderCount = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            null
        } finally {
            if (orderCount == 1) {
                println("음료를 추가로 주문합니다.")
            } else if (orderCount == 2) {
                println("결제화면으로 이동합니다.")
            } else {
                println("다시 입력해 주세요")
            }
        }
    }

}