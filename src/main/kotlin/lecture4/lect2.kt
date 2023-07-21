///**
// * 배열의 내용을 갖고 오는 방법
// * - [숫자 데이터] 를 사용해서배열에 담긴 값을 갖고올 수 있다
// * - size라는 특수한 값을사용할 수 있다
// */
//fun main() {
//
//    //https://github.com/dlrbghdlrbghdlrbgh/android-lecture.git
//    val intArray = arrayOf(1, 2, 3)  // 앞에서부터 0번째, 1번째 ...번째 인덱스
//
//    var index = 0;
//    println(intArray[0])    // 0번째 인덱스에 저장된 값을 출력하라
//    println(intArray[index])
//
//    println(intArray[1])    // 1번째 인덱스에 저장된 값을 출력하라
//    println(intArray[++index])
//
//    println(intArray[2])    // 2번째 인덱스에 저장된 값을 출력하라
//    println(intArray[++index])
//
//    index = 0;
//    println(intArray[index++])
//    println(intArray[index++])
//    println(intArray[index++])
//
//
//    println(intArray.size)    // 배열의 크기를 반환
//
//    println(intArray[2])    // 최대 인덱스는 배열의 크기보다 하나 작다
//
//    println(intArray[2] == intArray[intArray.size - 1]) // 다음과 같은 연산이 가능하다
//
//}