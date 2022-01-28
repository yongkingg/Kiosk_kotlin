package com.example.kiosk

class Menu {
    var category = arrayOf<String>("Beverage","Coffee","Tea","IceFlake","RTD")

//    var beverage = mutableListOf<String>("카라멜 프로틴 밀크", "바닐라 프로틴 밀크", "사과리치 콜라겐 워터", "쌍화차", "생강차", "달고나 라떼","흑당 라떼","버블 흑당 라떼","버블 크림 밀크티")
//    var beverageCost = mutableListOf<Int>(3800,3800,4800,3900,3900,3500,4300,4300,4300)

    var beverage = mutableListOf<MutableList<Any>>(mutableListOf("카라멜 프로틴 밀크",3800), mutableListOf("바닐라 프로틴 밀크",3800),mutableListOf("사과리치 콜라겐 워터",4800),mutableListOf("쌍화차",3900),mutableListOf("생강차",3900),mutableListOf("달고나 라떼",3500),mutableListOf("흑당 라떼",4300), mutableListOf("버블 흑당 라떼",4300), mutableListOf("버블 크림 라떼",4300))



    var coffee = mutableListOf<MutableList<Any>>(mutableListOf("아인슈페너",3700),mutableListOf("콜드브루 라떼",4200),mutableListOf("콜드브루 화이트비엔나",4500),mutableListOf("콜드브루 니트로",3900),mutableListOf("흑당 콜드브루",3700))

    var tea = mutableListOf<MutableList<Any>>(mutableListOf("포스틱 밀크 쉐이크",4800), mutableListOf("오리진 쉐이크",4300), mutableListOf("초코 쿠키쉐이크",4500), mutableListOf("딸기 쉐이크",4700),mutableListOf("레몬 에이드",3800),mutableListOf("자몽 에이드",3800))

    var iceFlake = mutableListOf<MutableList<Any>>(mutableListOf("팥인절미 1인빙수",5400),mutableListOf("망고요거트 1인빙수",5400),mutableListOf("망고샤베트 빙수",10800),mutableListOf("딸기 치즈빙수",10800) ,mutableListOf("인절미 치즈빙수",10800))

    var rtd = mutableListOf<MutableList<Any>>(mutableListOf("이디야 청포도&케일 주스",3400),mutableListOf("이디야 감귤&한라봉 주스",3400),mutableListOf("이디야 사과&당근 주스",3400),mutableListOf("이디야 콤부차 복숭아망고",3400),mutableListOf("이디야 콤부차 청포도레몬",3400))

    var topping = mutableListOf<MutableList<Any>>(mutableListOf("에스프레소 샷",500),mutableListOf("휘핑크림",500), mutableListOf("초콜릿칩",500),mutableListOf("타피오카 펄",1000),mutableListOf("시럽",500),mutableListOf("토핑(카라멜,초콜릿)",300))

    var categoryList = listOf(beverage,coffee,tea,iceFlake,rtd)
//    var costList = listOf(beverageCost,coffeeCost,teaCost,iceFlakeCost,rtdCost)

    init {
    }
}
