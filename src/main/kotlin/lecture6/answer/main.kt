//package main.kotlin.lecture6.answer
//
//
//fun main(){
//    val kim = Customer()
//
//    kim.name = "이규호"
//    kim.phoneNumber = "010-2190-1578"
//    kim.email = "dlrbgh@ideadesignlab.kr"
//    kim.allowMarketing = false
//
//    val kimsAccount = arrayListOf<Withdrawal>()
//    val kimsFirstWithdrawl = Withdrawal()   // A
//    var kimsSecondWithdrawal = Withdrawal() // B
//
//    kimsFirstWithdrawl.accountNumber = "3333-01-0001"
//    kimsFirstWithdrawl.isOpen = true
//    kimsFirstWithdrawl.openDate = "2023-07-10"
//
//    kimsAccount.add(kimsFirstWithdrawl)
//
//    kimsSecondWithdrawal.accountNumber = "3333-01-0002"
//    kimsSecondWithdrawal.isOpen= false
//    kimsSecondWithdrawal.openDate = "2020-07-10"
//
//    val incomeAccountHistory = AccountHistory()
//    incomeAccountHistory.isIncome = true
//    incomeAccountHistory.name = "김철수"
//    incomeAccountHistory.date = "2020-07-15"
//    incomeAccountHistory.howmuch = 50000000
//
//    kimsSecondWithdrawal.history.add(incomeAccountHistory)
//
//    val outcomeAccountHistory = AccountHistory()
//    outcomeAccountHistory.isIncome = false
//    outcomeAccountHistory.name = "김철수"
//    outcomeAccountHistory.date = "2023-07-10"
//    outcomeAccountHistory.howmuch = 50000000
//
//    kimsSecondWithdrawal.history.add(outcomeAccountHistory)
//    kimsAccount.add(kimsSecondWithdrawal)
//
//    kim.accounts = kimsAccount
//}