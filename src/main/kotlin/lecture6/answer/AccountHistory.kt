package main.kotlin.lecture6.answer

/**
 * 계좌 입출금 내역
 *
 * 누군가가 계좌에서 입금 혹은 출금을 할 때 발생하는 데이터입니다.
 * 속성으로는 입/출금 여부, 입금/출금자명, 입/출금 날짜, 금액이 있습니다.
 */
class AccountHistory {
    /**
     * 입출금 여부. true: 입금, false: 출금
     */
    var isIncome: Boolean = false

    /**
     * 입/출금자명
     */
    var name: String = ""

    /**
     * 입/출금날짜
     */
    var date: String = ""

    /**
     * 입/출금금액
     */
    var howmuch: Int = 0
}