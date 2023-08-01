package main.kotlin.lect10before.answer

/**
 * 3. 1번, 2번의 데이터를 사용해서 Person 이라는 객체를 만듭니다.
 * Person의 객체에는 이름/소속/나이/사는곳/생년월일(yyyy-MM-dd)/전화번호/이메일
 * 취미(1개 이상)/좋아하는 노래(1개 이상)/이번주 로또 예상번호(6개)
 * 의 속성이 들어갈 수 있으며
 * 객체화된 Person에 데이터를 입력하고 배열에 추가하여
 * 객체화된 데이터를 다음처럼 출력하세요
 *
 * 이름: 이규호
 * 소속: 주식회사 아이들
 * 사는곳: 강원도 춘천시 교동..
 * 생년월일: 1990-01-01
 * 전화번호: 010-2190-1578
 * 이메일: dlrbgh@ideadesignlab.kr
 * 제 취미는 잠자기, 프로그래밍, 누워있기총 3개 입니다
 * 제가 좋아하는 노래는 자우림의 샤이닝, nell의 stay총 2개 입니다
 * 이번주에는 1, 35, 17, 23, 28, 43이 1등일것 같습니다
 *
 * 클래스의 선언은 아래와 같이 선언합니다
 * class Person{
 *  ...
 * }
 */
fun main() {
    val leeGyuHo = Person()
    leeGyuHo.name = "이규호"
    leeGyuHo.associated = "주식회사 아이들"
    leeGyuHo.address = "강원도 춘천시 교동.."
    leeGyuHo.birth = "1990-01-01"
    leeGyuHo.phoneNumber = "010-2190-1578"
    leeGyuHo.email = "dlrbgh@ideadesignlab.kr"

    leeGyuHo.hobby = arrayOf("잠자기", "프로그래밍", "누워있기")
    leeGyuHo.favoriteSong = arrayOf("자우림의 샤이닝", "nell의 stay")
    leeGyuHo.lotto = arrayOf(1, 35, 17, 23, 28, 43)

    val personArray = arrayOf(leeGyuHo)

    for (person in personArray) {
        println(person.toString())
    }
}

class Person() {
    var name = ""
    var associated = ""
    var address = ""
    var birth = ""
    var phoneNumber = ""
    var email = ""

    var hobby = arrayOf<String>()
    var favoriteSong = arrayOf<String>()
    var lotto = arrayOf<Int>()

    override fun toString(): String {

        var returnString = "";

        returnString += "이름 ${this.name}\n"
        returnString += "소속 ${this.associated}\n"

        returnString += "..."

        returnString += "이번주에는 ${this.lotto.joinToString(", ")} 이 1등일것 같습니다"


        return returnString
    }
}