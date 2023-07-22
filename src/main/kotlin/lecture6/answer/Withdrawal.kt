package main.kotlin.lecture6.answer

/**
 * 입출금 계좌
 * 입출금 계좌에는 예금주, 계좌번호, 잔액, 입출금 내역, 개설일, 계좌 해지여부의 속성을 갖습니다
 *
 * 1. 은행에서 고객(Customer)가 계좌를 개설하면 생성됩니다.
 * 2. 계좌 개설시 예금주, 계좌번호, 개설일, 계좌 해지여부를 정하게됩니다
 * 3. 누군가가 입출금 계좌에 입금을 하거나 예금주가 출금을 하게 되면 입출금 내역이 발생하고 기록됩니다.
 */
class Withdrawal {
    /**
     * 예금주
     */
    var owner: String = ""

    /**
     * 계좌번호
     */
    var accountNumber: String = ""

    /**
     * 계설일시
     */
    var openDate: String = ""

    /**
     * 계좌해지여부액
     */
    var isOpen: Boolean = true

    /**
     * 입출금 내역
     */
    var history: ArrayList<AccountHistory> = arrayListOf()
}
