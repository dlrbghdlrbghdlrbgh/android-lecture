package main.kotlin.lect10before.answer

/**
 * 4. 아래 코드는 편의점에 들어온 신선식품의 유통기한을 출력하는 예제입니다.
 * 출력되는 날짜가 오늘 현재시간보다 작을경우 유지, 현재시간보다 같거나 클경우
 * 폐기가 출력되도록 코드를 추가하세요
 * 현재시간이 14:00:00일 때
 * ex) product-1의 유통기한은 2023-07-29 13:59:59 까지 판매 가능합니다.(폐기)
 * ex) product-1의 유통기한은 2023-07-29 14:00:00 까지 판매 가능합니다.(유지)
 */
fun main() {
    val product = getFreshProductsInRefrigerator()

    val currentHour = 14
    val currentMinute = 30
    val currentSecond = 0

    for (i: Int in 0 until product.size) {
        print("${product[i].productCode}의 유통기한은 ${product[i].getExpireDate()} 까지 판매 가능합니다")
        if (product[i].expireHour > currentHour) {
            println("(폐기)")
        } else if (product[i].expireHour == currentHour
            && product[i].expireMinute > currentMinute
        ) {
            println("(폐기)")
        } else if (product[i].expireHour == currentHour
            && product[i].expireMinute == currentMinute
            && product[i].expireSecond >= currentSecond
        ) {
            println("(폐기)")
        } else {
            println("(유지)")
        }
    }
}

/**
 * 냉장고에있는 신선식품 목록을 반환하는 함수
 */
fun getFreshProductsInRefrigerator(): Array<FreshProduct> {
    return arrayOf(
        FreshProduct(),
        FreshProduct(),
        FreshProduct(),
        FreshProduct(),
        FreshProduct(),
        FreshProduct(),
        FreshProduct(),
    ).apply {
        forEachIndexed { index, freshProduct ->
            freshProduct.productCode = "product-${index + 1}"
        }
    }
}

/**
 * 신선식품 객체 선언
 */
class FreshProduct() {
    /**
     * 10보다 작은 수에 0을 붙여 반환한다
     */
    private fun addZeroItLessThen10(number: Int): String {
        if (number < 10) {
            return "0${number}"
        } else {
            return "${number}"
        }
    }

    /**
     * 유통기한을 yyyy-MM-dd hh:mm:ss형식으로 반환한다
     */
    fun getExpireDate(): String {
        val month = addZeroItLessThen10(this.expireMonth)
        val day = addZeroItLessThen10(this.expireDay)
        val hour = addZeroItLessThen10(this.expireHour)
        val minute = addZeroItLessThen10(this.expireMinute)
        val second = addZeroItLessThen10(this.expireSecond)
        return "${this.expireYear}-${month}-${day} ${hour}:${minute}:${second}"
    }

    var productCode: String = ""
    var expireYear: Int = 2023
    var expireMonth: Int = 7
    var expireDay: Int = 29
    var expireHour: Int = (13..15).random()
    var expireMinute: Int = (0..59).random()
    var expireSecond: Int = (0..59).random()
}