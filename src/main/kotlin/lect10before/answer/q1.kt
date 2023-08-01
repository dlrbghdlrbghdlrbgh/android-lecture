package main.kotlin.lect10before.answer

/**
 * 1. 본인의 정보를 변수에 할당/선언 하고 출력하세요
 * - 다음의 정보가 변수에
 * 이름/소속/나이/사는곳/생년월일(yyyy-MM-dd)/전화번호/이메일
 *
 * - print, println함수를 사용하여 다음의 형식으로 출력하세요
 * 이름: 이규호(33)
 * 소속: 주식회사 아이들
 * 사는곳: 강원도 춘천시 교동 ...
 * 생년월일: 1990-01-01
 * 전화번호: 010-2190-1578
 * 이메일: dlrbgh@ideadesignlab.kr
 */
fun main(){
    var name: String = "이규호"
    var associated: String = "주식회사 아이들"
    var address: String = "강원도 춘천시 교동.."
    var birth: String = "1990-01-01"
    var phoneNumber: String = "010-2190-1578"
    var email: String = "dlrbgh@ideadesignlab.kr"

    println("이름: ${name}")
    println("소속: ${associated}")
    println("사는곳: ${address}")
    println("생년월일: ${birth}")
    println("전화번호: ${phoneNumber}")
    println("이메일: ${email}")
}