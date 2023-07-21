/**
 * 배열을 선언하는 방법
 * - arrayOf(…)를 사용
 * - 우측 예시 외에도 여러가지를섞어서 만들 수 있다
 */
fun main() {

	val intArray = arrayOf(1,2,3)

    val stringArray = arrayOf("이", "규", "호")

    val booleanArray = arrayOf(true, false, true)

    // 배열의 값을 수정하는방법

    println(intArray[0]) // 1
    intArray[0] = 10
    println(intArray[0]) // 10
 }
