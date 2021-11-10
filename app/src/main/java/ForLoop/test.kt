package ForLoop

fun IterateThroughRange_loop(){

    for(i in 1..5) print(i) // 1 2 3 4 5
    println()
    for (i in 5 downTo 1) print(i) // 5 4 3 2 1
    println()
    for (i in 1..5 step 2) print(i) //1 3 5
    println()
    for (i in 5 downTo 1 step 2) print(i) // 5 3 1
}

fun IteratingThrough_Array(){

    var array1 = arrayOf("a","s","d","f","g","h")

    for(i in array1) println(i)

    for(j in array1.indices){   //iterate through an array with an index
        if(j % 2 == 0) println(array1[j])
    }
}

fun IteratingThrough_String() {

    var text = "Aparna"
    for(i in text) println(i)
    for(j in text.indices){  //  iterate through a String with an index
       if(text[j].equals('r')) {
           println("This will print ${text[j]}")
       }
    }
}
fun main(){
    IterateThroughRange_loop()
    IteratingThrough_Array()
    IteratingThrough_String()
}