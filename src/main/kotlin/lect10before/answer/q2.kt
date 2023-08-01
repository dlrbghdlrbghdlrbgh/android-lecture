// package main.kotlin.lect10before.answer
//
///**
// * 2. 다음의 정보를 배열로 선언하고 출력하세요
// * - 본인의 취미(1개 이상)/좋아하는 노래(1개 이상)/이번주 로또 예상번호(6개)
// * 각각의 데이터타입에 맞게 배열로 선언
// *
// * - 배열로 선언한 변수를 반복문을 사용하여 다음과 같이 출력하세요
// * 제 취미는 잠자기, 프로그래밍, 누워있기 총 3개 입니다
// * 제가 좋아하는 노래는 자우림의 샤이닝, nell의 stay 총 2개 입니다
// * 이번주에는 1, 35, 17, 23, 28, 43 이 1등일것같습니다
// *
// * for(i : Int in 0..배열.size-1){
// *  println(...)
// * }
// */
//fun main(){
//    val hobby = arrayOf("잠자기", "프로그래밍", "누워있기")
//    val favoriteSong = arrayOf("자우림의 샤이닝", "nell의 stay")
//    val lotto = arrayOf(1, 35, 17, 23, 28, 43)
//
//    print("제 취미는 ")
//    for (i: Int in 0..hobby.size -1){
//        print(hobby[i])
//        if(i !== hobby.size -1){
//            print(", ")
//        }
//    }
//    println("총 ${hobby.size}개 입니다")
//
//    print("제가 좋아하는 노래는 ")
//    for (i: Int in 0 until favoriteSong.size){
//        print(favoriteSong[i])
//        if(i !== favoriteSong.size -1){
//            print(", ")
//        }
//    }
//    println("총 ${favoriteSong.size}개 입니다")
//
//    print("이번주에는 ")
//    print(lotto.joinToString(", "))
//    println("이 1등일것 같습니다")
//}