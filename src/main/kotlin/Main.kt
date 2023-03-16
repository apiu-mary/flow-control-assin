fun main() {
    numbers()
    var w =(names(arrayOf("Glorial","MaryAp" ,"Apiu")))
    println(w)
    drinks(9)
    drinks(4)
    drinks(19)
    print()


}

fun numbers() {
    var z = 1..100

    for (z in z) {
        if ( z%2!=0){
            println(z)

        }
    }

    }
fun names(name:Array<String>):Int {
    var work =0
    for (x in name) {
        if (x.length >5) {
            work++

    }
    }
        return work
}
fun drinks(age:Int){

 when(age){
    in 0..5 -> println("milk")
    in 7..14-> println("fanta-orange")
    else-> println("cocacola")

}}
fun print(){
   for (num in 1..100){
       when{
           num %3==0 && num%5==0-> println("fizbuzz")
           num %3==0-> println("buzz")
           num %5==0-> println("fiz")

           else-> println(num)
       }

   }   }



