package main.kotlin.lecture6.answer

/**
 * 고객 객체를 만드는 클래스
 *
 * 고객의 정보에는 이름, 전화번호, 이메일, 소유 계좌정보,
 * 마케팅 정보 수신 동의여부가 있습니다.
 *
 * 1. 고객은 은행을 통해 최초 계좌를 개설할 때 이름/전화번호/이메일/마케팅 정보 수신 동의여부 결정합니다
 * 2. 고객은 여러개의 계좌를 생성할 수 있습니다.
 * 3. 계좌를 해지하여 삭제할 수 있습니다.
 */
class Customer {
    /**
     * 고객명
     */
    var name: String = ""

    /**
     * 전화번호
     */
    var phoneNumber: String = ""

    /**
     * 이메일
     */
    var email: String = ""

    /**
     * 마케팅수신여부
     */
    var allowMarketing: Boolean = false

    /**
     * 소유계좌
     */
    var accounts: ArrayList<Withdrawal> = arrayListOf()
}