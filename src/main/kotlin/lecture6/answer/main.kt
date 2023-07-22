package main.kotlin.lecture6.answer

fun main(){
    val hong = Customer()
    val kim = Customer()

    hong.name = "홍길동"
    hong.email = "hong@email.com"
    hong.phoneNumber = "010-0000-0000"
    hong.allowMarketing = true

    val hongsAccount = arrayListOf<Withdrawal>()
    val hongsFirstAccount = Withdrawal()
    hongsFirstAccount.accountNumber = "000-000-000"
    hongsFirstAccount.isOpen = true
    hongsFirstAccount.owner = "홍길동"
    hongsFirstAccount.openDate = "2023-07-22"
    hongsAccount.add(hongsFirstAccount)

    hong.accounts = hongsAccount;



}