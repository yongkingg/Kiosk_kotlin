package com.example.kiosk

class Menu {
    var category = arrayOf<String>("Beverage","Coffee","Tea","IceFlake","RTD")

    var beverage = mutableListOf<String>("카라멜 프로틴 밀크", "바닐라 프로틴 밀크", "사과리치 콜라겐 워터", "쌍화차", "생강차", "달고나 라떼","흑당 라떼","버블 흑당 라떼","버블 크림 밀크티")
    var beverageCost = mutableListOf<Int>(3800,3800,4800,3900,3900,3500,4300,4300,4300)

    var coffee = mutableListOf<String>("아인슈페너","콜드브루 라떼", "콜드브루 화이트비엔나","콜드브루 아메리카노","콜드브루 니트로", "흑당 콜드브루")
    var coffeeCost = mutableListOf<Int>(3700,4200,4500,3700,3900,3700)

    var tea = mutableListOf<String>("포스틱 밀크 쉐이크", "오리진 쉐이크", "초코 쿠키쉐이크", "딸기 쉐이크", "레몬 에이드","자몽 에이드")
    var teaCost = mutableListOf<Int>(4800,4300,4500,4700,3800,3800)

    var iceFlake = mutableListOf<String>("팥인절미 1인빙수","망고요거트 1인빙수","망고샤베트 빙수","딸기 치즈빙수", "인절미 치즈빙수")
    var iceFlakeCost = mutableListOf<Int>(5400,5400,10800,10800,10800)

    var rtd = mutableListOf<String>("이디야 청포도&케일 주스","이디야 감귤&한라봉 주스","이디야 사과&당근 주스","이디야 콤부차 복숭아망고","이디야 콤부차 청포도레몬")
    var rtdCost = mutableListOf<Int>(3400,3400,3400,3400,3400)

    var topping = mutableListOf<String>("에스프레소 샷","휘핑크림", "초콜릿칩", "타피오카 펄","시럽","토핑(카라멜,초콜릿)")
    var toppingCost = mutableListOf<Int>(500,500,500,1000,500,300)

    var categoryList = listOf(beverage,coffee,tea,iceFlake,rtd)
    var costList = listOf(beverageCost,coffeeCost,teaCost,iceFlakeCost,rtdCost)

    init {
    }
}
