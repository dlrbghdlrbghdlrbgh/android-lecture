/**
 * 실습(3): 숫자 배열의 값을 10씩 늘리기
 */
fun main() {

    val intArray = arrayOf(1,2,3,4)

    var index = 0

    // 10: 35분까지
    println(intArray[index++])
    println(intArray[index++])
    println(intArray[index++])
    println(intArray[index++])

    /**
     * 코드를 완성해서 intArray값을 10 씩 늘려주세요
     */
    intArray[0] = 11
    intArray[1] = 12
    intArray[2] = 13
    intArray[3] = 14

    index = 0
    intArray[index++] = 10+index
    intArray[index++] = 10+index
    intArray[index++] = 10+index
    intArray[index++] = 10+index


    index = 0


    println(intArray[index++])  // 원래의 값에서 10씩 늘어난 코드가 출력됩니다
    println(intArray[index++])  // 원래의 값에서 10씩 늘어난 코드가 출력됩니다
    println(intArray[index++])  // 원래의 값에서 10씩 늘어난 코드가 출력됩니다
    println(intArray[index++])  // 원래의 값에서 10씩 늘어난 코드가 출력됩니다

}