fun main()
{
    print("Enter the first number : ")
    val a = readln().toInt()
    print("Enter the operator : ")
    val op = readln()
    print("Enter the second number : ")
    val b = readln().toInt()
     val result =  when (op) {
           "+" ->  a + b
           "-" ->  a - b
           "*" ->  a * b
           "/" ->{
               if(b==0){
                   println ("Second number can not be zero")
                   return
               }
               a / b
           }

           else -> {
               println("Invalid operator")
               return
           }
       }
        println("Result is : $result")

}