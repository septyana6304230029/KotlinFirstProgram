fun main(args: Array<String>) {

//Array
    var arrA = arrayOf<Int>()
    arrA += 34 //x = x +34 => menjadi operator append array menambahkan
    println(arrA[0])
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }
    for (i in arrB) {
        print("$i ")
    }
}