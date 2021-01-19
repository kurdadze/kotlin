fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50)
    returnVal(array)
}

fun returnVal(listOfInt: IntArray) {
//    ახალი მასივის გამოცხადება, რომელიც დაფორმატებული მონაცემებით შეივსება
    val newList = ArrayList<String>()
    var tmpIfStr = ""
    var tmpWhenStr = ""
    for (i in listOfInt) {
//        when-ის სინტაქსი
        tmpWhenStr = when {
            i % 3 == 0 && i % 5 == 0 -> "(${i}).Buzz-Fizz"
            i % 3 == 0 -> "(${i}).Buzz"
            i % 5 == 0 -> "(${i}).Fizz"
            else -> i.toString()
        }
//        if-ის სინტაქსი
        tmpIfStr =
            if (i % 3 == 0 && i % 5 == 0) "(${i}).Buzz-Fizz"
            else if (i % 3 == 0) "(${i}).Buzz"
            else if (i % 5 == 0) "(${i}).Fizz"
            else i.toString()

//        ახალ მასივში დაფორმატებული მონაცემების დამატება
        newList.add(tmpIfStr)
        print("${tmpWhenStr}, ")
    }
}