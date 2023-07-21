/**
 * 실습(1): 배열의 값 갖고오기
 * - 배열의 값을 갖고오는 []에는변수를 넣을 수 있다
 *
 */
fun main() {


    val intArray = arrayOf(0, 1, 2, 3, 4)
    var index = 0   // * - 변수 index를 선언하고 0을 넣은뒤

    println( intArray [index++])
    println( intArray [index++])
    println( intArray [index++])
    println( intArray [index++])
    println( intArray [index++])

    index = 0
    while( index < intArray.size){
        println(intArray[index++])
    }

}